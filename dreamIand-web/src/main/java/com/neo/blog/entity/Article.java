package com.neo.blog.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章实体类
 * @author Neo
 */
public class Article implements Serializable {
    private static final long serialVersionUID = -6002408151708964705L;

    private Long id;

    private Long userId;

    private String title;

    private String category;

    private Boolean isPrivate;

    private Date createTime;

    private Date createBy;

    private Date updateTime;

    private Date updateBy;

    private String userAvartUrl;

    private String userNickName;

    private Integer upvoteNum;

    private Integer footNum;

    private Integer commentNum;

    private String content;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Date updateBy) {
        this.updateBy = updateBy;
    }

    public String getUserAvartUrl() {
        return userAvartUrl;
    }

    public void setUserAvartUrl(String userAvartUrl) {
        this.userAvartUrl = userAvartUrl == null ? null : userAvartUrl.trim();
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName == null ? null : userNickName.trim();
    }

    public Integer getUpvoteNum() {
        return upvoteNum;
    }

    public void setUpvoteNum(Integer upvoteNum) {
        this.upvoteNum = upvoteNum;
    }

    public Integer getFootNum() {
        return footNum;
    }

    public void setFootNum(Integer footNum) {
        this.footNum = footNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}