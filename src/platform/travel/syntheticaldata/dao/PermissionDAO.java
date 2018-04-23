package platform.travel.syntheticaldata.dao;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import platform.travel.syntheticaldata.entity.Permission;

public class PermissionDAO {

	public static Permission findPermissionById(int id) throws IOException {
		SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();
		PermissionMapper permissionMapper = sqlSession.getMapper(PermissionMapper.class);
		Permission permission = permissionMapper.findPermissionById(id);
		sqlSession.close();
		return permission;
	}

	public static void insertPermission(Permission permission) throws IOException {
		SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();
		PermissionMapper permissionMapper = sqlSession.getMapper(PermissionMapper.class);
		permissionMapper.insertPermission(permission);
		sqlSession.commit();
		sqlSession.close();
	}

	public static void deletePermissionTest(int id) throws IOException {
		SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();
		PermissionMapper permissionMapper = sqlSession.getMapper(PermissionMapper.class);
		permissionMapper.deletePermission( id );
		sqlSession.commit();
		sqlSession.close();
	}

}
