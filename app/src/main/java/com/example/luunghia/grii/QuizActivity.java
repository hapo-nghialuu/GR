package com.example.luunghia.grii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class QuizActivity extends AppCompatActivity {
    List<String> arrayList = new ArrayList();
    String a = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        final String go = "alphabet";
        final ListView lv = (ListView) findViewById(R.id.lvQuiz);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(QuizActivity.this,android.R.layout.simple_list_item_1,arrayList);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                a = a + lv.getItemAtPosition(i).toString();
                arrayList.remove(i);
                adapter.notifyDataSetChanged();
                if(arrayList.size()==0){
                    if(go.equals(a))
                        Toast.makeText(QuizActivity.this,"OK",Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(QuizActivity.this,"KO",Toast.LENGTH_SHORT).show();
                }
            }
        });
        for(int i=0;i<go.length();i++){
            arrayList.add(go.substring(i,i+1));
        }
        Collections.shuffle(arrayList);
        adapter.notifyDataSetChanged();
    }
}
