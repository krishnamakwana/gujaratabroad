package com.intelliworkz.gujaratabroad;

import org.json.JSONObject;

/**
 * Created by pc-6 on 6/22/2017.
 */

public class NewsModel {

    String news_id;
    String newsTitle;
    String newsDetails;
    String newsImg;
    String newsDate;
    public NewsModel(String news_id, String newsTitle, String newsDetails, String newsImg, String newsDate) {

        this.news_id=news_id;
        this.newsTitle=newsTitle;
        this.newsDetails=newsDetails;
        this.newsImg=newsImg;
        this.newsDate=newsDate;
    }



    public String getNewsId() {
        return news_id;
    }

    public void setNewsId(String news_id) {
        this.news_id = news_id;
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
