package platform.travel.syntheticaldata.entity;

import platform.travel.syntheticaldata.PermissionOpt;

public class Permission {
	private int id;
	private String name;
	private String tablename;
	private PermissionOpt optype;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public PermissionOpt getOptype() {
		return optype;
	}

	public void setOptype(PermissionOpt optype) {
		this.optype = optype;
	}

	@Override  
    public String toString() {  
        return "Permission [id=" + id + ", name=" + name + ", tablename=" + tablename  
                + ", optype=" + optype.getDesc() + "]";  
    } 
}
