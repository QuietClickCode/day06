package cn.itcast.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String username=request.getParameter("username");
		LoginBean loginBean=new LoginBean();
		boolean flag=loginBean.validate(username);
		if(flag){
			this.getServletContext().getRequestDispatcher("/success.html").forward(request,response);
		}else{
			this.getServletContext().getRequestDispatcher("/fail.html").forward(request,response);
		}
	}
}