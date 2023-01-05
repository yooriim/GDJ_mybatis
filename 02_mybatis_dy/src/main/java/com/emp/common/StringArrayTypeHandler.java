package com.emp.common;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class StringArrayTypeHandler implements TypeHandler<String[]> {

	@Override
	public String[] getResult(ResultSet rs, String col) throws SQLException {
												//컬럼명
		// TODO Auto-generated method stub
		
		return rs.getString(col).split(",");	//해당하는 컬럼명은 마이바티스가 알아서 넣어준당
	}

	@Override						
	public String[] getResult(ResultSet rs, int col) throws SQLException {
		// TODO Auto-generated method stub		//인덱스
	
		return rs.getString(col).split(",");
	}

	@Override
	public String[] getResult(CallableStatement arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return arg0.getString(arg1).split(",");
	}

	@Override	//pstmt ?에 값 넣는거 ㅋ
	public void setParameter(PreparedStatement pstmt, int index, String[] param, JdbcType arg3) throws SQLException {
		// TODO Auto-generated method stub						//인덱스번호랑 대입될 값
		
		if(param!=null) {
			pstmt.setString(index, String.join(",", param));
		}else {
			pstmt.setString(index, "");
			
		}
		
	}

}
