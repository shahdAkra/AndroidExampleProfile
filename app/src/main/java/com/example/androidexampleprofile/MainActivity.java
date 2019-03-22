package com.example.androidexampleprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dataEnteryFormActivity(View view) {

        Intent intent = new Intent(this, DataEnteryForm.class);
        startActivity(intent);


    }

    public void recyclerViewActivity(View view) {
        Intent intent = new Intent(this, recyclerViewActivity.class);
        startActivity(intent);

    }

    public void textInputLayoutActivity(View view) {

    }
}
