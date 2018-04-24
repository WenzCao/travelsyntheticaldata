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
import platform.travel.syntheticaldata.dao.UserMapper;
import platform.travel.syntheticaldata.entity.Group;
import platform.travel.syntheticaldata.entity.Permission;
import platform.travel.syntheticaldata.entity.User;  

public class UserTest {
    
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.findUserById(1);
		System.out.println(user.getName());
		System.out.println(user.isActive());
		System.out.println(user.getGroup().getName());
		System.out.println(user.getGroup().getPermissions().get(0));
		
		int n = userMapper.isUserExcit("admin", "admin");
		System.out.println(n);
		n = userMapper.isUserExcit("admin", "1234");
		System.out.println(n);
		
		//user.setActive(false);
		//user.setPhone("13735526905");
		//userMapper.updateUser(user);
		//sqlSession.commit();
		
		userMapper.deleteUser(2);
		sqlSession.commit();
			
		//userMapper.insertUser(user);
		//sqlSession.commit();
		
		sqlSession.close();
		
	}

}
