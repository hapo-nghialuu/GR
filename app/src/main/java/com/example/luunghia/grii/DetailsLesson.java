package com.example.luunghia.grii;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.luunghia.grii.R;

import java.util.ArrayList;

public class DetailsLesson extends AppCompatActivity {
    Button next_btn, pre_btn, learn_btn;
    ImageView mImageView;
    AlertDialog mAlertDialog;
    public static   int position = 0;
    public static int correct;

    public static int[] images_learn = {R.drawable.a, R.drawable.b,
            R.drawable.c, R.drawable.d,
            R.drawable.e, R.drawable.f,
            R.drawable.g, R.drawable.h,
            R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_lesson);

        final MediaPlayer[] sounds_learn = {MediaPlayer.create(this, R.raw.a), MediaPlayer.create(this, R.raw.b),
                MediaPlayer.create(this, R.raw.c), MediaPlayer.create(this, R.raw.d),
                MediaPlayer.create(this, R.raw.e), MediaPlayer.create(this, R.raw.f),
                MediaPlayer.create(this, R.raw.g), MediaPlayer.create(this, R.raw.h),
                MediaPlayer.create(this, R.raw.i), MediaPlayer.create(this, R.raw.j),
                MediaPlayer.create(this, R.raw.k), MediaPlayer.create(this, R.raw.l)};
        learn_btn = (Button)findViewById(R.id.learn_btn);
        next_btn = (Button)findViewById(R.id.learn_next_btn);
        pre_btn = (Button)findViewById(R.id.learn_previous_btn);
        mImageView = (ImageView)findViewById(R.id.learn_image);

        Intent intent = getIntent();
        intent.getIntExtra("id",0);

        sounds_learn[position].start();
        mImageView.setImageResource(images_learn[position]);

        learn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sounds_learn[position].start();
            }
        });

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position < images_learn.length-1) {
                    position++;
                    sounds_learn[position].start();
                    mImageView.setImageResource(images_learn[position]);
                } else {
                    mAlertDialog = CreateDialog_Next();
                    mAlertDialog.show();
                }
            }
        });

        pre_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position>0){
                    position--;
                    sounds_learn[position].start();
                    mImageView.setImageResource(images_learn[position]);
                } else {
                    mAlertDialog = CreateDialog_Previous();
                    mAlertDialog.show();
                }
            }
        });
    }
    private AlertDialog CreateDialog_Previous() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Warning");
        builder.setMessage("Can't Previous");
        builder.setCancelable(false);
        builder.setPositiveButton("Back to StartScreen",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(DetailsLesson.this, StartActivity.class);
                        startActivity(intent);
                        finish();
                        ;
                    }
                });
        builder.setNeutralButton("OK", null);
        AlertDialog dialog = builder.create();
        return dialog;
    }

    private AlertDialog CreateDialog_Next() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Warning");
        builder.setMessage("Can't Next");
        builder.setCancelable(false);
        builder.setPositiveButton("Back to StartScreen",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(DetailsLesson.this, StartActivity.class);
                        startActivity(intent);
                        finish();
                        ;
                    }
                });
        builder.setNeutralButton("OK", null);
        AlertDialog dialog = builder.create();
        return dialog;
    }
}

