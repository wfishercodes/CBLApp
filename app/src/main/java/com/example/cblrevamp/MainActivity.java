package com.example.cblrevamp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button myCollection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myCollection = (Button) findViewById(R.id.myCollection);
        myCollection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MyCollection();
            }
        });
    }
}