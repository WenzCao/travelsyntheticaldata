package platform.travel.testunit;


import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;  
import org.apache.ibatis.session.SqlSession;  
import org.apache.ibatis.session.SqlSessionFactory;  
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import platform.travel.syntheticaldata.PermissionOpt;
import platform.travel.syntheticaldata.dao.GroupMapper;
import platform.travel.syntheticaldata.dao.PermissionMapper;
import platform.travel.syntheticaldata.dao.TravelSqlSessionFactory;
import platform.travel.syntheticaldata.entity.Group;
import platform.travel.syntheticaldata.entity.Permission;  

public class GroupTest {
    
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();
		GroupMapper groupMapper = sqlSession.getMapper(GroupMapper.class);
		//Group group = groupMapper.findGroupById(1);
		//System.out.println(group.getName());
		//System.out.println(group.getPermissions().get(0));
		
		int n = groupMapper.isPermissionInGroup(1, 2);
		System.out.println(n);
		
		//groupMapper.updateGroupName(1, "changedName");
		//sqlSession.commit();
		
		//groupMapper.deletePermissionFromGroup(1, 2);
		//sqlSession.commit();
			
		//groupMapper.insertPermissionToGroup(1, 2);
		//sqlSession.commit();
		
		sqlSession.close();
		
	}

}
