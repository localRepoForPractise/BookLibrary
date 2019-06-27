package com.springframework.menus.dao;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springframework.maincontroller.Response;
import com.springframework.menus.model.MenusDTO;

@Repository("menusDao")
public class MenusDaoImpl implements MenusDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static final String GET_ALL_MENUS ="SELECT * FROM BL_MENUS";
	public Response getMenus()
    {
		System.out.println("******DAO*******");
    	Response response = new Response();
		List<MenusDTO> menusList = jdbcTemplate.query(GET_ALL_MENUS, new MenusBookRowMapper());
		
		if(!menusList.isEmpty())
			response.setResponse("200", "SUCCESS", "SUCCESS", menusList);
		else
			response.setResponse("500", "FAILURE", "NO DATA FOUND", Collections.emptyList());
			
		return response;    	
    }
}
