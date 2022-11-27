package com.example.senddata;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userN,userAg;
    Button send;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userN=findViewById(R.id.userName);
        userAg=findViewById(R.id.userAge);
        send=findViewById(R.id.Btn);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = userN.getText().toString();
                String age=userN.getText().toString();
                Intent intent = new Intent(MainActivity.this,SecondAct.class);
                intent.putExtra("userName",name);
                intent.putExtra("userAge",age);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Now you are going to NEXT Page", Toast.LENGTH_SHORT).show();
            }
        });
    }
}