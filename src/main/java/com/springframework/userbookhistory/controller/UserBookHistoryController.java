package com.springframework.userbookhistory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.springframework.maincontroller.Response;
import com.springframework.userbookhistory.service.UserBookHistoryService;

@RestController
public class UserBookHistoryController 
{
	@Autowired
	@Qualifier("UserBookHistoryService")
	private UserBookHistoryService userBookHistoryService;
	
	@RequestMapping(value="/UserBookHistory",method=RequestMethod.POST)
	public Response getUserBookHistory(@RequestParam String userid){
		Response response = new Response();
		response = userBookHistoryService.getUserBookHistory(userid);
		return response;
	}

}
