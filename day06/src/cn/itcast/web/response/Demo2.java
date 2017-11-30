package cn.itcast.web.response;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo2 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException ,ServletException{
		String path=this.getServletContext().getRealPath("images/动漫.jpg");
		File file=new File(path);
		response.setHeader("content-disposition","attachment;filename="+URLEncoder.encode(file.getName(),"UTF-8"));
		InputStream is=new FileInputStream(file);
		OutputStream os=response.getOutputStream();
		int len=0;
		byte[] bytes=new byte[1024];
		while((len=is.read(bytes))!=-1){
			os.write(bytes,0,len);
		}
		is.close();
		os.close();
		
	}
}