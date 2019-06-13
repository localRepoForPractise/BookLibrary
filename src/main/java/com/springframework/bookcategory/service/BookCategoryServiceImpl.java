package com.springframework.bookcategory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springframework.bookcategory.dao.BookCategoryDao;
import com.springframework.maincontroller.Response;

@Service("bookCategoryService")
public class BookCategoryServiceImpl implements BookCategoryService{

	@Autowired
	@Qualifier("bookCategoryDao")
	private BookCategoryDao bookCategoryDao;
	
	@Override
	public Response getAllScienceBooks(String category) {
		
		return bookCategoryDao.getAllScienceBooks(category);
	}

	
	
}
