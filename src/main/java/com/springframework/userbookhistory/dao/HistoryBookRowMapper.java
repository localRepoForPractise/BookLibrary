package com.springframework.userbookhistory.dao;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;


import com.springframework.userbookhistory.model.HISTORYBOOKDTO;

public class HistoryBookRowMapper implements RowMapper<HISTORYBOOKDTO>{

	@Override
	public HISTORYBOOKDTO mapRow(ResultSet arg0,int agr1) throws SQLException
	{
		HISTORYBOOKDTO obj= new HISTORYBOOKDTO();
		obj.setBook_Name(arg0.getString("B.BOOK_NAME"));
		obj.setAuthor_Name(arg0.getString("B.BOOK_AUTHOR"));
		return obj;
	}
	
	
		
}

