package com.springframework.userbookhistory.dao;

import com.springframework.maincontroller.Response;

public interface UserBookHistoryDao 
{
	Response getUserBookHistory(String userid);

}
