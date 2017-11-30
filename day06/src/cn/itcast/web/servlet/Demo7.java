package cn.itcast.web.servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo7 extends HttpServlet{
	protected long getLastModified(HttpServletRequest request){
		System.out.println("getLastModified()");
		String path=this.getServletContext().getRealPath("doc/abc.txt");
		File file=new File(path);
		return file.lastModified();
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		System.out.println("Demo7()");
		InputStream is=this.getServletContext().getResourceAsStream("doc/abc.txt");
		OutputStream os=response.getOutputStream();
		byte[] buf=new byte[1024];
		int len=0;
		while((len=is.read(buf))!=-1){
			os.write(buf,0,len);
		}
		os.close();
		is.close();
	}
}