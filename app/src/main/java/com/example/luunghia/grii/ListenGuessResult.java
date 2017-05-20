package com.example.luunghia.grii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ListenGuessResult extends AppCompatActivity {
    TextView tv;
    Button backToMain, restartListen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listen_guess_result);
        tv = (TextView)findViewById(R.id.tv_reulst1);
        backToMain = (Button)findViewById(R.id.back_to_main_btn2);
        restartListen = (Button)findViewById(R.id.back_to_listen_btn);
        tv.setText("Your final result is " + ListenGuessActivity.correct+"/"+ListenGuessActivity.answers.length);

        backToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListenGuessActivity.position=0;
                ListenGuessActivity.correct=0;
                Intent i = new Intent(ListenGuessResult.this, MainActivity.class);
                startActivity(i);
            }
        });
        restartListen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListenGuessActivity.position=0;
                ListenGuessActivity.correct=0;
                Intent i = new Intent(ListenGuessResult.this, ListenGuessActivity.class);
                startActivity(i);
            }
        });
    }
}
