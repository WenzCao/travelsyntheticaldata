package platform.travel.syntheticaldata.dao;

import java.io.IOException;

import platform.travel.syntheticaldata.PermissionOpt;
import platform.travel.syntheticaldata.entity.Permission;  

public interface PermissionMapper {
  
    public Permission findPermissionById(int id) throws IOException;
    
    public void insertPermission(Permission permission) throws IOException;

    public void deletePermissionTest(int id) throws IOException;
    
}
