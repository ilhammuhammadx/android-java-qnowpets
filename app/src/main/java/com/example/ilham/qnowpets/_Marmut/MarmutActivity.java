package com.example.ilham.qnowpets._Marmut;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ilham.qnowpets.BenderaAdapter;
import com.example.ilham.qnowpets.R;

public class MarmutActivity extends AppCompatActivity {

    ListView list;

    // Array di listview

    String[] NamaNegara = {
            "Apa Itu Marmut ?",
            "Jenis-Jenis Marmut"
    };

    String[] NamaSub = {
            "Definisi seputar marmut",
            "Berbagai macam jenis marmut"
    };

    Integer[] GbrBendera={
            R.mipmap.question,
            R.mipmap.marmutoutline
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marmut);

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
                    intent = new Intent(view.getContext(), ApaMarmutActivity.class);
                else
                    intent = new Intent(view.getContext(), JenisMarmutActivity.class);
                startActivity(intent);
            }
        });


    }

}
