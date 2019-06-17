package com.springframework.bookcategory.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springframework.bookcategory.model.BookDTO;

public class ScienceBookRowMapper implements RowMapper<BookDTO>{

	@Override
	public BookDTO mapRow(ResultSet arg0, int arg1) throws SQLException {
		BookDTO obj = new BookDTO();
		obj.setId(arg0.getInt("BOOK_ID"));
		obj.setBookName(arg0.getString("BOOK_NAME"));
		obj.setBookAuthor(arg0.getString("BOOK_AUTHOR"));
		return obj;
	}

}
