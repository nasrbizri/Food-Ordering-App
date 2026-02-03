package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class Backto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

    }

    public void changeToFrench(View view) {
        language.changeLanguageAndNavigate(this, "fr", MainActivity.class);
    }
}
