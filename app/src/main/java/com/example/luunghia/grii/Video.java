package com.example.luunghia.grii;

public class Video {
    public Video(int images, String titles, String details){
        this.setImages(images);
        this.setTitles(titles);
        this.setDetails(details);
    }

    private int images;
    private String  titles, details;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }
}
