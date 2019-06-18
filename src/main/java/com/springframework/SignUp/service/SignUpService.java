package com.springframework.SignUp.service;

import com.springframework.maincontroller.Response;
import com.springframework.mainmodel.SignUpDTO;

public interface SignUpService {
	Response pass(SignUpDTO signUpDTO);
	//Response pass(String um);

}
