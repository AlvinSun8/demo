package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("code", "this is test");
        TextView tv = findViewById(R.id.tb);
        tv.setText("非凡大师");

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                //跳转到Mainactivity2,packageContext是当前上下文
                intent.setClass(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}