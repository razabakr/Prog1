package com.example.prog1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.content.Intent;

public class Logout extends AppCompatActivity {
    Button logout;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        logout = findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentL = new Intent(Logout.this,Login.class);
                startActivity(intentL);
                finish();
                Toast.makeText(Logout.this,"Successfully Logout", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
