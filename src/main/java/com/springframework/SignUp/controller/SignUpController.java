package com.springframework.SignUp.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.SignUp.service.SignUpService;
import com.springframework.maincontroller.Response;
import com.springframework.mainmodel.SignUpDTO;

@RestController
public class SignUpController {
	
	@Autowired
	@Qualifier("signupService")
	private SignUpService signupService;
	
	private static final Logger logger = Logger.getLogger(SignUpController.class);

	@RequestMapping(value = "/SignUp", method = RequestMethod.POST)
	@ResponseBody
	public Response signUpUser(@RequestBody SignUpDTO  signUpDTO) {
		logger.info("Processing request from Class : MainController, Method: signUpUser");
		Response response = signupService.pass(signUpDTO);
		if (response.getCode().equalsIgnoreCase("200"))
			response.setResponse("200", "SUCCESS", "SUCCESS");
		else
			response.setResponse("500", "FAILURE", "FAILURE");
		return response;
	}
	//fecthing data from database:

	/*public Response getAllUser(@RequestParam int uid){
		Response response = new Response();
		response =signupService.getAllUser(uid);
		return response;
}*/
}