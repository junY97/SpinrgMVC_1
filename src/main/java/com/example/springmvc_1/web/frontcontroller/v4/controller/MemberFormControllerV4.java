package com.example.springmvc_1.web.frontcontroller.v4.controller;

import com.example.springmvc_1.web.frontcontroller.v4.ControllerV4;
import jakarta.servlet.ServletException;

import java.io.IOException;
import java.util.Map;

/**
 * @author junyeong.jo .
 * @since 2023-06-29
 */
public class MemberFormControllerV4 implements ControllerV4 {
    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) throws ServletException, IOException {
        return "new-form";
    }
}
