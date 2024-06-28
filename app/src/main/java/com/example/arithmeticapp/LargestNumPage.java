package com.example.arithmeticapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LargestNumPage extends AppCompatActivity {
EditText elar1,elar2;
AppCompatButton blar1,blar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_largest_num_page);

        elar1=(EditText) findViewById(R.id.num1);
        elar2=(EditText) findViewById(R.id.num2);
        blar1=(AppCompatButton) findViewById(R.id.largebtn);
        blar2=(AppCompatButton) findViewById(R.id.backbtn);

        blar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String Num1= elar1.getText().toString();
              String Num2= elar2.getText().toString();
              int n1=Integer.parseInt(Num1);
              int n2=Integer.parseInt(Num2);
                if (n1 > n2)
                {
                    Toast.makeText(getApplicationContext(),String.valueOf(n1),Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),String.valueOf(n2),Toast.LENGTH_LONG).show();
                }

            }
        });

        blar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}