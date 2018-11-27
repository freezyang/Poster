package com.post.repository;

import com.post.mapper.GoodsMapper;
import com.post.model.Goods;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class GoodsRepository {

    public static Logger getLog() {
        return log;
    }

    private GoodsMapper goodsMapper;

    public int insertGoods(Goods goods) {
        return goodsMapper.insertGoods(goods);
    }
}
