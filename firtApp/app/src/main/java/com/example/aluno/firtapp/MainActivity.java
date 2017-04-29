package com.example.aluno.firtapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";
    private Button btnHi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHi = (Button) findViewById(R.id.btn_hi);
        btnHi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.i("Hello World!");
            }
        });
    }
}
