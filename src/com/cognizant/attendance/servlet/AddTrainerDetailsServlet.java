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

import com.cognizant.attendance.dao.AdminDao;
import com.cognizant.attendance.dao.AdminDaoSqlimpl;
import com.cognizant.attendance.model.TrainerDetails;
@WebServlet("/AddTrainerDetails")
public class AddTrainerDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		AdminDao adminDao = new AdminDaoSqlimpl();
		System.out.println("inside addtrainer inside else if else");
		String trainerId = request.getParameter("trainerId");
		String trainerName = request.getParameter("trainerName");
		long contactNumber = Long
				.parseLong(request.getParameter("contactNumber"));
		String email = request.getParameter("email");
		String skillSet = request.getParameter("skillSet");
		List<TrainerDetails> list = new ArrayList<TrainerDetails>();
		TrainerDetails trainerdetails = new TrainerDetails(trainerId,
				trainerName, contactNumber, email, skillSet);
		list.add(trainerdetails);
		System.out.println(
				trainerId + trainerName + contactNumber + email + skillSet);
		adminDao.addTrainerList(trainerdetails);
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("trainer.jsp");
		dispatcher.forward(request, response);
	}

}
