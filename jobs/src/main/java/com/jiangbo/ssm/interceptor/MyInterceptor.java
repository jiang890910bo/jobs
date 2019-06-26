package com.jiangbo.ssm.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyInterceptor extends HandlerInterceptorAdapter {

	private static final Integer BEGIN = 9;
	private static final Integer END = 6;
	
	/**
	 * preHandle()：这个方法在业务处理器处理请求之前被调用，
	 * 在该方法中对用户请求request进行处理。如果程序员决定该拦截器对请求进行拦截处理后还要调用其他的拦截器，
	 * 或者是业务处理器去进行处理，则返回true；如果程序员决定不需要再调用其他的组件去处理请求，则返回false。
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		Calendar cal = Calendar.getInstance();  
        int hour = cal.get(Calendar.HOUR_OF_DAY); // 获取当前时间  
        if (hour >= BEGIN && hour <= END) {
        	System.out.println("当前是上班时间："+new SimpleDateFormat("HH:mm:sss").format(new Date()));
            return true;  
        } else {  
            //response.sendRedirect(outsideOfficeHoursPage); // 返回提示页面  
            return false;  
        }  
	}
	
	/**
	 * postHandle()：这个方法在业务处理器处理完请求后，
	 * 但是DispatcherServlet向客户端返回请求前被调用，在该方法中对用户请求request进行处理。
	 */
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}
	
	/**
	 * afterCompletion()：这个方法在DispatcherServlet完全处理完请求后被调用，可以在该方法中进行一些资源清理的操作。
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}
}
