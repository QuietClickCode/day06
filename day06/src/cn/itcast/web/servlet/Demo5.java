package cn.itcast.web.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo5 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException ,ServletException{
		Class clazz=this.getClass();
		ClassLoader cl=clazz.getClassLoader();
		InputStream is=cl.getResourceAsStream("/config.properties");
		Properties props=new Properties();
		props.load(is);
		System.out.println(props.getProperty("email"));
	}
}
