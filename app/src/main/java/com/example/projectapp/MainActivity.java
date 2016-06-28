package com.example.projectapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Current Date
        Calendar c = Calendar.getInstance();
        //SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        //String formattedDate = df.format(c.getTime());
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
    }
}
