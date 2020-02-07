package com.cognizant.attendance.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.attendance.dao.AdminDao;
import com.cognizant.attendance.dao.AdminDaoSqlimpl;
import com.cognizant.attendance.model.TrainerDetails;
@WebServlet("/UpdateTrainer")
public class UpdateTrainerDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateTrainerDetails() {
        super();
       
    }	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside update");
		String trainerId = request.getParameter("trainerId");
		String trainerName = request.getParameter("trainerName");
		long contactNumber = Long
				.parseLong(request.getParameter("contactNumber"));
		String email = request.getParameter("email");
		String skillId = request.getParameter("skillId");
		TrainerDetails trainerDetail=new TrainerDetails(trainerId, trainerName, contactNumber, email, skillId);
		AdminDao adminDao = new AdminDaoSqlimpl();
		System.out.println(trainerId+trainerName+contactNumber+email+skillId);
		adminDao.updateTrainerList(trainerDetail);
		System.out.println(trainerId+trainerName+contactNumber+email+skillId);
		request.getRequestDispatcher("trainer.jsp").forward(request, response);
		
	}

}
