package platform.travel.syntheticaldata;

public enum PermissionOpt {
	ADD(1, "Ìí¼Ó"), 
	DELETE(2, "É¾³ý"),
	SELECT(4, "²éÕÒ"),
	UPDATE(8, "ÐÞ¸Ä");

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
