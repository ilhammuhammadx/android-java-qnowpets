package com.example.ilham.qnowpets._Kelinci;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ilham.qnowpets.BenderaAdapter;
import com.example.ilham.qnowpets.R;

public class KelinciActivity extends AppCompatActivity {

    ListView list;

    // Array di listview

    String[] NamaNegara = {
            "Apa Itu Kelinci ?",
            "Jenis Kelinci",
            "Makanan Kelinci"
    };

    String[] NamaSub = {
            "Definisi seputar Kelinci",
            "Berbagai macam jenis kelinci",
            "Makanan yang baik untuk kelinci"
    };

    Integer[] GbrBendera={
            R.mipmap.question,
            R.mipmap.rabbitoutline,
            R.mipmap.foods
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelinci);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //Set adapter Gambar

        BenderaAdapter adapter=new BenderaAdapter(this, NamaNegara, NamaSub, GbrBendera);
        list=(ListView)findViewById(R.id.list);
        list.setFastScrollAlwaysVisible(true);
        list.setAdapter(adapter);

        // Penanganan Kejadian Klik listview

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent;
                if(position == 0)
                    intent = new Intent(view.getContext(), ApaKelinciActivity.class);
                else if (position == 1)
                    intent = new Intent(view.getContext(), JenisKelinciActivity.class);
                else
                    intent = new Intent(view.getContext(), MakananKelinciActivity.class);
                startActivity(intent);
            }
        });


    }
}
