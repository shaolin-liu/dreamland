package com.neo.blog.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * 点赞
 * @author Neo
 */
public class Upvote implements Serializable {
    private static final long serialVersionUID = 7322870706216637800L;
    private Long id;

    private Long userId;

    private Long articleId;

    private String upvoteIp;

    private Byte vote;

    private Byte foot;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getUpvoteIp() {
        return upvoteIp;
    }

    public void setUpvoteIp(String upvoteIp) {
        this.upvoteIp = upvoteIp == null ? null : upvoteIp.trim();
    }

    public Byte getVote() {
        return vote;
    }

    public void setVote(Byte vote) {
        this.vote = vote;
    }

    public Byte getFoot() {
        return foot;
    }

    public void setFoot(Byte foot) {
        this.foot = foot;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}