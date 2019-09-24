package com.example.prog1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CalendarView calendarView;
    TextView myDate;
    Button start;
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendarView = (CalendarView) findViewById(R.id.calendarView);
        myDate = (TextView) findViewById(R.id.myDate);

        start = (Button) findViewById(R.id.start);
        text = (TextView)findViewById(R.id.myDate);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent neo = new Intent(MainActivity.this, TimeAndDistance.class);
              startActivity(neo);

            }
        });

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = (i1 + 1) + "/" + i2 + "/" + i;
                myDate.setText(date);

            }
        });
    }
}
