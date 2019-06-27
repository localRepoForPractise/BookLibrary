package com.springframework.maindao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.springframework.loginController.Login;

public class LoginRowMapper implements RowMapper<Login>{
	@Override
	public Login mapRow(ResultSet arg0, int arg1) throws SQLException {
		Login objLogin = new Login();
		objLogin.setUserId(arg0.getInt("USER_ID"));
		objLogin.setLastUpdatedDateTime(arg0.getDate("LAST_UPDATED_TIME"));
		objLogin.setUserName(arg0.getString("USER_NAME"));
		objLogin.setUserName(arg0.getString("PASSWORD"));
		return objLogin;
	}
}
