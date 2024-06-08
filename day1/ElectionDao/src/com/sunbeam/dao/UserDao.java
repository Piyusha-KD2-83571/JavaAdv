package com.sunbeam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sunbeam.entity.UsersEntity;
import com.sunbeam.utils.DbUtil;

public class UserDao implements AutoCloseable {

	private Connection connection;
	
	public UserDao() throws SQLException
	{
		connection = DbUtil.getConnection();
	}
	
	public UsersEntity findByEmail(String email) throws SQLException
	{
		String sql = "select * from users where id = ?";
		
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			
			stmt.setString(1, email);
			ResultSet rs = stmt.executeQuery();
			if(rs.next())
			{
				return createUserFromResult(rs);
			}
			return null;
		}
				
	}
	
	private UsersEntity createUserFromResult(ResultSet rs) throws SQLException
	{
		int id = rs.getInt("id");
		String firstName = rs.getString("f_name");
		String lastName = rs.getString("l_name")
		
	}
	
	
	
	

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		if(connection == null)
			connection.close();
	}

}
