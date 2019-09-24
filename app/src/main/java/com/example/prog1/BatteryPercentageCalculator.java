package com.example.prog1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class BatteryPercentageCalculator extends AppCompatActivity {

    private Button distanceButton;
    Button buttonOption1,buttonOption2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery_percentage_calculator);
        distanceButton = findViewById(R.id.button2);
        distanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogout();
            }
        });
    }

    public void getMe(View v){
        Toast.makeText(getBaseContext(),"You can travel between 200-299 Miles ",Toast.LENGTH_LONG).show();
    }

    public void getMe2(View v){
        Toast.makeText(getBaseContext(),"You can travel between 100-199 Miles ",Toast.LENGTH_LONG).show();
    }

    public void getMe3(View v){
        Toast.makeText(getBaseContext(),"You can travel between 0-99 Miles ",Toast.LENGTH_LONG).show();
    }

    public void openLogout(){
        Intent intent = new Intent(this,Logout.class);
        startActivity(intent);
    }

}
