package com.cognizant.attendance.servlet;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.attendance.dao.AdminDao;
import com.cognizant.attendance.dao.AdminDaoSqlimpl;
import com.cognizant.attendance.model.SessionDetails;
import com.cognizant.attendance.util.DateUtil;

@WebServlet("/UpdateSessionDetails")
public class UpdateSessionDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside update");
		String sessionId = request.getParameter("sessionId");
		String sessionDescription = request.getParameter("sessionDescription");
		String skillId = request.getParameter("skillId");
		String sessionDate = request.getParameter("date");
		String time= request.getParameter("time");
		Integer availableSlots = Integer.parseInt(request.getParameter("availableSlots"));
		System.out.println(
				sessionId + sessionDescription + skillId + sessionDate + time+availableSlots);
		SessionDetails sessionDetails;
		try {
			sessionDetails = new SessionDetails(sessionId,
					sessionDescription, skillId, DateUtil.convertStringToUtilDate(sessionDate),time, availableSlots);
			System.out.println(
					sessionId + sessionDescription + skillId + sessionDate + time+availableSlots);
			AdminDao adminDao = new AdminDaoSqlimpl();
			adminDao.updateSessionDetails(sessionDetails);
			System.out.println(sessionDetails);
			request.getRequestDispatcher("trainer.jsp").forward(request, response);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
