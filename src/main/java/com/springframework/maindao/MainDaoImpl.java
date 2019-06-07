package com.springframework.maindao;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springframework.maincontroller.Response;

@Repository("mainDao")
public class MainDaoImpl implements MainDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final Logger logger = Logger.getLogger(MainDaoImpl.class);

	public static final String CHECK_CONNECTION_QUERY = "SELECT COUNT(*) FROM STUDENT";

	public Response checkConnection() {
		logger.info("Processing request from Class : MainDaoImpl, Method: checkConnection");
		Response response = new Response();
		int count = jdbcTemplate.queryForObject(CHECK_CONNECTION_QUERY, Integer.class);
		System.out.println("**************** : " + count);
		if (count > 0)
			response.setResponse("200", "SUCCESS", "SUCCESS");
		else
			response.setResponse("500", "FAILURE", "FAILURE");
		return response;
	}
}
