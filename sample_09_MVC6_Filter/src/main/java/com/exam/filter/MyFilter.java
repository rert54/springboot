package com.exam.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        System.out.println("요청 filter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("응답 filter");
    }
}
