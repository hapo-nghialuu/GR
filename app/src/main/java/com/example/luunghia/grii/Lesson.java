package com.example.luunghia.grii;

import android.media.MediaPlayer;
import android.widget.ImageButton;

import com.example.luunghia.grii.R;

import java.util.ArrayList;


public class Lesson {

    public Lesson(int images, String titles){
        this.setImages(images);
        this.setTitles(titles);
    }

    private int images;
    private String titles;

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
