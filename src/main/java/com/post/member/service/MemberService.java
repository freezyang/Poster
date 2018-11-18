package com.post.member.service;

import com.post.base.utils.SHA256Util;
import com.post.member.model.Member;
import com.post.member.repository.MemberRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public Member selectMember(Long memberNo) {
        return memberRepository.selectMember(new Member(memberNo));
    }

    public Member checkLogin(String id, String password) {
        Member member = memberRepository.selectMember(new Member(id));

        if (Objects.isNull(member) || !StringUtils.equals(SHA256Util.encryt(password), member.getPassword())) {
            throw new IllegalArgumentException("아이디 또는 비밀번호가 잘못됐습니다.");
        }

        return member;
    }
}
