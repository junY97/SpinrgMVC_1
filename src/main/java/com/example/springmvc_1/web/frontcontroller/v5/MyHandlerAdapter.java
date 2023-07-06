package com.example.springmvc_1.web.frontcontroller.v5;


import com.example.springmvc_1.web.frontcontroller.v3.ModelView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
/**
 * @author junyeong.jo .
 * @since 2023-07-06
 */

public interface MyHandlerAdapter {
    boolean supports(Object handler);
    ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException;
}