package com.example.ilham.qnowpets;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ilham.qnowpets._Kelinci.ApaKelinciActivity;
import com.example.ilham.qnowpets._Kelinci.JenisKelinciActivity;
import com.example.ilham.qnowpets._Kelinci.MakananKelinciActivity;

public class TipsActivity extends AppCompatActivity {

    ListView list;

    // Array di listview

    String[] NamaNegara = {
            "Tips",
            "Tips",
            "Trik",
            "Tips",
            "Trik"
    };

    String[] NamaSub = {
            "Membeli Hewan Peliharaan",
            "Memotret Hewan Peliharaan",
            "Makanan yang baik untuk kelinci",
            "Membawa Hewan Jalan-Jalan",
            "Cara Merawat Hewan Peliharaan Dirumah"
    };

    Integer[] GbrBendera={
            R.mipmap.outlinetips2,
            R.mipmap.outlinetips2,
            R.mipmap.outlinetrik,
            R.mipmap.outlinetips2,
            R.mipmap.outlinetrik
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

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

                Intent intent = new Intent(android.content.Intent.ACTION_VIEW);
                if(position == 0)
                    intent.setData(Uri.parse("https://combrodev.blogspot.com/2017/03/tips-membeli-hewan-peliharaan-pet.html"));
                else if (position == 1)
                    intent.setData(Uri.parse("https://qubicle.id/story/10-tips-untuk-memotret-hewan-peliharaan-kamu"));
                else if (position == 2)
                    intent.setData(Uri.parse("https://qubicle.id/story/makanan-yang-baik-untuk-kelinci"));
                else if (position == 3)
                    intent.setData(Uri.parse("https://news.detik.com/berita/3754827/begini-tips-bawa-hewan-peliharaan-jalan-jalan-agar-tidak-terlantar"));
                else
                    intent.setData(Uri.parse("https://jempolkaki.com/cara-merawat-hewan-peliharaan/"));

                startActivity(intent);
            }
        });


    }
}
