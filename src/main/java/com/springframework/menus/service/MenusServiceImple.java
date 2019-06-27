package com.springframework.menus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springframework.maincontroller.Response;
import com.springframework.menus.dao.MenusDao;

@Service("menuService")
public class MenusServiceImple implements MenuService {

	@Autowired
	@Qualifier("menusDao")
	private MenusDao menusDao;
	
	@Override
	public Response getMenus()
	    {
		System.out.println("***********SERVICE**********");
			return menusDao.getMenus(); 	
	    }
}
