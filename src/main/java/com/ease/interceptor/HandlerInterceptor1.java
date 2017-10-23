package com.ease.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

//测试拦截器
public class HandlerInterceptor1 implements HandlerInterceptor{

	//执行handler完成执行此方法
	//应用场景：统一的异常处理，统一的日志处理
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("HandlerIntecptor1-afterCompletion");
	}

	//进入Handler方法之后，返回modelAndView之前执行
	//应用场景从modelAndView出发：将公用的模型数据（菜单的导航）在这里传到视图，也可以在这里同意指定视图
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("HandlerIntecptor1-postHanlder");
	}

	//进入Handler方法之前执行
	//用于身份认证，身份授权（登陆认证和权限校验）
	//比较身份认证，如果认证通过表示当前用户没有登陆，需要此方法拦截不再向下执行
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		
		//System.out.println("HandlerIntecptor1-preHanlder");
		return true;//表示拦截，不向下放行；return true表示放行
	}

}
