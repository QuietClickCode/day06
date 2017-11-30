package cn.itcast.web.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo12 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		ServletContext context=this.getServletContext();
		String username=(String)context.getAttribute("username");
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().write("用户名:"+username);
	}
}