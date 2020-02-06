package com.cognizant.attendance.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.attendance.dao.AdminDao;
import com.cognizant.attendance.dao.AdminDaoSqlimpl;
import com.cognizant.attendance.model.AdminDetails;

@WebServlet("/AdminLogin")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminLoginServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("inside loginservlet begin");
		String adminId = request.getParameter("adminId");
		String password = request.getParameter("password");
		AdminDao adminDao = new AdminDaoSqlimpl();
		AdminDetails adminDetails = adminDao.getAdminDetails(adminId);
		if (adminDetails.getPassword().equals(password)) {
			System.out.println(adminDetails.getPassword());
			System.out.println(password);
			System.out.println("welcome!!!");
			request.getRequestDispatcher("trainer.jsp").forward(request, response);
		} else {
			System.out.println(adminDetails.getPassword());
			System.out.println(password);
			System.out.println("Invalid adminId and password");
			request.setAttribute("status", false);
			request.getRequestDispatcher("admin-login.jsp").forward(request, response);
		}
	}
}
