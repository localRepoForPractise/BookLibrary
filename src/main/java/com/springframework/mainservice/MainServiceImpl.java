package com.springframework.mainservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springframework.maincontroller.Response;
import com.springframework.maindao.MainDao;

@Service("mainService")
public class MainServiceImpl implements MainService{

	@Autowired
	@Qualifier("mainDao")
	private MainDao mainDao;
	
	public Response checkConnection() {
		return mainDao.checkConnection();
	}

}
