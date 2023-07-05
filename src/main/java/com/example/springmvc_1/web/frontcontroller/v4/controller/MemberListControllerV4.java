package com.example.springmvc_1.web.frontcontroller.v4.controller;

import com.example.springmvc_1.member.Member;
import com.example.springmvc_1.member.MemberRepository;
import com.example.springmvc_1.web.frontcontroller.v4.ControllerV4;
import jakarta.servlet.ServletException;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author junyeong.jo .
 * @since 2023-06-29
 */
public class MemberListControllerV4 implements ControllerV4 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) throws ServletException, IOException {
        System.out.println("MvcMemberListServlet.service");

        List<Member> members = memberRepository.findAll();

        model.put("members", members);
        return "members";
    }

}
