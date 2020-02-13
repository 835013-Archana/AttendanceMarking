package com.cognizant.attendance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.attendance.model.AdminDetails;
import com.cognizant.attendance.model.SessionDetails;
import com.cognizant.attendance.model.SkillSet;
import com.cognizant.attendance.model.TrainerDetails;
import com.cognizant.attendance.util.DateUtil;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class AdminDaoSqlimpl implements AdminDao {

	@Override
	public void insertAdmin(AdminDetails adminDetails) {

		Connection connection = ConnectionHandler.getConnection();
		@SuppressWarnings("unused")
		int result = 0;
		try {
			String sql = "INSERT INTO admin_details (first_name, last_name, age, gender, contact_number,admin_id, password,status) values(?,?,?,?,?,?,?,?)";
			System.out.println("sql " + sql);
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, adminDetails.getFirstName());
			statement.setString(2, adminDetails.getLastName());
			statement.setInt(3, adminDetails.getAge());
			statement.setString(4, adminDetails.getGender());
			statement.setLong(5, adminDetails.getContactNumber());
			statement.setString(6, adminDetails.getAdminId());
			statement.setString(7, adminDetails.getPassword());
			statement.setString(8, adminDetails.getStatus());
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
	public AdminDetails getAdminDetails(String adminId, String password) {//super user
		AdminDetails adminLogin = new AdminDetails();
		Connection connection = ConnectionHandler.getConnection();
		try {
			String login = "select admin_Id, password,status from admin_details where admin_Id = ? and password=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(login);
			preparedStatement.setString(1, adminId);
			preparedStatement.setString(2, password);
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				adminLogin.setAdminId(result.getString(1));
				adminLogin.setPassword(result.getString(2));
				adminLogin.setStatus(result.getString(3));

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
			statement.setString(5, trainerDetails.getSkillSet());
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
				trainer.setSkillSet(resultSet.getString(5));

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
			statement.setString(1, trainerDetails.getTrainerName());
			statement.setLong(2, trainerDetails.getContactNumber());
			statement.setString(3, trainerDetails.getEmail());
			statement.setString(4, trainerDetails.getSkillSet());
			statement.setString(5, trainerDetails.getTrainerId());
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

	@Override
	public void addSessionDetails(SessionDetails sessionDetails) throws ParseException{
		Connection connection = ConnectionHandler.getConnection();
		@SuppressWarnings("unused")
		int result = 0;
		try {
			String sql = "INSERT INTO session_details (session_id, session_description, skill_id, session_date, session_time,available_slots) values(?,?,?,?,?,?)";
			System.out.println("sql " + sql);
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, sessionDetails.getSessionId());
			statement.setString(2, sessionDetails.getSessionDescription());
			statement.setString(3, sessionDetails.getSkillId());
			statement.setDate(4,
					DateUtil.convertUtilToSql(sessionDetails.getDate()));
			statement.setString(5, sessionDetails.getTime());
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
			String sql = "UPDATE session_details set session_description=?, skill_id=?, session_date=?, session_time=?, available_slots=? where session_id=?";
			System.out.println("sql" + sql);
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, sessionDetails.getSessionDescription());
			statement.setString(2, sessionDetails.getSkillId());
			statement.setDate(3,
					DateUtil.convertUtilToSql(sessionDetails.getDate()));
			statement.setString(4, sessionDetails.getTime());
			statement.setInt(5, sessionDetails.getAvailableSlots());
			statement.setString(6, sessionDetails.getSessionId());
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
	public List<AdminDetails> getPendingDetails() {//super user
		ArrayList<AdminDetails> pendingAdminList = new ArrayList<AdminDetails>();
		Connection connection = ConnectionHandler.getConnection();
		@SuppressWarnings("unused")
		int result = 0;
		try {
			String sql = "select * from admin_details where status='pending'";
			System.out.println("sql" + sql);
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				AdminDetails pendingAdmin = new AdminDetails(rs.getString(1),
						rs.getString(2), rs.getInt(3), rs.getString(4),
						rs.getLong(5), rs.getString(6), rs.getString(7),
						rs.getString(8));
				pendingAdminList.add(pendingAdmin);
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
		return pendingAdminList;
	}

	@Override
	public AdminDetails getAdminPendingDetails(String adminId) {//super user
		Connection connection = ConnectionHandler.getConnection();

		ResultSet resultSet = null;
		AdminDetails admin = null;
		try {
			String sql = "select * from admin_details where admin_id=?";
			System.out.println("sql" + sql);
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, adminId);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				admin = new AdminDetails();
				admin.setFirstName(resultSet.getString(1));
				admin.setLastName(resultSet.getString(2));
				admin.setAge(resultSet.getInt(3));
				admin.setGender(resultSet.getString(4));
				admin.setContactNumber(resultSet.getLong(5));
				admin.setAdminId(resultSet.getString(6));
				admin.setPassword(resultSet.getString(7));
				admin.setStatus(resultSet.getString(8));

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
		return admin;
	}

	@Override
	public void updateAdminRequest(AdminDetails adminPendingDetails) {
		Connection connection = ConnectionHandler.getConnection();
		@SuppressWarnings("unused")
		int result = 0;
		try {
			String sql = "UPDATE admin_details set status=? where admin_id=?";
			System.out.println("sql" + sql);
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, adminPendingDetails.getStatus());
			statement.setString(2, adminPendingDetails.getAdminId());
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
	public List<SessionDetails> getSessionDetails() throws SessionEmptyException {
		List<SessionDetails> sessionList = new ArrayList<SessionDetails>();
		Connection connection = ConnectionHandler.getConnection();
		@SuppressWarnings("unused")
		SessionDetails sessionDetails=new SessionDetails(); 
		int count = 0;
		ResultSet rs=null;
		
		try {
			String sql = "select * from session_details";
			System.out.println("sql" + sql);
			PreparedStatement statement = connection.prepareStatement(sql);
			 rs = statement.executeQuery();
			while (rs.next()) {
				SessionDetails session = new SessionDetails(rs.getString(1),
						rs.getString(2), rs.getString(3), rs.getDate(4),
						rs.getString(5), rs.getInt(6));
				sessionList.add(session);
				count++;
			}
			
			String sql1 = "select count(session_id) as no_of_session from session_details";
			
			if (count == 0) {
				throw new SessionEmptyException();
			}
			
			statement = connection.prepareStatement(sql1);
			 rs = statement.executeQuery();
		} catch (SQLException e) {
			System.out.println("hii");
			throw new RuntimeException("SQL Exception when getting the all menuitems from the cart.");
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return sessionList;
	}

	@Override
	public void mapSkillSet(SessionDetails sessionDetails) {		
		Connection connection = ConnectionHandler.getConnection();
		@SuppressWarnings("unused")
		int result = 0;
		try {
			String sql = "UPDATE session_details set skill_id=? where session_id=?";
			System.out.println("sql" + sql);
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, sessionDetails.getSkillId());
			statement.setString(2, sessionDetails.getSessionId());
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
	public SessionDetails getSessionDetails(String sessionId) {
		Connection connection = ConnectionHandler.getConnection();

		ResultSet resultSet = null;
		SessionDetails session = null;
		try {
			String sql = "select * from session_details where session_id=?";
			System.out.println("sql" + sql);
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, sessionId);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				session = new SessionDetails();
				session.setSessionId(resultSet.getString(1));
				session.setSessionDescription(resultSet.getString(2));
				session.setSkillId(resultSet.getString(3));
				session.setDate(resultSet.getDate(4));
				session.setTime(resultSet.getString(5));
				session.setAvailableSlots(resultSet.getInt(6));
				

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
		return session;
	}

	@Override
	public void deleteSessionDetails( String sessionId) {
		PreparedStatement statement = null;
		Connection connection = ConnectionHandler.getConnection();
		try {
			String sql = "delete  from session_details where session_id=?";
			System.out.println("sql" + sql);
			statement = connection.prepareStatement(sql);
			statement.setString(1, sessionId);			
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("SQL Exception when removing menuitem from cart.");
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {				
				System.out.println(e.getMessage());
			}
		}
	}
		
	}


