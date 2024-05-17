package com.betrybe.podcast.model;

/**
 * Podcast Class
 */
public class Podcast {

    /*
          Attributes from Podcast Class
         */
    private Long id;
    private String name;
    private String url;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
