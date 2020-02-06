package com.cognizant.attendance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cognizant.attendance.model.AdminDetails;
import com.cognizant.attendance.model.SessionDetails;
import com.cognizant.attendance.model.SkillSet;
import com.cognizant.attendance.model.TrainerDetails;
import com.cognizant.attendance.util.DateUtil;


public class AdminDaoSqlimpl implements AdminDao {

	@Override
	public void insertAdmin(AdminDetails adminDetails) {

		Connection connection = ConnectionHandler.getConnection();
		@SuppressWarnings("unused")
		int result = 0;
		try {
			String sql = "INSERT INTO admin_details (first_name, last_name, age, gender, contact_number,admin_id, password) values(?,?,?,?,?,?,?)";
			System.out.println("sql " + sql);
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, adminDetails.getFirstName());
			statement.setString(2, adminDetails.getLastName());
			statement.setInt(3, adminDetails.getAge());
			statement.setString(4, adminDetails.getGender());
			statement.setLong(5, adminDetails.getContactNumber());
			statement.setString(6, adminDetails.getAdminId());
			statement.setString(7, adminDetails.getPassword());
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
	public AdminDetails getAdminDetails(String adminId) {
		AdminDetails adminLogin = new AdminDetails();
		Connection connection = ConnectionHandler.getConnection();
		try {
			String login = "select admin_id, password from admin_details where admin_Id = ?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(login);
			preparedStatement.setString(1, adminId);
			
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				adminLogin.setAdminId(result.getString(1));
				adminLogin.setPassword(result.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return adminLogin;
	}

	@Override
	public void addTrainerList(TrainerDetails trainerDetails) {
		Connection connection = ConnectionHandler.getConnection();
		@SuppressWarnings("unused")
		int result = 0;
		try {
			String sql = "INSERT INTO trainer_details (trainer_id, trainer_name, contact_number, email, skill_id) values(?,?,?,?,?)";
			System.out.println("sql " + sql);
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, trainerDetails.getTrainerId());
			statement.setString(2, trainerDetails.getTrainerName());
			statement.setLong(3, trainerDetails.getContactNumber());
			statement.setString(4, trainerDetails.getEmail());
			statement.setString(5, trainerDetails.getSkillId());
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
	public TrainerDetails getTrainer(String trainerId) {
		Connection connection = ConnectionHandler.getConnection();
		@SuppressWarnings("unused")
		ResultSet resultSet = null;
		TrainerDetails trainer = null;
		try {
			String sql = "select * from trainer_details where trainer_id=?";
			System.out.println("sql" + sql);
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, trainerId);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				trainer = new TrainerDetails();
				trainer.setTrainerId(resultSet.getString(1));
				trainer.setTrainerName(resultSet.getString(2));
				trainer.setContactNumber(resultSet.getLong(3));
				trainer.setEmail(resultSet.getString(4));
				trainer.setSkillId(resultSet.getString(5));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return trainer;
	}

	@Override
	public void updateTrainerList(TrainerDetails trainerDetails) {
		Connection connection = ConnectionHandler.getConnection();
		@SuppressWarnings("unused")
		int result = 0;
		try {
			String sql = "UPDATE trainer_details set trainer_name=?, contact_number=?, email=?, skill_id=? where trainer_id=?";
			System.out.println("sql" + sql);
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(2, trainerDetails.getTrainerName());
			statement.setLong(3, trainerDetails.getContactNumber());
			statement.setString(4, trainerDetails.getEmail());
			statement.setString(5, trainerDetails.getSkillId());
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
	public void addSessionDetails(SessionDetails sessionDetails) {
		Connection connection = ConnectionHandler.getConnection();
		@SuppressWarnings("unused")
		int result = 0;
		try {
			String sql = "INSERT INTO trainer_details (session_id, session_description, skill_id, date, time,available_slots) values(?,?,?,?,?,?)";
			System.out.println("sql " + sql);
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, sessionDetails.getSessionId());
			statement.setString(2, sessionDetails.getSessionDescription());
			statement.setString(3, sessionDetails.getSkillId());
			statement.setDate(4,
					DateUtil.convertUtilToSql(sessionDetails.getDate()));
			statement.setTime(5, sessionDetails.getTime());
			statement.setInt(6, sessionDetails.getAvailableSlots());
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
	public void updateSessionDetails(SessionDetails sessionDetails) {
		Connection connection = ConnectionHandler.getConnection();
		@SuppressWarnings("unused")
		int result = 0;
		try {
			String sql = "UPDATE session_details set session_description=?, skill_id=?, date=?, time=?, available_slots where trainer_id=?";
			System.out.println("sql" + sql);
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(2, sessionDetails.getSessionDescription());
			statement.setString(3, sessionDetails.getSkillId());
			statement.setDate(4,
					DateUtil.convertUtilToSql(sessionDetails.getDate()));
			statement.setTime(5, sessionDetails.getTime());
			statement.setInt(6, sessionDetails.getAvailableSlots());
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
    public void addSkillSet(SkillSet skillSet) {
       Connection connection = ConnectionHandler.getConnection();
       @SuppressWarnings("unused")
       int result = 0;
       try {
           String skill = "INSERT INTO skill_set (skill_id,skill_type,skill_description) values(?,?,?)";
           System.out.println("skill " + skill);
           PreparedStatement statement = connection.prepareStatement(skill);
           statement.setString(1, skillSet.getSkillId());
           statement.setInt(2, skillSet.getSkillType());
           statement.setString(3, skillSet.getSkillDescription());
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
}
