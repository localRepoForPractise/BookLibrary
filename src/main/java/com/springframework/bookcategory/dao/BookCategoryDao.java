package com.springframework.bookcategory.dao;

import com.springframework.bookcategory.model.BookDTO;
import com.springframework.maincontroller.Response;

public interface BookCategoryDao {

	Response getAllScienceBooks(String category);

	Response addBook(BookDTO addBook);

}
