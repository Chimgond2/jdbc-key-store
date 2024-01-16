package com.ty.key_strore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.key_store.dto.Key_Store;
import com.ty.key_store.util.ConnectionObject;

public class Key_StoreDao {
	public int saveKeyStore(Key_Store keystore) {
		String query = "insert into key_store values(?,?,?,?,?)";
		Connection connection = ConnectionObject.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, keystore.getPid());
			preparedStatement.setString(2, keystore.getComment());
			preparedStatement.setString(3, keystore.getDescription());
			preparedStatement.setString(4, keystore.getKey());
			preparedStatement.setString(5, keystore.getValue());
			return preparedStatement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return 0;

	}

}
