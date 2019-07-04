package com.springframework.bookcategory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springframework.bookcategory.dao.BookCategoryDao;
import com.springframework.bookcategory.model.BookDTO;
import com.springframework.loginController.Login;
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

	@Override
	public Response addBook(BookDTO addBook) {
		return bookCategoryDao.addBook(addBook);
	}

	@Override
	public Response getAllArtsBooks(String category) {
		
		return bookCategoryDao.getAllArtsBooks(category);
	}
	
	@Override
	public Response getUserBookArtsHistory(int loggedUserId ,int enrollBookId) {
		System.out.println("******Arts Service******");
		return bookCategoryDao.getUserBookArtsHistory(loggedUserId , enrollBookId);
	}
	
	@Override
	public Response getAllHistoryBooks(String category){
		return bookCategoryDao.getAllHistoryBooks(category);
	}

	@Override
	public Response addBookHistory(int userId, int id) {
		return bookCategoryDao.addBookHistory(userId, id);
	}
	
}
