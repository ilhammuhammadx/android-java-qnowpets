package com.example.ilham.qnowpets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.example.ilham.qnowpets._Anjing.AnjingActivity;
import com.example.ilham.qnowpets._Kelinci.KelinciActivity;
import com.example.ilham.qnowpets._Kucing.KucingActivity;
import com.example.ilham.qnowpets._Lanmin.LanminActivity;
import com.example.ilham.qnowpets._Marmut.MarmutActivity;
import com.example.ilham.qnowpets._Musang.MusangActivity;
import com.example.ilham.qnowpets._Sugarglider.SugargliderActivity;

public class PilihanPetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan_pet);

        // Penanganan Pindah Activity


        //Pindah ke Lanmin Act
        FrameLayout keLanmin = (FrameLayout) findViewById(R.id.landakmini);
        keLanmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataLanminMethod(view);
            }
        });

        // Pindah ke Marmut Activity
        FrameLayout keMarmut = (FrameLayout) findViewById(R.id.marmut);
        keMarmut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataMarmutMethod(view);
            }
        });

        // Pindah Ke Musang act

        FrameLayout keMusang = (FrameLayout) findViewById(R.id.musang);
        keMusang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataMusangMethod(view);
            }
        });

        // Pindah ke anjing act
        FrameLayout keAnjing = (FrameLayout) findViewById(R.id.anjing);
        keAnjing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataAnjingMethod(view);
            }
        });

        // Pindah ke sugar glider act
        FrameLayout keSG = (FrameLayout) findViewById(R.id.sugarglider);
        keSG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataSGMethod(view);
            }
        });

        // Pindah ke Kucing Activity
        FrameLayout keKucing = (FrameLayout) findViewById(R.id.kucingku);
        keKucing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataKucingMethod(view);
            }
        });

        // Pindah ke Kelinci Activity
        FrameLayout keKelinci = (FrameLayout) findViewById(R.id.kelinci);
        keKelinci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataKelinciMethod(view);
            }
        });

    } // Method dibawah ini

    // Method data Lanmin
    private void dataLanminMethod(View view) {
        Intent intent = new Intent(view.getContext(), LanminActivity.class);
        startActivity(intent);
    }

    // Method data marmut
    private void dataMarmutMethod(View view) {
        Intent intent = new Intent(view.getContext(), MarmutActivity.class);
        startActivity(intent);
    }

    // method data musang
    private void dataMusangMethod(View view) {
        Intent intent = new Intent(view.getContext(), MusangActivity.class);
        startActivity(intent);
    }

    // Method data anjing
    private void dataAnjingMethod(View view) {
        Intent intent = new Intent(view.getContext(), AnjingActivity.class);
        startActivity(intent);
    }

    //Method SG
    private void dataSGMethod(View view) {
        Intent intent = new Intent(view.getContext(), SugargliderActivity.class);
        startActivity(intent);
    }

    // Method data Kucing
    private void dataKucingMethod(View view) {
        Intent intent = new Intent(view.getContext(), KucingActivity.class);
        startActivity(intent);
    }

    // Method data Kelinci
    public void dataKelinciMethod(View view) {
        Intent intent = new Intent(view.getContext(), KelinciActivity.class);
        startActivity(intent);
    }
}
