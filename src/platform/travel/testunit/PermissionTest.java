package platform.travel.testunit;


import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;  
import org.apache.ibatis.session.SqlSession;  
import org.apache.ibatis.session.SqlSessionFactory;  
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import platform.travel.syntheticaldata.PermissionOpt;
import platform.travel.syntheticaldata.dao.PermissionMapper;
import platform.travel.syntheticaldata.dao.TravelSqlSessionFactory;
import platform.travel.syntheticaldata.entity.Permission;  

public class PermissionTest {
	
	/*
	public SqlSessionFactory getSqlSessionFactory() throws IOException {  
        String resource = "SqlMappingConfig.xml";  
        InputStream inputStream = Resources.getResourceAsStream(resource);  
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);  
        return sqlSessionFactory;  
    }
  
    public void findPermissionByIdTest() throws IOException {
        SqlSession sqlSession = this.getSqlSessionFactory().openSession();  
        Permission permission = sqlSession.selectOne("permission.findPermissionById", 1);  
        System.out.println(permission);  
        sqlSession.close();  
    }
    
    public void insertPermissionTest() throws IOException {  
        SqlSession sqlSession = this.getSqlSessionFactory().openSession();  
        Permission permission = new Permission();  
        permission.setName("permission_delete");
        permission.setTablename("permission");
        permission.setOptype(PermissionOpt.DELETE);
  
        sqlSession.insert("permission.insertPermission", permission);  
        sqlSession.commit();  
        System.out.println(permission.getId());  
        sqlSession.close(); 
    } 

    public void deletePermissionTest() throws IOException {  
        SqlSession sqlSession = this.getSqlSessionFactory().openSession();  
        sqlSession.delete("permission.deletePermission", 2);  
        sqlSession.commit();  
        sqlSession.close();  
    }  */
    
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		PermissionTest test = new PermissionTest();
//		SqlSession sqlSession = test.getSqlSessionFactory().openSession();  
//		PermissionMapper userMapper = sqlSession.getMapper(PermissionMapper.class);
		
		PermissionMapper userMapper = (PermissionMapper) TravelSqlSessionFactory.Instance().getSqlMapper(PermissionMapper.class);
		Permission permission = userMapper.findPermissionById(1);
		System.out.println(permission);
		
//		Permission new_permission = new Permission();  
//		new_permission.setName("permission_delete");
//		new_permission.setTablename("permission");
//		new_permission.setOptype(PermissionOpt.DELETE);
//		userMapper.insertPermission(new_permission);
//		System.out.println(new_permission.getId());
        
		//test.findPermissionByIdTest();
		//test.insertPermissionTest();
		//test.deletePermissionTest();
	}

}
