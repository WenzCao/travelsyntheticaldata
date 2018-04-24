package platform.travel.syntheticaldata.dao.typehandler;

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
public class BooleanTypeHandler implements TypeHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.ResultSet,
	 * java.lang.String)
	 */
	@Override
	public Object getResult(ResultSet rs, String columnName) throws SQLException {
		int columnValue = rs.getInt(columnName);
		boolean ret = false;
		if (columnValue != 0)
			ret = true;
		return ret;
	}

	@Override
	public Object getResult(CallableStatement cs, int columnIndex) throws SQLException {
		int columnValue = cs.getInt(columnIndex);
		boolean ret = false;
		if (columnValue != 0)
			ret = true;
		return ret;
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
		boolean ret = false;
		if (columnValue != 0)
			ret = true;
		return ret;
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
		boolean val = (boolean) parameter;
		if (val)
			ps.setInt(i, 1);
		else
			ps.setInt(i, 0);
	}
}