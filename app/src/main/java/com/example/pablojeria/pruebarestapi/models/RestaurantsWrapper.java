package com.example.pablojeria.pruebarestapi.models;

public class RestaurantsWrapper {

    private int has_total, has_more;
    private RestaurantContainer[] collections;
    private String share_url, display_text;

    public RestaurantsWrapper() {
    }

    public int getHas_total() {
        return this.has_total;
    }

    public void setHas_total(int has_total) {
        this.has_total = has_total;
    }

    public RestaurantContainer[] getCollections() {
        return this.collections;
    }

    public void setCollections(RestaurantContainer[] collections) {
        this.collections = collections;
    }

    public String getShare_url() {
        return this.share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public int getHas_more() {
        return this.has_more;
    }

    public void setHas_more(int has_more) {
        this.has_more = has_more;
    }

    public String getDisplay_text() {
        return this.display_text;
    }

    public void setDisplay_text(String display_text) {
        this.display_text = display_text;
    }
}
