package com.oracle.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.domain.Student;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class JsonServlet1
 */
@WebServlet("/json2.do")
public class JsonServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JsonServlet2() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        // 服务器也可以从异步请求中获取数据
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		System.out.println("服务器获取到浏览器发送的数据,name=" + name + ",password=" + password);
		
		// 这个数据就相当于我们从数据库中查询到的结果
		Student stu1 = new Student("张1",21, "北京");
		Student stu2 = new Student("张2",22, "北京");
		Student stu3 = new Student("张3",23, "北京");
		Student stu4 = new Student("张4",24, "北京");
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		
		// 我们需要把Student的对象转换为JSON格式的字符串
		JSONArray jsonArray = JSONArray.fromObject(list);  
		System.out.println(jsonArray);
		
		// 向客户端写会json数据
		response.setCharacterEncoding("utf-8");	
		
		// 通过response获取PrintWriter,向这个PrintWriter中写入的数据就到了浏览器
		PrintWriter out = response.getWriter(); 
		out.print(jsonArray);
		out.flush();
		out.close();
		
	}

}
