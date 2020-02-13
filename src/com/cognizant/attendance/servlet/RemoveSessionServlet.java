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

@WebServlet("/RemoveSession")
public class RemoveSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			String sessionId = request.getParameter("sessionId");
			AdminDao adminDao = new AdminDaoSqlimpl();
			adminDao.deleteSessionDetails(sessionId);
			List<SessionDetails> session = adminDao.getSessionDetails();				
			request.setAttribute("removeSSession", true);
			request.setAttribute("session", session);
			request.getRequestDispatcher("view-session-details.jsp").forward(request, response);
		}

		catch (SessionEmptyException e) {
			
			request.getRequestDispatcher("session-empty.jsp").forward(request, response);
		}
	}

}
