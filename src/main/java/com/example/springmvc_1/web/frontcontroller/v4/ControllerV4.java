package com.example.springmvc_1.web.frontcontroller.v4;

import jakarta.servlet.ServletException;

import java.io.IOException;
import java.util.Map;

/**
 * @author junyeong.jo .
 * @since 2023-07-04
 */

public interface ControllerV4 {
    String process(Map<String, String> paramMap, Map<String, Object> model) throws ServletException, IOException;
}
