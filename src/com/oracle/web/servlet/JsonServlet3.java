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

		// ��ȡ�û���
		String name = request.getParameter("name");
		System.out.println("�������������:" + name);
		

		// �ж��û����Ƿ��Ѿ�����
		if ("admin".equals(name)) {
			// ������ͨ����Ӧ�����������Ϣ,
			out.print("<font color='red'>�û����Ѿ���ע��</font>");
		} else {
			out.println("<font color='green'>���û�������ע��</font>");
		}

	}

}
