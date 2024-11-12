package com.example.testdelivery;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class lauda extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle Session){
        super.onCreate(Session);
        EdgeToEdge.enable(this);
        setContentView(R.layout.lauda);

    }
}
