package cgg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "user_id")
	 private int userId;
	 @Column(name = "username")
     private String userName;
	 @Column(name = "user_email")
     private String userEmail;
	 @Column(name = "user_password")
     private String userPassword;
	 @Column(name = "user_phone")
     private String userph;
	 @Column(name = "user_address")
     private String useraddress;
	 @Column(name = "user_type")
     private String userType;
     
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Users(String userName, String userEmail, String userPassword, String userph, String useraddress,
			String userType) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userph = userph;
		this.useraddress = useraddress;
		this.userType = userType;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserph() {
		return userph;
	}
	public void setUserph(String userph) {
		this.userph = userph;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
