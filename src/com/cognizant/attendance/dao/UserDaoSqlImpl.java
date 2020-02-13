package com.cognizant.attendance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.cognizant.attendance.model.UserDetails;

public class UserDaoSqlImpl implements UserDao {

	@Override
	public void insertUser(UserDetails userDetails) {
		Connection connection = ConnectionHandler.getConnection();
		@SuppressWarnings("unused")
		int result = 0;
		try {
			String insert = "INSERT INTO user_details (first_name, last_name, employee_id, email,password) values(?,?,?,?,?)";
			System.out.println("sql " + insert);
			PreparedStatement statement = connection.prepareStatement(insert);
			statement.setString(1, userDetails.getFirstName());
			statement.setString(2, userDetails.getLastName());
			statement.setString(3, userDetails.getEmployeeId());
			statement.setString(4, userDetails.getEmail());
			statement.setString(5, userDetails.getPassword());
			statement.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

	@Override
	public UserDetails getUserDetails(String employeeId) {
		UserDetails userLogin = new UserDetails();
		Connection connection = ConnectionHandler.getConnection();
		try {
			String login = "select employee_id, password from user_details where employee_Id = ?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(login);
			preparedStatement.setString(1, employeeId);
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				userLogin.setEmployeeId(result.getString(1));
				userLogin.setPassword(result.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userLogin;

	}

	@Override
	public void enrollment() {

	}

	@Override
	public void attendance() {

	}

}
