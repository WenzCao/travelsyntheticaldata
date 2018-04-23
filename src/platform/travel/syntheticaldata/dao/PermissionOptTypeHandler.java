package platform.travel.syntheticaldata.dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import platform.travel.syntheticaldata.PermissionOpt;

/**
 * @author change PermissionOpt in java To int in jdbc
 */
public class PermissionOptTypeHandler implements TypeHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.ResultSet,
	 * java.lang.String)
	 */
	@Override
	public Object getResult(ResultSet rs, String columnName) throws SQLException {
		int columnValue = rs.getInt(columnName);
		return PermissionOpt.getPermissionOpt(columnValue);
	}

	@Override
	public Object getResult(CallableStatement cs, int columnIndex) throws SQLException {
		int columnValue = cs.getInt(columnIndex);
		return PermissionOpt.getPermissionOpt(columnValue);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.CallableStatement,
	 * int)
	 */
	@Override
	public Object getResult(ResultSet rs, int columnIndex) throws SQLException {
		int columnValue = rs.getInt(columnIndex);
		return PermissionOpt.getPermissionOpt(columnValue);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.ibatis.type.TypeHandler#setParameter(java.sql.PreparedStatement,
	 * int, java.lang.Object, org.apache.ibatis.type.JdbcType)
	 */
	@Override
	public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
		if (parameter == null)
			ps.setInt(i, 0);
		else {
			PermissionOpt value = (PermissionOpt) parameter;
			ps.setInt(i, value.getOptype());
		}
	}

}