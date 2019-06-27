package com.springframework.menus.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MenusDTO {
 
 private int menuId;
 private String menu_Name;
 private int menuLevel;
 private int menuParentId;
 private String createdBy;
 private Date createdDate;
 private String menuPath;
 

 
  public String getMenuPath() {
	return menuPath;
}
public void setMenuPath(String menuPath) {
	this.menuPath = menuPath;
}
 
 
 public int getMenuId() {
	return menuId;
}
public void setMenuId(int menuId) {
	this.menuId = menuId;
}
public String getMenu_Name() {
	return menu_Name;
}
public void setMenu_Name(String menu_Name) {
	this.menu_Name = menu_Name;
}
public int getMenuLevel() {
	return menuLevel;
}
public void setMenuLevel(int menuLevel) {
	this.menuLevel = menuLevel;
}
public int getMenuParentId() {
	return menuParentId;
}
public void setMenuParentId(int menuParentId) {
	this.menuParentId = menuParentId;
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public Date getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}

}
