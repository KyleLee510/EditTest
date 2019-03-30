package com.example.demoapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText = findViewById(R.id.Toast_Edit);
    }


    public void getEditTextToast(View view) {
        String strEdit = editText.getText().toString();
        Toast.makeText(getApplicationContext(), strEdit,Toast.LENGTH_SHORT).show();
    }
}
