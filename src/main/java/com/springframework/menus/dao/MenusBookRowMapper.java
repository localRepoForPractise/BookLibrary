package com.springframework.menus.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springframework.menus.model.MenusDTO;

public class MenusBookRowMapper implements RowMapper<MenusDTO> {

	
	@Override
	public MenusDTO mapRow(ResultSet arg0, int arg1) throws SQLException {
		MenusDTO obj = new MenusDTO();
		obj.setMenuId(arg0.getInt("MENU_ID"));
		obj.setMenu_Name(arg0.getString("MENU_NAME"));
		obj.setMenuLevel(arg0.getInt("MENU_LEVEL"));
		obj.setMenuParentId(arg0.getInt("MENU_PARENT_ID"));
		obj.setMenuPath(arg0.getString("MENU_PATH"));
		
		return obj;
	}

}
