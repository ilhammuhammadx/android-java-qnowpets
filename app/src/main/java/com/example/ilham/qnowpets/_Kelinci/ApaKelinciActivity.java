package com.example.ilham.qnowpets._Kelinci;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ilham.qnowpets.MainActivity;
import com.example.ilham.qnowpets.R;

public class ApaKelinciActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apa_kelinci);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

    }

}
