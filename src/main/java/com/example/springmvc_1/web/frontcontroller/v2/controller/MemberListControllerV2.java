package com.example.springmvc_1.web.frontcontroller.v2.controller;

import com.example.springmvc_1.member.Member;
import com.example.springmvc_1.member.MemberRepository;
import com.example.springmvc_1.web.frontcontroller.MyView;
import com.example.springmvc_1.web.frontcontroller.v2.ControllerV2;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

/**
 * @author junyeong.jo .
 * @since 2023-06-29
 */
public class MemberListControllerV2 implements ControllerV2 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MvcMemberListServlet.service");

        List<Member> members = memberRepository.findAll();

        request.setAttribute("members", members);

        return new MyView("/WEB-INF/views/members.jsp");
    }
}
