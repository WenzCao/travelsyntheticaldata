package platform.travel.syntheticaldata;

public enum PermissionOpt {
	ADD(1, "���"), 
	DELETE(2, "ɾ��"),
	SELECT(4, "����"),
	UPDATE(8, "�޸�");

	private String desc;
	private int optype;

	private PermissionOpt(int type, String desc) {
		this.desc = desc;
		this.optype = type;
	}

	public String getDesc() {
		return desc;
	}
	
	public int  getOptype() {
		return optype;
	}
	
	public static PermissionOpt getPermissionOpt(int tid) {
		switch (tid) {
		case 1:
			return PermissionOpt.ADD;
		case 2:
			return PermissionOpt.DELETE;
		case 3:
			return PermissionOpt.SELECT;
		case 4:
			return PermissionOpt.UPDATE;
		}
		return null;
	}
}
