package com.post.model;

import com.post.type.Site;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Goods {
    private Long goodsNo;
    private String contents;
    private String creator;
    private LocalDateTime createDt;
    private Site[] sites;
}
