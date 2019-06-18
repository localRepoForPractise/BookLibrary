package com.springframework.userbookhistory.dao;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springframework.bookcategory.dao.ScienceBookRowMapper;
import com.springframework.bookcategory.model.BookDTO;
import com.springframework.maincontroller.Response;
import com.springframework.userbookhistory.model.HISTORYBOOKDTO;

@Repository("userBookHistoryDao")
public class UserBookHistoryDaoImpl implements UserBookHistoryDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static final String GET_ALL_HISTORY ="SELECT * FROM BL_BOOK_USERS_HISTORY";

	@Override
	public Response getUserBookHistory(int userid) {
		Response response = new Response();
		List<HISTORYBOOKDTO> bookList = jdbcTemplate.query(GET_ALL_HISTORY, new HistoryBookRowMapper());
		if(!bookList.isEmpty())
			response.setResponse("200", "SUCCESS", "SUCCESS", bookList);
		else
			response.setResponse("500", "FAILURE", "NO DATA FOUND", Collections.emptyList());
			
		
		
		return response;
	}

}
