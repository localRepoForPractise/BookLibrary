package com.springframework.userbookhistory.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.springframework.bookcategory.model.BookDTO;
import com.springframework.userbookhistory.model.HISTORYBOOKDTO;

public class HistoryBookRowMapper implements RowMapper<HISTORYBOOKDTO>{

	@Override
	public HISTORYBOOKDTO mapRow(ResultSet arg0,int agr1) throws SQLException
	{
		HISTORYBOOKDTO obj= new HISTORYBOOKDTO();
		obj.setBookId(arg0.getInt("USER_ID"));
		obj.setUserId(arg0.getInt("BOOK_ID"));
		return obj;
	}
	
	
		
}

