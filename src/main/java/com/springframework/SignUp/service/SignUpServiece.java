package com.springframework.SignUp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springframework.SignUp.dao.SignUpdao;
import com.springframework.maincontroller.Response;
import com.springframework.mainmodel.SignUpDTO;

@Service("signupService")
public class SignUpServiece implements SignUpService{
	
	@Autowired
	@Qualifier("signupDao")
	private SignUpdao signupDao;
	
	@Override
	public Response pass(SignUpDTO signUpDTO)
	{
		return signupDao.pass(signUpDTO);
	}

	/*public Response pass(String um)
	{
		return signupDao.pass(um);
	}*/
}
