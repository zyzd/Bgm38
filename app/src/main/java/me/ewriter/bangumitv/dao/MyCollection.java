package me.ewriter.bangumitv.dao;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "MY_COLLECTION".
 */
@Entity
public class MyCollection {

    @Id
    private Long id;
    private String collection_type;
    private String category;
    private String link_url;
    private String bangumi_id;
    private String normal_image_url;
    private String cover_image_url;
    private String large_image_url;
    private String normal_name;
    private String small_name;
    private String info;
    private String rate_number;
    private String rate_total;
    private String comment;
    private String air_day;

    @Generated
    public MyCollection() {
    }

    public MyCollection(Long id) {
        this.id = id;
    }

    @Generated
    public MyCollection(Long id, String collection_type, String category, String link_url, String bangumi_id, String normal_image_url, String cover_image_url, String large_image_url, String normal_name, String small_name, String info, String rate_number, String rate_total, String comment, String air_day) {
        this.id = id;
        this.collection_type = collection_type;
        this.category = category;
        this.link_url = link_url;
        this.bangumi_id = bangumi_id;
        this.normal_image_url = normal_image_url;
        this.cover_image_url = cover_image_url;
        this.large_image_url = large_image_url;
        this.normal_name = normal_name;
        this.small_name = small_name;
        this.info = info;
        this.rate_number = rate_number;
        this.rate_total = rate_total;
        this.comment = comment;
        this.air_day = air_day;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCollection_type() {
        return collection_type;
    }

    public void setCollection_type(String collection_type) {
        this.collection_type = collection_type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLink_url() {
        return link_url;
    }

    public void setLink_url(String link_url) {
        this.link_url = link_url;
    }

    public String getBangumi_id() {
        return bangumi_id;
    }

    public void setBangumi_id(String bangumi_id) {
        this.bangumi_id = bangumi_id;
    }

    public String getNormal_image_url() {
        return normal_image_url;
    }

    public void setNormal_image_url(String normal_image_url) {
        this.normal_image_url = normal_image_url;
    }

    public String getCover_image_url() {
        return cover_image_url;
    }

    public void setCover_image_url(String cover_image_url) {
        this.cover_image_url = cover_image_url;
    }

    public String getLarge_image_url() {
        return large_image_url;
    }

    public void setLarge_image_url(String large_image_url) {
        this.large_image_url = large_image_url;
    }

    public String getNormal_name() {
        return normal_name;
    }

    public void setNormal_name(String normal_name) {
        this.normal_name = normal_name;
    }

    public String getSmall_name() {
        return small_name;
    }

    public void setSmall_name(String small_name) {
        this.small_name = small_name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getRate_number() {
        return rate_number;
    }

    public void setRate_number(String rate_number) {
        this.rate_number = rate_number;
    }

    public String getRate_total() {
        return rate_total;
    }

    public void setRate_total(String rate_total) {
        this.rate_total = rate_total;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAir_day() {
        return air_day;
    }

    public void setAir_day(String air_day) {
        this.air_day = air_day;
    }

}
