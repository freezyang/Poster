package com.post.member.controller;

import com.post.member.model.Member;
import com.post.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/{memberNo}")
    public Member getMember(@PathVariable("memberNo") Long memberNo) {
        return memberService.selectMember(memberNo);
    }

    @RequestMapping(value = "/login/check", method = RequestMethod.POST)
    public Map checkLogin(HttpServletRequest request, @RequestParam("id") String id, @RequestParam("password") String password) {
        Map result = new HashMap<>();
        String code = "OK";
        try {
            Member member = memberService.checkLogin(id, password);
            request.getSession().setAttribute("login", member);
        } catch (Exception e) {
            code = "NOK";
            result.put("msg", e.getMessage());
        }

        result.put("code", code);
        return result;
    }
}
