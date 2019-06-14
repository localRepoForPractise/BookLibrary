package com.springframework.userbookhistory.dao;

import org.springframework.stereotype.Repository;

import com.springframework.maincontroller.Response;

@Repository("userBookHistoryDao")
public class UserBookHistoryDaoImpl implements UserBookHistoryDao
{

	@Override
	public Response getUserBookHistory(String userid) {
		Response response = new Response();
		return response;
	}

}
