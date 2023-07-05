package com.example.springmvc_1.web.frontcontroller.v4.controller;

import com.example.springmvc_1.member.Member;
import com.example.springmvc_1.member.MemberRepository;
import com.example.springmvc_1.web.frontcontroller.v4.ControllerV4;
import jakarta.servlet.ServletException;

import java.io.IOException;
import java.util.Map;

/**
 * @author junyeong.jo .
 * @since 2023-06-29
 */
public class MemberSaveControllerV4 implements ControllerV4 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) throws ServletException, IOException {
        System.out.println("MemberSaveServlet.service");
        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);

        memberRepository.save(member);
        model.put("member", member);
        return "save-result";
    }
}
