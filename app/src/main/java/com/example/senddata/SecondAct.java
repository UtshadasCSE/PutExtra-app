package com.example.senddata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondAct extends AppCompatActivity {
    TextView age,name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        age=findViewById(R.id.userAGe);
        name=findViewById(R.id.userNAme);

        String namee=getIntent().getStringExtra("userName");
        String agee=getIntent().getStringExtra("userAge");

        name.setText(namee);
        age.setText(agee);
    }
}