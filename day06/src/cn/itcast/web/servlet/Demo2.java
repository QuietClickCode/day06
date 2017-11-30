package cn.itcast.web.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo2 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		ServletContext context=this.getServletContext();
		String tel=context.getInitParameter("tel");
		String email=context.getInitParameter("email");
		if(email!=null&&tel!=null){
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write("email:"+email+"<br/>");
			response.getWriter().write("tel:"+tel+"<br/>");
		}
	}
	
}