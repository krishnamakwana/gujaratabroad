package com.intelliworkz.gujaratabroad;

/**
 * Created by pc-6 on 6/22/2017.
 */

public class NewsModel {
    String newsCatId;
    String newsTitle;
    String newsDetails;
    String newsImg;
    String newsDate;
    public NewsModel(String newsCatId, String newsTitle, String newsDetails, String newsImg, String newsDate) {
        this.newsCatId=newsCatId;
        this.newsTitle=newsTitle;
        this.newsDetails=newsDetails;
        this.newsImg=newsImg;
        this.newsDate=newsDate;
    }

    public String getNewsCatId() {
        return newsCatId;
    }

    public void setNewsCatId(String newsCatId) {
        this.newsCatId = newsCatId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsDetails() {
        return newsDetails;
    }

    public void setNewsDetails(String newsDetails) {
        this.newsDetails = newsDetails;
    }

    public String getNewsImg() {
        return newsImg;
    }

    public void setNewsImg(String newsImg) {
        this.newsImg = newsImg;
    }

    public String getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(String newsDate) {
        this.newsDate = newsDate;
    }
}