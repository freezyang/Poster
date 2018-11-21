package com.post.goods.repository;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class GoodsRepository {

    public static Logger getLog() {
        return log;
    }

}
