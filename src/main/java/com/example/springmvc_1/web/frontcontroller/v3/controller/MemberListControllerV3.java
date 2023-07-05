package com.example.springmvc_1.web.frontcontroller.v3.controller;

import com.example.springmvc_1.member.Member;
import com.example.springmvc_1.member.MemberRepository;
import com.example.springmvc_1.web.frontcontroller.v3.ControllerV3;
import com.example.springmvc_1.web.frontcontroller.v3.ModelView;
import jakarta.servlet.ServletException;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author junyeong.jo .
 * @since 2023-06-29
 */
public class MemberListControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) throws ServletException, IOException {
        System.out.println("MvcMemberListServlet.service");

        List<Member> members = memberRepository.findAll();

        ModelView mv = new ModelView("members");
        mv.getModel().put("members", members);
        return mv;
    }
}
