package com.springframework.SignUp.dao;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springframework.maincontroller.Response;
import com.springframework.mainmodel.SignUpDTO;

@Repository("signupDao")
public class SignUpdaoImpl implements SignUpdao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final Logger logger = Logger.getLogger(SignUpdaoImpl.class);

	
	//public static final String UPDATE_TEST_VAR1 = "INSERT INTO bl_book_users(USER_ID,USER_NAME) VALUES (?,?,)";
	public static final String UPDATE_TEST_VAR1 = "INSERT INTO bl_book_users (USER_NAME,CREATED_BY,PASSWORD,USER_EMAIL,CREATED_DATE) VALUES (?,?,?,?,?)";
	
	public Response pass(SignUpDTO signUpDTO) {
		logger.info("Processing request from Class : SignUpdaoImpl, Method: signUpUser");
		Response response = new Response();
		int rowCount = jdbcTemplate.update(UPDATE_TEST_VAR1, signUpDTO.getUsername(),signUpDTO.getCreate_by(),
				signUpDTO.getPassword(),signUpDTO.getEmail(),signUpDTO.getCreate_date());
		
			
		if(rowCount >0)
			response.setCode("200");
		else 
			response.setCode("500");
		return response;
	}


}
