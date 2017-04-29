package com.example.aluno.firtapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";
    private Button btnHi;
    private TextView tviText;
    private EditText eteMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(+R.layout.activity_main);
        tviText = findViewById(R.id.tvi_text);
        btnHi = (Button) findViewById(R.id.btn_hi);
        eteMessage = findViewById(R.id.ete_message);
        btnHi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String message = eteMessage.getText().toString();
                tviText.setText(message);
            }
        });
    }
}
