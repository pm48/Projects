package com.example.android.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button1 = (Button) findViewById(R.id.btnMovies);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my movies project",Toast.LENGTH_SHORT).show();
            }
        });

        final  Button button2 = (Button)findViewById(R.id.btnBigger);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch Build It Bigger App",Toast.LENGTH_SHORT).show();
            }
        });

        final Button button3 = (Button)findViewById(R.id.btnApp);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my capstone project",Toast.LENGTH_SHORT).show();
            }
        });

        final Button button4 = (Button)findViewById(R.id.btnHawk);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch stock hawk app",Toast.LENGTH_SHORT).show();

            }
        });

        final Button button5 = (Button) findViewById(R.id.btnUbi);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch Go Ubiquitous app",Toast.LENGTH_SHORT).show();
            }
        });

        final Button button6 = (Button)findViewById(R.id.btnMaterial);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch Make your app material app",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
