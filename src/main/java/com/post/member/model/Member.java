package com.post.member.model;

import com.post.member.type.ROLE;
import lombok.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.LocalDateTime;

@ToString
@Getter @Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Member {
    private Long memberNo;
    private ROLE role;
    @NonNull
    private String id;
    private String password;
    private String name;
    private String cellPhone;
    private String phone;
    private String email;
    private String creator;
    private LocalDateTime createDt;

    public Member(Long memberNo) {
        this.memberNo = memberNo;
    }
}
