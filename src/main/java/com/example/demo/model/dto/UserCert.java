package com.example.demo.model.dto;

import lombok.Data;

@Data
public class UserCert {	
	private Integer userId; // 使用者ID
	private String username; // 使用者名稱
	private String role; // 角色權限
	
	public UserCert(Integer userId, String username, String role) {
		this.userId = userId;
		this.username = username;
		this.role = role;
	}

}
