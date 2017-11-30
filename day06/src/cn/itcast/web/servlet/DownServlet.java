package cn.itcast.web.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException{
		ServletConfig config=this.getServletConfig();
		String filePath=config.getInitParameter("filePath");
		File file=new File(filePath);
		response.setHeader("content-disposition","attachment;filename="+file.getName());
		int len=0;
		byte[] bytes=new byte[1024];
		InputStream is=new FileInputStream(file);
		OutputStream os=response.getOutputStream();
		while((len=is.read(bytes))!=-1){
			os.write(bytes,0,len);
		}
		is.close();
		os.close();
	}
}