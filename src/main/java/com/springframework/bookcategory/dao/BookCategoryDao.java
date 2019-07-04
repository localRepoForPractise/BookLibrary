package com.springframework.bookcategory.dao;

import com.springframework.bookcategory.model.BookDTO;
import com.springframework.loginController.Login;
import com.springframework.maincontroller.Response;

public interface BookCategoryDao {

	Response getAllScienceBooks(String category);

	Response addBook(BookDTO addBook);
	
	Response getAllArtsBooks(String category);

	Response getUserBookArtsHistory(int loggedUserId ,int enrollBookId);
	
	Response getAllHistoryBooks(String category);
	Response addBookHistory(int userId, int id);

}
