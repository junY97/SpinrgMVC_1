package com.example.springmvc_1.web.frontcontroller.v3.controller;

import com.example.springmvc_1.member.Member;
import com.example.springmvc_1.member.MemberRepository;
import com.example.springmvc_1.web.frontcontroller.v3.ControllerV3;
import com.example.springmvc_1.web.frontcontroller.v3.ModelView;
import jakarta.servlet.ServletException;

import java.io.IOException;
import java.util.Map;

/**
 * @author junyeong.jo .
 * @since 2023-06-29
 */
public class MemberSaveControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) throws ServletException, IOException {
        System.out.println("MemberSaveServlet.service");
        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);

        memberRepository.save(member);

        ModelView mv = new ModelView("save-result");
        mv.getModel().put("member", member);
        return mv;
    }
}
