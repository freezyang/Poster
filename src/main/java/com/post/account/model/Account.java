package com.post.account.model;

import java.time.LocalDateTime;


import com.post.account.type.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Account {
    private Long accountNo;
    private Role role;
    @NonNull
    private String id;
    private String password;
    private String name;
    private String cellPhone;
    private String phone;
    private String email;
    private String creator;
    private LocalDateTime createDt;

}
