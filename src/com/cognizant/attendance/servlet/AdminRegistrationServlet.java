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
import javax.servlet.http.HttpSession;

import com.cognizant.attendance.dao.AdminDao;
import com.cognizant.attendance.dao.AdminDaoSqlimpl;
import com.cognizant.attendance.model.AdminDetails;

@WebServlet("/AdminRegistration")
public class AdminRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int timeout =2;      

		System.out.println("inside loginservlet begin");
		AdminDao adminDao = new AdminDaoSqlimpl();
				System.out.println("inside loginservlet inside else if else");
				String firstName = request.getParameter("first-name");
				String lastName = request.getParameter("last-name");
				Integer age = Integer.parseInt(request.getParameter("age"));
				String gender = request.getParameter("gender");
				long contactNumber = Long
						.parseLong(request.getParameter("contact"));
				String adminId = request.getParameter("adminId");
				String password = request.getParameter("password");
				System.out.println(firstName);
				System.out.println(lastName);
				System.out.println(age);
				System.out.println(gender);
				System.out.println(contactNumber);
				System.out.println(adminId);
				System.out.println(password);
				List<AdminDetails> list = new ArrayList<AdminDetails>();
				AdminDetails adminDetail = new AdminDetails(firstName, lastName,
						age, gender, contactNumber, adminId, password);
				list.add(adminDetail);
                System.out.println("inside loginservlet before insert");
				adminDao.insertAdmin(adminDetail);
				System.out.println("inside loginservlet after insert");
				request.setAttribute("ref", adminDetail);
				request.setAttribute("successmessage",
                        "Successfully registeres,click here to login");
				HttpSession sessionObj = request.getSession(true);
				sessionObj.setMaxInactiveInterval(timeout);
				sessionObj.getMaxInactiveInterval();
				response.setHeader("Refresh", timeout + "; URL=index.jsp");
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("admin-login.jsp");
				dispatcher.forward(request, response);

			}
	}

