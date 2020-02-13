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

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLogin")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out.println("inside login servlet");
		String adminId = request.getParameter("adminId");
		System.out.println(adminId);
		String password = request.getParameter("password");
		System.out.println(password);

		AdminDao adminDao = new AdminDaoSqlimpl();
		AdminDetails adminDetails = adminDao.getAdminDetails(adminId, password);
		System.out.println(adminDetails.getStatus());
		if (adminDetails != null && adminDetails.getAdminId() != null
				&& adminDetails.getAdminId().equalsIgnoreCase("835017")) {
			request.getRequestDispatcher("super-user.jsp").forward(request,
					response);
		} else if (adminDetails != null && adminDetails.getAdminId() != null
				&& adminDetails.getStatus().equalsIgnoreCase("Approved")) {
			request.getRequestDispatcher("trainer.jsp").forward(request,
					response);
		} else if (adminDetails != null && adminDetails.getAdminId() != null
				&& (adminDetails.getStatus().equalsIgnoreCase("Pending")
						|| adminDetails.getStatus().equalsIgnoreCase("Rejected"))) {
			request.setAttribute("status","You are rejected");
			request.getRequestDispatcher("admin-login.jsp").forward(request,
					response);
		}
		else {
			request.setAttribute("status1", "Invalid Id or Password");
			request.getRequestDispatcher("admin-login.jsp").forward(request,
					response);
		}
	}

}
