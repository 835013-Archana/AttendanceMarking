package com.cognizant.attendance.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.attendance.dao.AdminDao;
import com.cognizant.attendance.dao.AdminDaoSqlimpl;
import com.cognizant.attendance.model.SkillSet;

@WebServlet("/AddSkillDetails")
public class AddSkillDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;  
    public AddSkillDetailsServlet() {
        super();       
    }	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminDao adminDao = new AdminDaoSqlimpl();
		System.out.println("Inside skill set");
		String skillId=request.getParameter("skillId");
		int skillType=Integer.parseInt(request.getParameter("skillType"));
		String skillDescription=request.getParameter("SkillDescription");
		List<SkillSet> list = new ArrayList<SkillSet>();
		SkillSet skillSet=new SkillSet(skillId, skillType, skillDescription);
		list.add(skillSet);
		System.out.println(skillId+skillType+skillDescription);
		adminDao.addSkillSet(skillSet);
		request.setAttribute("skill-status", false);
		request.getRequestDispatcher("add-skill.jsp").forward(request, response);
		
	}

}
