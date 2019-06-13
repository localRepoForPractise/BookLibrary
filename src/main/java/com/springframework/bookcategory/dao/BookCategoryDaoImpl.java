package com.springframework.bookcategory.dao;

import org.springframework.stereotype.Repository;

import com.springframework.maincontroller.Response;

@Repository("bookCategoryDao")
public class BookCategoryDaoImpl implements BookCategoryDao{

	@Override
	public Response getAllScienceBooks(String category) {
		Response response = new Response();
		return response;
	}

	
	
	
}
