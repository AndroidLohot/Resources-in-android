package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvName = findViewById(R.id.tvName);
        ImageView imageView = findViewById(R.id.imageView);

        tvName.setText(R.string.str_name);

        imageView.setImageResource(R.drawable.my_image);

    }

}