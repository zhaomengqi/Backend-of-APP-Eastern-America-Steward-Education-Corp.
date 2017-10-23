package com.ease.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		//获取请求的url,判断是不是公开地址
		String url = request.getRequestURI();
		if(url.indexOf("form/host3")>=0||url.indexOf("form/host4")>=0||url.indexOf("form/date")>=0||url.indexOf("form/host2")>=0||url.indexOf("form/host1")>=0||url.indexOf("hello22")>=0||url.indexOf("check2")>=0||url.indexOf("login")>=0 ||url.indexOf("check")>=0|| url.indexOf("login2")>=0){
			return true;
		}
		//判断session
		HttpSession session = request.getSession();
		String admin = (String) session.getAttribute("admin");
		String pass = (String) session.getAttribute("pass");
		if(admin != null && pass != null){
			return true;
		}
		
		//执行这里表示用户身份需要认证，跳转登陆页
		request.getRequestDispatcher("/user/login").forward(request, response);
		//response.sendRedirect(request.getContextPath()+"/user/login");
		return false;
	}

}
