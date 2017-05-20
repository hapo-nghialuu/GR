package com.example.luunghia.grii;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ListenGuessActivity extends AppCompatActivity {
    Button next_btn;
    MediaPlayer mMediaPlayer=null;
    ImageButton mImageButton;
    RadioGroup rg_listen;
    RadioButton r1, r2, r3;

    public static String answers[];
    String opt1[], opt2[], opt3[];
    public static int position = 0;
    public static int correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen_guess);

        final MediaPlayer[] sounds_question = {MediaPlayer.create(this, R.raw.a), MediaPlayer.create(this, R.raw.b),
                MediaPlayer.create(this, R.raw.c), MediaPlayer.create(this, R.raw.d),
                MediaPlayer.create(this, R.raw.e), MediaPlayer.create(this, R.raw.f),
                MediaPlayer.create(this, R.raw.g), MediaPlayer.create(this, R.raw.h),
                MediaPlayer.create(this, R.raw.i), MediaPlayer.create(this, R.raw.j),
                MediaPlayer.create(this, R.raw.k), MediaPlayer.create(this, R.raw.l)};

        opt1 = getResources().getStringArray(R.array.opt1);
        opt2 = getResources().getStringArray(R.array.opt2);
        opt3 = getResources().getStringArray(R.array.opt3);
        answers = getResources().getStringArray(R.array.answers);

        next_btn = (Button)findViewById(R.id.next_btn);
        mImageButton= (ImageButton) findViewById(R.id.sound_btn);
        rg_listen = (RadioGroup)findViewById(R.id.rg_listen);
        r1 = (RadioButton)findViewById(R.id.radio_btn);
        r2 = (RadioButton)findViewById(R.id.radio_btn2);
        r3 = (RadioButton)findViewById(R.id.radio_btn3);

        sounds_question[position].start();
        r1.setText(opt1[position]);
        r2.setText(opt2[position]);
        r3.setText(opt3[position]);

        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sounds_question[position].start();
            }
        });

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton selectedAns = (RadioButton) findViewById(rg_listen.getCheckedRadioButtonId());
                String selectedAnsText;
                if (selectedAns==null){
                    selectedAnsText = " ";
                } else {
                    selectedAnsText = selectedAns.getText().toString();
                }

                if (selectedAnsText.equals(answers[position])) {
                    correct++;
                }
                position++;
                if (position<opt1.length){
                    sounds_question[position].start();
                    r1.setText(opt1[position]);
                    r2.setText(opt2[position]);
                    r3.setText(opt3[position]);
                } else {
                    Intent intent = new Intent(ListenGuessActivity.this, ListenGuessResult.class);
                    startActivity(intent);
                }
            }
        });
    }
}