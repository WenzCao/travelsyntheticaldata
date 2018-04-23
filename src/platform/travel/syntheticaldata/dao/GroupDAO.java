package platform.travel.syntheticaldata.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import platform.travel.syntheticaldata.entity.Group;
import platform.travel.syntheticaldata.entity.Permission;

public class GroupDAO {

	public static Group findGroupById(int id) throws IOException {
		SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();
		GroupMapper groupMapper = sqlSession.getMapper(GroupMapper.class);
		Group group = groupMapper.findGroupById(id);
		sqlSession.close();
		return group;
	}
	
	public static boolean isPermissionInGroup(int gid, int pid) throws IOException {
		SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();
		GroupMapper groupMapper = sqlSession.getMapper(GroupMapper.class);
		int num = groupMapper.isPermissionInGroup(gid, pid);
		sqlSession.close();
		
		boolean ret = false;
		if (num != 0) 
			ret = true;
		return ret;
	}
	
	public static boolean isPermissionInGroup(Group group, int pid) throws IOException {
		List<Permission> permissions = group.getPermissions();
		for (Permission ent : permissions) {
			if (ent.getId() == pid)
				return true;
		}
		return false;
	}
	
	public static boolean isPermissionInGroup(Group group, Permission permission) throws IOException {
		return GroupDAO.isPermissionInGroup(group, permission.getId());
	}

	public static void addPermissionInGroup(Group group, Permission permission) throws IOException {
		SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();
		GroupMapper groupMapper = sqlSession.getMapper(GroupMapper.class);
		groupMapper.insertPermissionToGroup(group.getId(), permission.getId());
		sqlSession.commit();
		sqlSession.close();
		
		group.addPermission(permission);
	}
	
	public static void removePermissionFromGroup(Group group, Permission permission) throws IOException {
		SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();
		GroupMapper groupMapper = sqlSession.getMapper(GroupMapper.class);
		groupMapper.deletePermissionFromGroup(group.getId(), permission.getId());
		sqlSession.commit();
		sqlSession.close();
		
		group.removePermission(permission);
	}
	
	public void insertGroup(Group group) throws IOException {
		SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();
		GroupMapper groupMapper = sqlSession.getMapper(GroupMapper.class);
		groupMapper.insertGroup(group);
		//sqlSession.commit();
		
		List<Permission> permissions = group.getPermissions();
		for (Permission ent : permissions) {
			groupMapper.insertPermissionToGroup(group.getId(), ent.getId());
		}
		
		sqlSession.commit();
		sqlSession.close();
	}

	public void deleteGroup(int id) throws IOException {
		SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();
		GroupMapper groupMapper = sqlSession.getMapper(GroupMapper.class);
		groupMapper.deleteGroup(id);
		sqlSession.commit();
		sqlSession.close();
	}
	
	public void updateGroupName(Group group, String name) throws IOException {
		SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();
		GroupMapper groupMapper = sqlSession.getMapper(GroupMapper.class);
		groupMapper.updateGroupName(group.getId(), name);
		sqlSession.commit();
		sqlSession.close();
		
		group.setName(name);
	}

}
