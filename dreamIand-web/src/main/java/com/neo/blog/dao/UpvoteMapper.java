package com.neo.blog.dao;

import com.neo.blog.entity.Upvote;

public interface UpvoteMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Upvote record);

    int insertSelective(Upvote record);

    Upvote selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Upvote record);

    int updateByPrimaryKey(Upvote record);
}