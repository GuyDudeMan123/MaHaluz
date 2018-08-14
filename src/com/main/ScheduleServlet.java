package com.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.DataUtils;

/**
 * Servlet implementation class ScheduleServlet
 */
@WebServlet("/ScheduleServlet")
public class ScheduleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ScheduleServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		boolean[] shiftsArray = createArray(request);
		Employee emp = (Employee) request.getSession(true).getAttribute("user");
		try {
			Shifts shifts = new Shifts(emp, shiftsArray);
			DataUtils.addShifts(shifts);
		} catch (Exception e) {
			e.printStackTrace();
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

	private boolean[] createArray(HttpServletRequest request) {
		boolean[] shifts = new boolean[20];
		String[] params = { "sunday1", "sunday2", "sunday3", "sunday4", "sunday5", "monday1", "monday2", "monday3",
				"tuesday1", "tuesday2", "tuesday3", "wednesday1", "wednesday2", "wednesday3", "thursday1", "thursday2",
				"thursday3", "thursday4", "thursday5", "friday1" };
		for (int i = 0; i < params.length; i++) {
			shifts[i] = Boolean.parseBoolean(request.getParameter(params[i]));
			//System.out.println("request.getParameter(" + params[i] + ") = " + request.getParameter(params[i]));
			//System.out.println("shifts[" + i + "] = " + shifts[i]);
		}
		return shifts;
	}

}
