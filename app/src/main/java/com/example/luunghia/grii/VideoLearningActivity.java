package com.example.luunghia.grii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class VideoLearningActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Video> list = new ArrayList<Video>();
    String[] title, detail;
    int[] images = {R.drawable.alphabet_image,
            R.drawable.alphabet_image,
            R.drawable.alphabet_image,
            R.drawable.alphabet_image,
            R.drawable.alphabet_image};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_learning);
        title = getResources().getStringArray(R.array.lesson_titles);
        detail = getResources().getStringArray(R.array.lesson_details);
        int count;
        for(count=0;count<images.length ;count++){
            Video video = new Video(images[count], title[count], detail[count]);
            list.add(video);
        }
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view_video_learning);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new VideoLearningRecyclerAdapter(list, this);
        recyclerView.setAdapter(adapter);
    }
}
