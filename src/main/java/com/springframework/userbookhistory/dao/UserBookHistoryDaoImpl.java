package com.springframework.userbookhistory.dao;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



import com.springframework.maincontroller.Response;
import com.springframework.userbookhistory.model.HISTORYBOOKDTO;

@Repository("userBookHistoryDao")
public class UserBookHistoryDaoImpl implements UserBookHistoryDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static final String GET_ALL_HISTORY ="SELECT B.BOOK_NAME,B.BOOK_AUTHOR FROM BL_BOOK_USERS_HISTORY AS BUH INNER JOIN BL_BOOKS AS B ON BUH.BOOK_ID=B.BOOK_ID  WHERE BUH.USER_ID=?";

	@Override
	public Response getUserBookHistory(int userid) {
		Response response = new Response();
		List<HISTORYBOOKDTO> bookList = jdbcTemplate.query(GET_ALL_HISTORY, new HistoryBookRowMapper(),userid);
		if(!bookList.isEmpty())
			response.setResponse("200", "SUCCESS", "SUCCESS", bookList);
		else
			response.setResponse("500", "FAILURE", "NO DATA FOUND", Collections.emptyList());
			
		
		
		return response;
	}

}
