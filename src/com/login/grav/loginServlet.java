package com.login.grav;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.logic.grav.loginServletClass;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname,pwd;
		uname = request.getParameter("username");
		pwd = request.getParameter("password");
		
		loginServletClass ls = new loginServletClass();
		boolean result = ls.authenticate(uname, pwd);
		
		if(result){
			response.sendRedirect("success.jsp");
		}
		else{
			response.sendRedirect("login.jsp");
		}
	}

}
