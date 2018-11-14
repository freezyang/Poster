package com.post.member.repository;

import com.post.member.mapper.MemberMapper;
import com.post.member.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @Autowired
    private MemberMapper memberMapper;

    public Member selectMember(Member member) {
        return memberMapper.selectMember(member);
    }

}
