/**
 * @description 
 * @date 2016-9-7
 * @author hxg	
 */
package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {
	String encode;

	@Override
	public void destroy() {
		System.out.println("destroy...." + encode);
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println(arg0.getFilterName() + "init..."
				+ arg0.getInitParameter("encode"));
	}

}
