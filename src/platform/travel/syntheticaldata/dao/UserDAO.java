package platform.travel.syntheticaldata.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import platform.travel.syntheticaldata.entity.Group;
import platform.travel.syntheticaldata.entity.Permission;
import platform.travel.syntheticaldata.entity.User;

public class UserDAO {

	public static User findUserById(int id) throws IOException {
		SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.findUserById(id);
		sqlSession.close();
		return user;
	}
	
	public static boolean isUserExcit(String username, String pwd) throws IOException {
		SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		int flag = userMapper.isUserExcit(username, pwd);
		sqlSession.close();
		
		boolean ret = false;
		if (flag != 0) 
			ret = true;
		return ret;
	}
	
	public void insertUser(User user) throws IOException {
		SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		userMapper.insertUser(user);
		sqlSession.commit();
		sqlSession.close();
	}

	public void deleteUser(int id) throws IOException {
		SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		userMapper.deleteUser(id);
		sqlSession.commit();
		sqlSession.close();
	}
	
	public void updateUser(User user) throws IOException {
		SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		userMapper.updateUser(user);
		sqlSession.commit();
		sqlSession.close();
	}

}
