package com.springframework.menus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.maincontroller.Response;
import com.springframework.menus.service.MenuService;

@RestController
public class MenusController {
	
	@Autowired
	@Qualifier("menuService")
	private MenuService menuService;
	@RequestMapping(value="/home", method=RequestMethod.POST)
	@ResponseBody
	public Response getMenus()
	{
		Response response = new Response();
		response = menuService.getMenus();
		return response;
		
	}
}
