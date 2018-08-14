package com.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hibernate.DataUtils;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	//private static final DataUtils dataUtil = new DataUtils();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		Employee user;
		HttpSession hSession = request.getSession(true);
		String empId = request.getParameter("employee_id");
		String pass = request.getParameter("password");
		boolean confirmLogin = DataUtils.confirmLogin(empId, pass);
		if (confirmLogin) {
			user = DataUtils.getEmployee(empId);
			if (user.getEmployee_id().equals("admin")) {
				//TODO redirect admin page
			}
			hSession.setAttribute("user", user);
			response.sendRedirect("luz.jsp"); //user page
		} else {
			PrintWriter writer = response.getWriter();
			writer.println("User " + empId + " not found with pass " + pass);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}


}
