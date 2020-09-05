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
        // ������Ҳ���Դ��첽�����л�ȡ����
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		System.out.println("��������ȡ����������͵�����,name=" + name + ",password=" + password);
		
		// ������ݾ��൱�����Ǵ����ݿ��в�ѯ���Ľ��
		Student stu1 = new Student("��1",21, "����");
		Student stu2 = new Student("��2",22, "����");
		Student stu3 = new Student("��3",23, "����");
		Student stu4 = new Student("��4",24, "����");
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		
		// ������Ҫ��Student�Ķ���ת��ΪJSON��ʽ���ַ���
		JSONArray jsonArray = JSONArray.fromObject(list);  
		System.out.println(jsonArray);
		
		// ��ͻ���д��json����
		response.setCharacterEncoding("utf-8");	
		
		// ͨ��response��ȡPrintWriter,�����PrintWriter��д������ݾ͵��������
		PrintWriter out = response.getWriter(); 
		out.print(jsonArray);
		out.flush();
		out.close();
		
	}

}
