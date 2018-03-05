package com.example.ilham.qnowpets._Musang;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ilham.qnowpets.R;

public class ApaMusangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apa_musang);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
