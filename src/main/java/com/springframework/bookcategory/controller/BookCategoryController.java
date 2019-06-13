package com.springframework.bookcategory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.bookcategory.service.BookCategoryService;
import com.springframework.maincontroller.Response;

@RestController
public class BookCategoryController {

	@Autowired
	@Qualifier("bookCategoryService")
	private BookCategoryService bookCategoryService;
	
	@RequestMapping(value="/scienceTest",method=RequestMethod.POST)
	public Response getAllScienceBooks(@RequestParam String category){
		Response response = new Response();
		response = bookCategoryService.getAllScienceBooks(category);
		return response;
	}
}
