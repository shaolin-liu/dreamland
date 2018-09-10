package com.neo.blog.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 评论
 * @author Neo
 */
public class Comment implements Serializable {
    private static final long serialVersionUID = -9072140983192676214L;
    private Long id;

    private Long articleId;

    private Long userId;

    private Long beUserId;

    private Date createTime;

    private String subcommentids;

    private Integer numbers;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBeUserId() {
        return beUserId;
    }

    public void setBeUserId(Long beUserId) {
        this.beUserId = beUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSubcommentids() {
        return subcommentids;
    }

    public void setSubcommentids(String subcommentids) {
        this.subcommentids = subcommentids == null ? null : subcommentids.trim();
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}