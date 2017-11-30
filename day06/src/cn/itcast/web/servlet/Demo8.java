package cn.itcast.web.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo8 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		ServletContext context=this.getServletContext();
		InputStream is=context.getResourceAsStream("/WEB-INF/classes/cn/itcast/web/config/config.properties");
		Properties props=new Properties();
		props.load(is);
		int rows =Integer.parseInt(props.getProperty("rows"));
		int cols=Integer.parseInt(props.getProperty("cols"));
		PrintWriter pw=response.getWriter();
		pw.write("<table border='1' align='center'>");
		for(int i=0;i<rows;i++){
			if(i%2==0){
				
			pw.write("<tr style='color:red'>");
			}else{
				pw.write("<tr style='color:blue'>");
			}
			for(int j=0;j<cols;j++){
				pw.write("<td>");
				pw.write("&#x25C7;");
				pw.write("</td>");
			}
			pw.write("</tr>");
		}
		pw.write("</table>");
	}
}
