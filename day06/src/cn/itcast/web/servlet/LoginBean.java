package cn.itcast.web.servlet;

public class LoginBean{
	public boolean validate(String username){
		boolean flag=false;
		if(username!=null&&"jack".equals(username))
			flag=true;
		return flag;
	}
}
