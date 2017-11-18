package com.example.pablojeria.pruebarestapi.models;

public class Restaurant {

    private int collection_id, res_count;
    private String image_url, share_url, description, title, url;

    public Restaurant() {
    }

    public int getCollection_id() {
        return this.collection_id;
    }

    public void setCollection_id(int collection_id) {
        this.collection_id = collection_id;
    }

    public int getRes_count() {
        return this.res_count;
    }

    public void setRes_count(int res_count) {
        this.res_count = res_count;
    }

    public String getImage_url() {
        return this.image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getShare_url() {
        return this.share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
