package com.example.luunghia.grii;

import android.media.MediaPlayer;
import android.widget.ImageButton;

public class DataDetailsLesson {
    private MediaPlayer lessonSound;
    public DataDetailsLesson(MediaPlayer lessonSound){
        this.lessonSound=lessonSound;
    }

    public MediaPlayer getLessonSound() {
        return lessonSound;
    }

    public void setLessonSound(MediaPlayer lessonSound) {
        this.lessonSound = lessonSound;
    }
}
