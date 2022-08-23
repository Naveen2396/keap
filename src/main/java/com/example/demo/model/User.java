package com.example.demo.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="user")
public class User {
	
	@Id
    @Column(name="user_id")	
 	private Integer user_id;
	@Column(name="user_name")
	private String user_name;
	@Column(name="user_password")
	private String user_password;
	@Column(name="user_email")
	private String user_email;
	@Column(name="user_phonenumber")
	private BigInteger user_phonenumber;
	
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public BigInteger getUser_phonenumber() {
		return user_phonenumber;
	}
	public void setUser_phonenumber(BigInteger user_phonenumber) {
		this.user_phonenumber = user_phonenumber;
	}
	
	

}
