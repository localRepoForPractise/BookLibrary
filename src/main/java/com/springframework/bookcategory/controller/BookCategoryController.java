package com.springframework.bookcategory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.bookcategory.model.BookDTO;
import com.springframework.bookcategory.service.BookCategoryService;
import com.springframework.maincontroller.Response;

@RestController
public class BookCategoryController {

	@Autowired
	@Qualifier("bookCategoryService")
	private BookCategoryService bookCategoryService;
	
	@RequestMapping(value="/scienceTest",method=RequestMethod.POST)
	@ResponseBody
	public Response getAllScienceBooks(@RequestBody String category){
		Response response = new Response();
		response = bookCategoryService.getAllScienceBooks(category);
		return response;
	}
	
	
	@RequestMapping(value="/addBook",method=RequestMethod.POST)
	@ResponseBody
	public Response addBook(@RequestBody BookDTO addBook){
		Response response = bookCategoryService.addBook(addBook);
		if(response.getCode().equals("200"))
			response.setResponse("200", "SUCCESS", "SUCCESS");
		else
			response.setResponse("500", "FAILURE", "FAILURE");
		return response;
	}
	
	
	@RequestMapping(value="/arts",method=RequestMethod.POST)
	@ResponseBody
	public Response getAllArtsBooks(@RequestBody String category){
		Response response = new Response();
		response = bookCategoryService.getAllArtsBooks(category);
		return response;
	}
	
	@RequestMapping(value="/arts/{UserID}/{BookID}",method=RequestMethod.POST)
	@ResponseBody
	public Response getUserBookArtsHistory(@PathVariable("UserID") int loggedUserId , @PathVariable("BookID") int enrollBookId){
		Response response = new Response();
		response = bookCategoryService.getUserBookArtsHistory(loggedUserId , enrollBookId);
		return response;
	}
	
	@RequestMapping(value="/History",method=RequestMethod.POST)
	@ResponseBody
	public Response getAllHistoryBooks(@RequestBody String category){
		Response response = new Response();
		response = bookCategoryService.getAllHistoryBooks(category);
		return response;
	}
	
	@RequestMapping(value="/enroll()/{userId}/{id}",method=RequestMethod.POST)
	@ResponseBody
	public Response addBookHistory(@PathVariable ("userId") int userId, @PathVariable ("id") int id){
		Response response = new Response();
		response = bookCategoryService.addBookHistory(userId, id);
		return response;
	}
	
}
