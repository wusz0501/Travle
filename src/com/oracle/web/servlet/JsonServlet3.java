package com.oracle.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JsonServlet3
 */
@WebServlet("/json3.do")
public class JsonServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JsonServlet3() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		// 获取用户名
		String name = request.getParameter("name");
		System.out.println("你输入的名字是:" + name);
		

		// 判断用户名是否已经存在
		if ("admin".equals(name)) {
			// 服务器通过响应浏览器发送信息,
			out.print("<font color='red'>用户名已经被注册</font>");
		} else {
			out.println("<font color='green'>该用户名可以注册</font>");
		}

	}

}
