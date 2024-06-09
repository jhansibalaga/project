package services;

import java.sql.Connection;

import java.sql.PreparedStatement;

import models.user;

public class userservice {
         private Connection conn;

		public userservice(Connection conn) {
			super();
			this.conn = conn;
		}

	public boolean adduser(user u) {
		boolean f = false;
		PreparedStatement pmst = null;
		
		try {
			String sql = "insert into users(firstname,lastname,email,password,age,gender) values(?,?,?,?,?,?)";
		    pmst = conn.prepareStatement(sql);
			pmst.setString(1,u.getFirstname());
			pmst.setString(2,u.getLastname());
			pmst.setString(3,u.getEmail());
			pmst.setString(4,u.getPassword());
			pmst.setInt(5,u.getAge());
			pmst.setString(6,u.getGender());
			
			int i = pmst.executeUpdate();
			if(i>0) {
				f=true;
			}
			conn.close();
			pmst.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}
}
