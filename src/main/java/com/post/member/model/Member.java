package com.post.member.model;

import com.post.member.type.ROLE;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.LocalDateTime;

public class Member {
    private Long memberNo;
    private ROLE role;
    private String id;
    private String password;
    private String name;
    private String cellPhone;
    private String phone;
    private String email;
    private String creator;
    private LocalDateTime createDt;

    public Long getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(Long memberNo) {
        this.memberNo = memberNo;
    }

    public ROLE getRole() {
        return role;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreateDt() {
        return createDt;
    }

    public void setCreateDt(LocalDateTime createDt) {
        this.createDt = createDt;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
