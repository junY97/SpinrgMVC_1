package com.example.springmvc_1.web.frontcontroller.v2;

import com.example.springmvc_1.web.frontcontroller.MyView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author junyeong.jo .
 * @since 2023-07-04
 */
public interface  ControllerV2 {
    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
