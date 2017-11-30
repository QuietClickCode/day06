package cn.itcast.web.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo1 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String url=request.getRequestURL().toString();
		String uri=request.getRequestURI();
		String query=request.getQueryString();
		String pathInfo=request.getPathInfo();
		String clientIP=request.getRemoteAddr();
		String clientHOST=request.getRemoteHost();
		int clientPORT=request.getRemotePort();
		String serverIP=request.getLocalAddr();
		String serverHOST=request.getLocalName();
		int serverPORT=request.getLocalPort();
		
		System.out.println("url:"+url);
		System.out.println("uri:"+uri);
		System.out.println("query:"+query);
		System.out.println("pathInfo:"+pathInfo);
		System.out.println("clientIP:"+clientIP);
		System.out.println("clientHOST:"+clientHOST);
		System.out.println("clientPort:"+clientPORT);
		System.out.println("serverIP:"+serverIP);
		System.out.println("serverHOST"+serverHOST);
		System.out.println("serverPORT:"+serverPORT);
	}
	
}