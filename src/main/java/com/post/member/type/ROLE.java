package com.post.member.type;

public enum ROLE {
    ADMIN("관리자"),
    USER("사용자");

    private String description;

    ROLE(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
