package com.weng.j4pi.pojo;

public class User {
	private Long id;
	private String username;
	private String password;

	public User(int id, String username, String password) {
		this.id = (long)id;
		this.username = username;
		this.password = password;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
