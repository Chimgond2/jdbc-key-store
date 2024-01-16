package com.ty.key_strore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.key_store.dto.User;
import com.ty.key_store.util.ConnectionObject;

public class UserDao {
	public int saveUser(User user) {
		String query="insert into user values(?,?,?,?)";
		Connection connection = ConnectionObject.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,user.getId() );
			preparedStatement.setString(2, user.getUserName());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getPassword());
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return 0;
		}

	}

}
