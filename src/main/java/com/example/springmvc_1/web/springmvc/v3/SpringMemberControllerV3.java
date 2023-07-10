package com.example.springmvc_1.web.springmvc.v3;

import com.example.springmvc_1.member.Member;
import com.example.springmvc_1.member.MemberRepository;
import jakarta.servlet.ServletException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

/**
 * @author junyeong.jo .
 * @since 2023-07-10
 */
@Controller
@RequestMapping("/springmvc/v3/members")
public class SpringMemberControllerV3 {

    private final MemberRepository memberRepository = MemberRepository.getInstance();

    @RequestMapping("/new-form")
    public String newForm() {
        return "new-form";
    }
    @RequestMapping("/save")
    public String process(
            @RequestParam("username") String username,
            @RequestParam("age") int age,
            Model model
    ) throws ServletException, IOException {
        System.out.println("MemberSaveServlet.service");

        Member member = new Member(username, age);

        memberRepository.save(member);

        model.addAttribute("member", member);
        return "save-result";
    }

    @RequestMapping
    public String members(Model model) throws ServletException, IOException {
        System.out.println("MvcMemberListServlet.service");

        List<Member> members = memberRepository.findAll();

        model.addAttribute("members", members);

        return "members";
    }
}
