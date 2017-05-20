package com.example.luunghia.grii;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameResult extends AppCompatActivity {

    TextView tv;
    Button backToMain, restartGame;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_result);
        tv = (TextView)findViewById(R.id.tv_reulst);
        backToMain = (Button)findViewById(R.id.back_to_main_btn1);
        restartGame = (Button)findViewById(R.id.back_to_game_btn);
        tv.setText("Your final result is " + GameActivity.correct+"/"+GameActivity.images_question.length);

        backToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GameResult.this, MainActivity.class);
                startActivity(i);
            }
        });
        restartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GameResult.this, GameActivity.class);
                startActivity(i);
            }
        });
    }
}
