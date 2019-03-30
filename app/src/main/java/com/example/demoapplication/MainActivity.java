package com.example.demoapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button skipMain2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        skipMain2 = findViewById(R.id.first_Button);

    }

    public void goto2Activity(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class );
        startActivity(intent);
        //finish();
    }
}
