package platform.travel.syntheticaldata.dao;


import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;  
import org.apache.ibatis.session.SqlSession;  
import org.apache.ibatis.session.SqlSessionFactory;  
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import platform.travel.syntheticaldata.PermissionOpt;
import platform.travel.syntheticaldata.entity.Permission;  

public class PermissionDAO {
  
    public Permission findPermissionById(int id) throws IOException {  
        SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();  
        Permission permission = sqlSession.selectOne("permission.findPermissionById", id);  
        sqlSession.close(); 
        return permission;
    }
    
    public void insertPermission(Permission permission) throws IOException {  
        SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();  
        // Permission permission = new Permission();  
        // permission.setName("permission_delete");
        // permission.setTablename("permission");
        // permission.setOptype(PermissionOpt.DELETE);
  
        sqlSession.insert("permission.insertPermission", permission);  
        sqlSession.commit();  
        System.out.println(permission.getId());  
        sqlSession.close(); 
    } 

    public void deletePermissionTest(int id) throws IOException {  
        SqlSession sqlSession = TravelSqlSessionFactory.Instance().getSqlSession();  
        sqlSession.delete("permission.deletePermission", id);  
        sqlSession.commit();  
        sqlSession.close();  
    } 
    
}
