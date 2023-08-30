package com.example.marvelacademy23_08_30;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv2;
    Bundle extra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        extra = getIntent().getExtras();

        tv2 = findViewById(R.id.tv2);
        tv2.setText(extra.getString("text"));


    }
}