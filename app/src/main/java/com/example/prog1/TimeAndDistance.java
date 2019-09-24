package com.example.prog1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.Button;

import java.sql.Time;

public class TimeAndDistance extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Button button;
    Spinner secondSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_and_distance);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              openBatteryPercentageCalculator();
            }
        });
        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.ElectricVehicles,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        //secondSpinner = (Spinner) findViewById(R.id.spinner2);
//        secondSpinner = (Spinner) findViewById(R.id.spinner2);
//        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.BatteryPercentage,android.R.layout.simple_spinner_item);
//        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        secondSpinner.setAdapter(adapter1);
//        secondSpinner.setOnItemSelectedListener(this);


    }

    public void openBatteryPercentageCalculator(){
        Intent intent = new Intent(this,BatteryPercentageCalculator.class);
        startActivity(intent);
    }


    @Override

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(),text,Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
