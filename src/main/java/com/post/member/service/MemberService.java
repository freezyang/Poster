package com.post.member.service;

import com.post.member.model.Member;
import com.post.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public Member selectMember(Long memberNo) {
        return memberRepository.selectMember(memberNo);
    }
}
