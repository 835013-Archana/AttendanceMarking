package com.cognizant.attendance.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cognizant.attendance.dao.UserDao;
import com.cognizant.attendance.dao.UserDaoSqlImpl;
import com.cognizant.attendance.model.UserDetails;

@WebServlet("/UserRegistration")
public class UserRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside loginservlet begin");
		UserDao userDao = new UserDaoSqlImpl();
		System.out.println("inside userservlet inside ");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String empId = request.getParameter("employeeId");
		String emailId = request.getParameter("email");
		String password = request.getParameter("password");
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(empId);
		System.out.println(emailId);
		System.out.println(password);
		List<UserDetails> list = new ArrayList<UserDetails>();
		UserDetails userDetail = new UserDetails(firstName, lastName, empId,
				emailId, password);
		list.add(userDetail);
		System.out.println("inside userservlet before insert");
		userDao.insertUser(userDetail);
		System.out.println("inside userservlet after insert");
		request.setAttribute("ref", userDetail);
		request.setAttribute("successmessage",
				"Successfully registeres,click here to login");

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("user-login.jsp");
		dispatcher.forward(request, response);

	}
}
