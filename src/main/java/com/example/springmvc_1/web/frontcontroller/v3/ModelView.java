package com.example.springmvc_1.web.frontcontroller.v3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author junyeong.jo .
 * @since 2023-07-04
 */
public class ModelView {
    private String viewName;
    private Map<String, Object> model = new HashMap<>();

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }

    public ModelView(String viewName) {
        this.viewName = viewName;
    }
}
