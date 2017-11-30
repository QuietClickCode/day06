package cn.itcast.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo6 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String uri=request.getRequestURI();
		System.out.println("uri:"+uri);
		if(uri!=null&&uri.endsWith("html")){
			
		String html=this.getServletConfig().getInitParameter("html");
		if(html!=null){
			
		long end=Long.parseLong(html)*1000+System.currentTimeMillis();
		response.setDateHeader("expires",end);
		}
		}
	}
}