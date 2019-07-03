package com.springframework.maindao;

import java.util.Collections;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springframework.loginController.Login;
import com.springframework.maincontroller.Response;


@Repository("mainDao")
public class MainDaoImpl implements MainDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final Logger logger = Logger.getLogger(MainDaoImpl.class);

	public static final String CHECK_CONNECTION_QUERY = "SELECT COUNT(*) FROM STUDENT";

	public static final String UPDATE_TEST_VAR = "INSERT INTO STUDENT VALUES (?,?)";
	
	public static final String SELECT_LOGIN_DETAILS = "SELECT USER_ID, LAST_UPDATED_TIME ,USER_NAME ,PASSWORD FROM bl_book_users where USER_NAME = ? AND PASSWORD = ?";
	
	public static final String SAVE_LAST_UPDATED_TIME = "UPDATE bl_book_users SET LAST_UPDATED_TIME = Now() WHERE USER_ID = ?";
	/**To Check Connection with DataBase
	 * */
	public Response checkConnection() {
		logger.info("Processing request from Class : MainDaoImpl, Method: checkConnection");
		Response response = new Response();
		int count = jdbcTemplate.queryForObject(CHECK_CONNECTION_QUERY, Integer.class);
		System.out.println("**************** : " + count);
		if (count > 0)				
			response.setCode("200");		
		else
			response.setCode("500");
		return response;
	}

	@Override
	public Response testVariable(String testVariable) {
		Response response = new Response();
		int rowCount = jdbcTemplate.update(UPDATE_TEST_VAR,15,testVariable);
		if(rowCount >0)
			response.setCode("200");
		else 
			response.setCode("500");
		return response;
	}
	
	public Response submitLoginDetails(Login login) {
		System.out.println("******DAOI****");
		Response response = new Response();
		Login userDetails = jdbcTemplate.queryForObject(SELECT_LOGIN_DETAILS,new LoginRowMapper(),
				login.getUserName(),login.getPassword());
						
		System.out.println("User id " + userDetails.getUserId());
		System.out.println("last updated time " + userDetails.getLastUpdatedDateTime());
		
		if(userDetails != null)
		{
			int count = jdbcTemplate.update(SAVE_LAST_UPDATED_TIME , userDetails.getUserId());									
			response.setResponse("200", "SUCCESS", "SUCCESS", userDetails);
		}
		else 
			response.setResponse("500", "FAILURE", "FAILURE");
		return response;
	}
}
