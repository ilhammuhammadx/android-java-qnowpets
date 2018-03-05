    package com.example.ilham.qnowpets._Marmut;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ilham.qnowpets.R;

    public class ApaMarmutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apa_marmut);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
