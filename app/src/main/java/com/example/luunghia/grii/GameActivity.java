package com.example.luunghia.grii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class GameActivity extends AppCompatActivity {
    Button next_btn;
    ImageView mImageView;
    RadioGroup rg;
    RadioButton r1, r2, r3;

    public static int[] images_question = {R.drawable.a, R.drawable.b,
            R.drawable.c, R.drawable.d,
            R.drawable.e, R.drawable.f,
            R.drawable.g, R.drawable.h,
            R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l};
    String answers[];
    String opt1[], opt2[], opt3[];
    int position = 0;
    public static int correct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        opt1 = getResources().getStringArray(R.array.opt1);
        opt2 = getResources().getStringArray(R.array.opt2);
        opt3 = getResources().getStringArray(R.array.opt3);
        answers = getResources().getStringArray(R.array.answers);

        next_btn = (Button)findViewById(R.id.next_btn);
        mImageView = (ImageView)findViewById(R.id.question_image);
        rg = (RadioGroup)findViewById(R.id.rg);
        r1 = (RadioButton)findViewById(R.id.radioButton);
        r2 = (RadioButton)findViewById(R.id.radioButton2);
        r3 = (RadioButton)findViewById(R.id.radioButton3);

        mImageView.setImageResource(images_question[position]);
        r1.setText(opt1[position]);
        r2.setText(opt2[position]);
        r3.setText(opt3[position]);

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton selectedAns = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
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
                if (position<images_question.length){
                    mImageView.setImageResource(images_question[position]);
                    r1.setText(opt1[position]);
                    r2.setText(opt2[position]);
                    r3.setText(opt3[position]);
                } else {
                    Intent intent = new Intent(GameActivity.this, GameResult.class);
                    startActivity(intent);
                }
            }
        });

    }
}
