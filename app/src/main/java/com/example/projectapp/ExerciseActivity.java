package com.example.projectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ExerciseActivity extends AppCompatActivity {

    private ImageButton btn_back;
    private Button btn_otherExer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        //Button back to Main
        btn_back = (ImageButton)findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExerciseActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //Button to Other exercises
        btn_otherExer = (Button)findViewById(R.id.btn_otherExer);
        btn_otherExer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExerciseActivity.this, OtherExerciseActivity.class);
                startActivity(intent);
            }
        });
    }
}
