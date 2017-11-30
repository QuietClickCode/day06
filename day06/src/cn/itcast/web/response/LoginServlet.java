package cn.itcast.web.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String checkCode=request.getParameter("checkCode");
		System.out.println("用户名:"+username);
		System.out.println("密码:"+password);
		System.out.println("验证码:"+checkCode);
		response.sendRedirect("/day06/message.html");
	}
}
