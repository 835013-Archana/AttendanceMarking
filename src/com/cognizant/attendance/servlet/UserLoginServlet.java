package com.cognizant.attendance.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.attendance.dao.UserDao;
import com.cognizant.attendance.dao.UserDaoSqlImpl;
import com.cognizant.attendance.model.UserDetails;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLogin")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String employeeId = request.getParameter("employeeId");
		String password = request.getParameter("password");
		UserDao userDao = new UserDaoSqlImpl();
		UserDetails userDetails = userDao.getUserDetails(employeeId);
		if (userDetails.getPassword().equals(password)) {
			request.getRequestDispatcher("user.jsp").forward(request, response);
		} else {
			request.setAttribute("status", false);
			request.getRequestDispatcher("user-login.jsp").forward(request,
					response);
		}
	}
}
