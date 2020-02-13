package com.cognizant.attendance.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

import com.cognizant.attendance.dao.AdminDao;
import com.cognizant.attendance.dao.AdminDaoSqlimpl;
import com.cognizant.attendance.model.TrainerDetails;

@WebServlet("/ShowTrainerDetails")
public class ShowTrainerDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside id");
		String trainerId = request.getParameter("trainerId");
		AdminDao adminDao = new AdminDaoSqlimpl();
		TrainerDetails trainerDetail = adminDao.getTrainer(trainerId);
		System.out.println(trainerId);
		// request.setAttribute("trainer", trainerDetail);
		HttpSession session = request.getSession();
		session.setAttribute("trainer", trainerDetail);

		request.getRequestDispatcher("trainer-details.jsp").forward(request,
				response);
	}

}
