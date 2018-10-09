package com.ads;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "Ads")
public class Ads {

    @Field(value = "_id")
    private String _id;

    @Field(value = "creatTime")
    private Date creatTime;

    @Field(value = "currentTime")
    private Date currentTime;

    @Field(value = "countAds24h")
    private Long countAds24h;

    @Field(value = "countTotalShow")
    private Long countTotalShow;

    @Field(value = "countBotClick")
    private Long countBotClick;

    @Field(value = "countRealClick")
    private Long countRealClick;

    @Field(value = "isShortcut")
    private Long isShortcut;

    @Field(value = "totalTime")
    private Long totalTime;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public Long getCountAds24h() {
        return countAds24h;
    }

    public void setCountAds24h(Long countAds24h) {
        this.countAds24h = countAds24h;
    }

    public Long getCountTotalShow() {
        return countTotalShow;
    }

    public void setCountTotalShow(Long countTotalShow) {
        this.countTotalShow = countTotalShow;
    }

    public Long getCountBotClick() {
        return countBotClick;
    }

    public void setCountBotClick(Long countBotClick) {
        this.countBotClick = countBotClick;
    }

    public Long getCountRealClick() {
        return countRealClick;
    }

    public void setCountRealClick(Long countRealClick) {
        this.countRealClick = countRealClick;
    }

    public Long getIsShortcut() {
        return isShortcut;
    }

    public void setIsShortcut(Long isShortcut) {
        this.isShortcut = isShortcut;
    }

    public Long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }
}

