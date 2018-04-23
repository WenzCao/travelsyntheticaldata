package platform.travel.syntheticaldata.entity;

import java.util.List;

public class Group {
	private int id;
	private String name;
	private List<Permission> permissions;

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

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public void addPermission(Permission permission) {
		// TODO Auto-generated method stub
		this.permissions.add(permission);
	}

	public void removePermission(Permission permission) {
		// TODO Auto-generated method stub
		this.permissions.remove(permission);
	}

}
