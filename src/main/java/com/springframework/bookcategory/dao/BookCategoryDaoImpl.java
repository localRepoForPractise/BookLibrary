package com.springframework.bookcategory.dao;

import java.awt.print.Book;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springframework.bookcategory.model.BookDTO;
import com.springframework.maincontroller.Response;

@Repository("bookCategoryDao")
public class BookCategoryDaoImpl implements BookCategoryDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static final String GET_ALL_SCIENCE_BOOKS ="SELECT * FROM BL_BOOKS";
	
	
	@Override
	public Response getAllScienceBooks(String category) {
		Response response = new Response();
		List<BookDTO> bookList = jdbcTemplate.query(GET_ALL_SCIENCE_BOOKS, new ScienceBookRowMapper());
		
		if(!bookList.isEmpty())
			response.setResponse("200", "SUCCESS", "SUCCESS", bookList);
		else
			response.setResponse("500", "FAILURE", "NO DATA FOUND", Collections.emptyList());
			
		return response;
	}

	
	
	
}
