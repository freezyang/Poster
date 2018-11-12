package com.post.member.controller;

import com.post.member.model.Member;
import com.post.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @ResponseBody
    @RequestMapping("/{memberNo}")
    public Member getMember(@PathVariable("memberNo") Long memberNo) {
        return memberService.selectMember(memberNo);
    }
}
