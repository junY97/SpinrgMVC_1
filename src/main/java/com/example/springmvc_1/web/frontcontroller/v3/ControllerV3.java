package com.example.springmvc_1.web.frontcontroller.v3;

import jakarta.servlet.ServletException;

import java.io.IOException;
import java.util.Map;

/**
 * @author junyeong.jo .
 * @since 2023-07-04
 */
public interface ControllerV3 {
    ModelView process(Map<String, String> paramMap) throws ServletException, IOException;
}
