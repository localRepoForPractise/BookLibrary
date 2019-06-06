/**
 * @author ssinha6
 */
package com.springframework.maincontroller;

public class Response {

	private  String code;
	
	private String status;
	
	private String message;
	
	private Object data;
	
	private int noOfPages;
	
	private int totalItem;
	

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	
	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public void setResponse(String code, String status, String message, Object data){
		this.code = code;
		this.status = status;
		this.message = message;
		this.data = data;
	}
	
	public void setResponse(String code, String status, String message){
		this.code = code;
		this.status = status;
		this.message = message;
	}
	
}
