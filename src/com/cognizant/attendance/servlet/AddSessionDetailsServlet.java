package com.cognizant.attendance.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.attendance.dao.AdminDao;
import com.cognizant.attendance.dao.AdminDaoSqlimpl;
import com.cognizant.attendance.model.SessionDetails;
import com.cognizant.attendance.util.DateUtil;


@WebServlet("/AddSessionDetails")
public class AddSessionDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminDao adminDao = new AdminDaoSqlimpl();
		System.out.println("inside addtrainer inside else if else");
		String sessionId = request.getParameter("sessionId");
		String sessionDescription = request.getParameter("sessionDescription");
		String skillId = request.getParameter("skillId");
		String sessionDate = request.getParameter("date");
		String time= request.getParameter("time");
		Integer availableSlots = Integer.parseInt(request.getParameter("availableSlots"));
		List<SessionDetails> list = new ArrayList<SessionDetails>();
		SessionDetails sessionDetails;
		try {
			sessionDetails = new SessionDetails(sessionId,
					sessionDescription, skillId, DateUtil.convertStringToUtilDate(sessionDate),time, availableSlots);
			list.add(sessionDetails);
			System.out.println(
					sessionId + sessionDescription + skillId + sessionDate + time+availableSlots);
			adminDao.addSessionDetails(sessionDetails);
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("trainer.jsp");
			dispatcher.forward(request, response);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
