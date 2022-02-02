package com.example.idanex6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView pic;
    ImageButton imgbtn;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pic = findViewById(R.id.imageView);
        imgbtn = findViewById(R.id.imageButton);
        x = 0;
    }

    public void clicking(View view) {
        x = (int)(3 * Math.random()+1);

        if(x==1) {
            pic.setImageResource(R.drawable.lakers);
            imgbtn.setImageResource(R.drawable.one1);
        }
        else if(x == 2)
        {
            pic.setImageResource((R.drawable.clippers));
            imgbtn.setImageResource(R.drawable.two2);        }
        else
        {
            pic.setImageResource((R.drawable.bulls));
            imgbtn.setImageResource(R.drawable.three3);
        }

    }
}