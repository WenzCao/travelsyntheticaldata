package platform.travel.syntheticaldata.dao;

import java.io.IOException;

import org.apache.ibatis.annotations.Param;

import platform.travel.syntheticaldata.entity.User;  

public interface UserMapper {
  
    public User findUserById(@Param("userId")int id) throws IOException;
    public int isUserExcit(@Param("userName")String username, @Param("pwd")String pwd) throws IOException;
    
    public void insertUser(User user) throws IOException;

    public void deleteUser(@Param("userId")int id) throws IOException;
    
    public void updateUser(User user) throws IOException;
}
