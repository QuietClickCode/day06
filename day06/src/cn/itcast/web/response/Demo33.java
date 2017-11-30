package cn.itcast.web.response;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo33{
	public static String getString(){
		
		String str="";
		String numberAndLetter="01234567890ABCEDFGHIGKLMNOPQRSTUVWXYZabcedfghigklmnopqrstuvwxyz";
		int length=numberAndLetter.length();
		for(int i=1;i<=4;i++){
			if(i==1||i==3){
				while(true){
					Random random=new Random();
					int index=random.nextInt(length);
					String value=numberAndLetter.substring(index,index+1);
					if(value.matches("[0-9]")){
						str+=value;
						break;
					}
				}
			}else{
				while(true){
					Random random=new Random();
					int index=random.nextInt(length);
					String value=numberAndLetter.substring(index,index+1);
					if(value.matches("[A-Za-z]")){
						str+=value;
						break;
					}
				}
			}
		}
		return str;
	}

}
