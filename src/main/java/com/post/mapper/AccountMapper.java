package com.post.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.post.model.Account;

@Mapper
public interface AccountMapper {
   public Account findById(Account account);

   public int insert(Account account);
}
