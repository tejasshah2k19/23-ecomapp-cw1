package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.util.DbConnection;

public class UserDao {

	public void addUser(String firstName,String email,String password) {
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into users (firstName,email,password) values (?,?,?)");
			pstmt.setString(1, firstName);
			pstmt.setString(2, email);
			pstmt.setString(3, password);
	
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
