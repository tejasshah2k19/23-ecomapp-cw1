package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

import com.util.DbConnection;

public class UserDao {

	public void addUser(String firstName, String email, String password) {
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con
					.prepareStatement("insert into users (firstName,email,password) values (?,?,?)");
			pstmt.setString(1, firstName);
			pstmt.setString(2, email);
			pstmt.setString(3, password);

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public HashMap<String,Object> authenticate(String email, String password) {
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from users where email = ? and password = ? ");
			pstmt.setString(1, email);
			pstmt.setString(2, password);

			ResultSet rs = pstmt.executeQuery(); // select
			
			if(rs.next()) {
				HashMap<String, Object> hm = new HashMap<String, Object>();
				hm.put("firstName",rs.getString("firstName"));
				hm.put("role",rs.getString("role"));
				hm.put("userId",rs.getInt("userId"));
				return hm;
			}else {
				return null;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
