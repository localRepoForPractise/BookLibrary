package com.springframework.userbookhistory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springframework.maincontroller.Response;
import com.springframework.userbookhistory.dao.UserBookHistoryDao;


@Service("UserBookHistoryService")
public class UserBookHistoryServiceImpl implements UserBookHistoryService
{
	
	@Autowired
	@Qualifier("bookCategoryDao")
	private UserBookHistoryDao userBookHistoryDao;
	
	@Override
	public Response getUserBookHistory(String userid) {
		
		return userBookHistoryDao.getUserBookHistory(userid);
	}

}
