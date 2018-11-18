package com.post.account.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.post.account.model.Account;

@Mapper
public interface AccountMapper {
   public Account findById(String id);
}
