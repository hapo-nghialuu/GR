package com.example.luunghia.grii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mStartButton;
    private Button mGameButton;
    private Button mListenGuessButton;
    private Button mQuizButton;
    private Button mVideoLearningButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartButton = (Button)findViewById(R.id.start_button);
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Start ActivityStart
                Intent i = new Intent(MainActivity.this, StartActivity.class);
                startActivity(i);
            }
        });

        mGameButton = (Button)findViewById(R.id.game_button);
        mGameButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Start ActivityGame
                Intent i = new Intent(MainActivity.this, GameActivity.class);
                startActivity(i);
            }
        });

        mListenGuessButton = (Button)findViewById(R.id.listen_guess_button);
        mListenGuessButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Start ActivityListenGuess
                Intent i = new Intent(MainActivity.this, ListenGuessActivity.class);
                startActivity(i);
            }
        });

        mQuizButton = (Button)findViewById(R.id.quiz_button);
        mQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Start ActivityQuiz
                Intent i = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(i);
            }
        });

        mVideoLearningButton = (Button)findViewById(R.id.video_learning_button);
        mVideoLearningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Start ActivityVideoLearning
                Intent i = new Intent(MainActivity.this, VideoLearningActivity.class);
                startActivity(i);
            }
        });
    }
}
