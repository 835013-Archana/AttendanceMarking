package com.cognizant.attendance.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.attendance.dao.AdminDao;
import com.cognizant.attendance.dao.AdminDaoSqlimpl;
import com.cognizant.attendance.dao.SessionEmptyException;
import com.cognizant.attendance.model.SessionDetails;
@WebServlet("/ShowSessionDetails")
public class ShowSessionDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminDao adminDao = new AdminDaoSqlimpl();
		System.out.println("Inside");
		List<SessionDetails> sessionList;
		try {
			sessionList = adminDao.getSessionDetails();
			request.setAttribute("session", sessionList);
			request.getRequestDispatcher("view-session-details.jsp").forward(request,
					response);
		}
		catch (SessionEmptyException e) {
			request.getRequestDispatcher("session-empty.jsp").forward(request, response);
			
		}
	
	}
}


