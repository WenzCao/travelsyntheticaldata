package platform.travel.syntheticaldata.dao;

import java.io.IOException;

import org.apache.ibatis.annotations.Param;

import platform.travel.syntheticaldata.entity.Group;
import platform.travel.syntheticaldata.entity.Permission;  

public interface GroupMapper {
  
    public Group findGroupById(int id) throws IOException;
    public int isPermissionInGroup(@Param("groupId")int gid, @Param("permissionId")int pid) throws IOException;
    
    public void insertGroup(Group group) throws IOException;
    public void insertPermissionToGroup(@Param("groupId")int gid, @Param("permissionId")int pid) throws IOException;
    
    public void deleteGroup(@Param("groupId")int gid) throws IOException;
    public void deletePermissionFromGroup(@Param("groupId")int gid, @Param("permissionId")int pid) throws IOException;
    
    public void updateGroupName(@Param("groupId")int id, @Param("groupName")String name) throws IOException;
    
}
