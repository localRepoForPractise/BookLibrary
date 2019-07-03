package com.springframework.bookcategory.dao;

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

	public static final String ADD_BOOK ="INSERT INTO BL_BOOKS (CATEGORY_ID,BOOK_NAME,BOOK_AUTHOR,CREATED_BY,CREATED_DATE) VALUES(?,?,?,?,CURDATE())";

	public static final String GET_ALL_ARTS_BOOKS ="SELECT * FROM BL_BOOKS WHERE CATEGORY_ID = 1004 ";

	public static final String ENROLl_ART_BOOKS_TO_USER="INSERT INTO BL_BOOK_USERS_HISTORY (USER_ID, BOOK_ID, CREATED_DATE) VALUES(?,?,CURDATE())";


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


	@Override
	public Response addBook(BookDTO addBook) {
		Response response = new Response();
		int count = jdbcTemplate.update(ADD_BOOK,5,addBook.getBookName(),addBook.getBookAuthor(),"VNANDANW");
		if(count >0)
			response.setCode("200");
		else
			response.setCode("500");
		return response;
	}


	@Override
	public Response getAllArtsBooks(String category) {
		Response response = new Response();
		List<BookDTO> bookList = jdbcTemplate.query(GET_ALL_ARTS_BOOKS, new ScienceBookRowMapper());

		if(!bookList.isEmpty())
			response.setResponse("200", "SUCCESS", "SUCCESS", bookList);
		else
			response.setResponse("500", "FAILURE", "NO DATA FOUND", Collections.emptyList());

		return response;
	}


	@Override
	public Response getUserBookArtsHistory(int loggedUserId ,int enrollBookId) {
		System.out.println("******Arts Dao******");
		Response response = new Response();
		int count = jdbcTemplate.update(ENROLl_ART_BOOKS_TO_USER, loggedUserId , enrollBookId);
		if(count > 0)
			response.setCode("200");
		else
			response.setCode("500");
		return response;
	}

}
