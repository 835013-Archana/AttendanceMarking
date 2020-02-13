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
import com.cognizant.attendance.model.AdminDetails;
@WebServlet("/ShowPendingRequest")
public class ShowPendingRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		AdminDao adminDao = new AdminDaoSqlimpl();
		List<AdminDetails> pendingList = adminDao.getPendingDetails();
		request.setAttribute("pending", pendingList);
		request.getRequestDispatcher("pending-request.jsp").forward(request,
				response);
	}

}
