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

public class CheckEorO extends AppCompatActivity {
    EditText ec;
    AppCompatButton bc1,bc2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_check_eor_o);

        ec=(EditText) findViewById(R.id.num);
        bc1=(AppCompatButton) findViewById(R.id.checkbtn);
        bc2=(AppCompatButton) findViewById(R.id.backbtn);

        bc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Num= ec.getText().toString();
                int n=Integer.parseInt(Num);
                if (n%2==0)
                {
                    Toast.makeText(getApplicationContext(),"even",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"odd",Toast.LENGTH_LONG).show();
                }

            }
        });

        bc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}