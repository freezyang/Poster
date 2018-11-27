package com.post.type;

public enum Site {
    S1("NAVER_BLOG", "네이버 블로그");

    private String description;
    private String name;

    Site(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
