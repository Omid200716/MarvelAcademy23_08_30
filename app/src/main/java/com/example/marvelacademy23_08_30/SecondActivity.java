package com.example.marvelacademy23_08_30;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.media.MediaPlayer;

public class SecondActivity extends AppCompatActivity {

    TextView tv2;
    Bundle extra;

    ImageView iv;

    ImageView youtube;

   // MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        extra = getIntent().getExtras();
        iv = findViewById(R.id.back);

        youtube = findViewById(R.id.youtube);
       // mediaPlayer = MediaPlayer.create(this, R.raw.sound);


        tv2 = findViewById(R.id.tv2);
        tv2.setText(extra.getString("text"));
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        youtube.setImageResource(R.drawable.youtube);

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
               /* if (mediaPlayer != null) {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                    } else {
                        mediaPlayer.start();
                    }
                }
                */




            }
        });


    }
}