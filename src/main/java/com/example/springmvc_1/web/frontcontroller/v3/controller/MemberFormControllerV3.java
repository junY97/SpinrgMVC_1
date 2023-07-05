package com.example.springmvc_1.web.frontcontroller.v3.controller;

import com.example.springmvc_1.web.frontcontroller.v3.ControllerV3;
import com.example.springmvc_1.web.frontcontroller.v3.ModelView;
import jakarta.servlet.ServletException;

import java.io.IOException;
import java.util.Map;

/**
 * @author junyeong.jo .
 * @since 2023-06-29
 */
public class MemberFormControllerV3 implements ControllerV3 {
    @Override
    public ModelView process(Map<String, String> paramMap) throws ServletException, IOException {
        return new ModelView("new-form");
    }
}
