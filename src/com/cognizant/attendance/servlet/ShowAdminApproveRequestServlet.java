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

@WebServlet("/ShowAdminApproveRequest")
public class ShowAdminApproveRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			AdminDao adminDao = new AdminDaoSqlimpl();
			String adminId = request.getParameter("adminId");

			AdminDetails admin = adminDao.getAdminPendingDetails(adminId);
			request.setAttribute("admin", admin);
			RequestDispatcher rd = request
					.getRequestDispatcher("admin-approve.jsp");
			rd.forward(request, response);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
