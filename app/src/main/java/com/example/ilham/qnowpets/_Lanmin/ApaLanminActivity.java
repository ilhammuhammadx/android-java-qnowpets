package com.example.ilham.qnowpets._Lanmin;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ilham.qnowpets.R;

public class ApaLanminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apa_lanmin);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
