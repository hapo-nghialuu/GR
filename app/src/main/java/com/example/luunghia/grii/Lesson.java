package com.example.luunghia.grii;

import android.media.MediaPlayer;
import android.widget.ImageButton;

import com.example.luunghia.grii.R;

import java.util.ArrayList;


public class Lesson {


    private String images;
    private String titles;

    public int getLessonid() {
        return lessonid;
    }

    public void setLessonid(int lessonid) {
        this.lessonid = lessonid;
    }

    private int lessonid;

    public Lesson(String images, String titles, int lessonid) {
        this.images = images;
        this.titles = titles;
        this.lessonid = lessonid;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }
}
