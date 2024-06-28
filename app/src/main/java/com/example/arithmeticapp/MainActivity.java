package com.example.arithmeticapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
AppCompatButton btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

     btn1=(AppCompatButton)findViewById(R.id.large);
     btn2=(AppCompatButton)findViewById(R.id.small);
     btn3=(AppCompatButton)findViewById(R.id.eoro);

     btn1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent i1= new Intent(getApplicationContext(),LargestNumPage.class);
             startActivity(i1);
         }
     });

     btn2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent i2= new Intent(getApplicationContext(),SmallestNumPage.class);
             startActivity(i2);
         }
     });

     btn3.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
           Intent i3=new Intent(getApplicationContext(),CheckEorO.class);
           startActivity(i3);

         }
     });

    }
}