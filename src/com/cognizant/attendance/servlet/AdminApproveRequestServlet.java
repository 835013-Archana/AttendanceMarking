package com.cognizant.attendance.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.attendance.dao.AdminDao;
import com.cognizant.attendance.dao.AdminDaoSqlimpl;
import com.cognizant.attendance.model.AdminDetails;

@WebServlet("/AdminApproveRequest")
public class AdminApproveRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		Integer age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		long contactNumber = Long
				.parseLong(request.getParameter("contactNumber"));
		String adminId = request.getParameter("adminId");
		String password = request.getParameter("password");
		String status = request.getParameter("status");
		AdminDetails adminPendingDetails= new AdminDetails(firstName, lastName, age,
				gender, contactNumber, adminId, password,status);
		AdminDao adminDao = new AdminDaoSqlimpl();
		adminDao.updateAdminRequest(adminPendingDetails);
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("pending-request.jsp");
		dispatcher.forward(request, response);
	}

}
