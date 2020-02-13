package com.cognizant.attendance.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.attendance.dao.AdminDao;
import com.cognizant.attendance.dao.AdminDaoSqlimpl;
import com.cognizant.attendance.model.SessionDetails;

@WebServlet("/UpdateMapSkill")
public class UpdateMapSkillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("null")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside MapSkill");
		String sessionId = request.getParameter("sessionId");
		System.out.println(sessionId);
		String skillId = request.getParameter("skillId");
		System.out.println(skillId);
		SessionDetails sessionDetail = new SessionDetails();
		sessionDetail.setSkillId(skillId);
		sessionDetail.setSessionId(sessionId);
		System.out.println(sessionId);
		System.out.println(skillId);
		AdminDao adminDao = new AdminDaoSqlimpl();
		adminDao.mapSkillSet(sessionDetail);
		System.out.println(sessionDetail);
		request.getRequestDispatcher("trainer.jsp").forward(request, response);

	}

}
