package com.post.account.type;

public enum Role {
    ADMIN("관리자"),
    USER("사용자");

    private String description;

    Role(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
