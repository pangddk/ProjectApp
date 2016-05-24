package com.example.projectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn_InfoMenu;
    private ImageButton btn_Exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Current Date
        Calendar c = Calendar.getInstance();
        int d = c.get(Calendar.DATE);
        int m = c.get(Calendar.MONTH);
        int y = c.get(Calendar.YEAR) + 543;

        String month = "";
        // Month in Thai
        switch (m + 1){
            case 1:
                month = "มกราคม";
                break;
            case 2:
                month = "กุมภาพันธ์";
                break;
            case 3:
                month = "มีนาคม";
                break;
            case 4:
                month = "เมษายน";
                break;
            case 5:
                month = "พฤษภาคม";
                break;
            case 6:
                month = "มิถุนายน";
                break;
            case 7:
                month = "กรกฎาคม";
                break;
            case 8:
                month = "สิงหาคม";
                break;
            case 9:
                month = "กันยายน";
                break;
            case 10:
                month = "ตุลาคม";
                break;
            case 11:
                month = "พฤศจิกายน";
                break;
            case 12:
                month = "ธันวาคม";
                break;
            default: break;
        }

        // Date Result
        TextView result = (TextView) findViewById(R.id.txt_Date);
        //result.setText(formattedDate);
        result.setText(d + " " + month + " " + y);

        //Button to Information Menu
        btn_InfoMenu = (ImageButton)findViewById(R.id.btn_InfoMenu);
        btn_InfoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                startActivity(intent);
            }
        });

        //Button to Exercise Menu
        btn_Exercise = (ImageButton)findViewById(R.id.btn_Exercise);
        btn_Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExerciseActivity.class);
                startActivity(intent);
            }
        });

    }

}
