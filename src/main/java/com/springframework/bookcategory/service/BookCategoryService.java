package com.springframework.bookcategory.service;

import com.springframework.bookcategory.model.BookDTO;
import com.springframework.maincontroller.Response;

public interface BookCategoryService {

	Response getAllScienceBooks(String category);

	Response addBook(BookDTO addBook);
	
	Response getAllArtsBooks(String category);
	
	Response getUserBookArtsHistory(int loggedUserId ,int enrollBookId); 

}
