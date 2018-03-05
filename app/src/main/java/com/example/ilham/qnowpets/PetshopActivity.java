package com.example.ilham.qnowpets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class PetshopActivity extends AppCompatActivity {
    ListView listing;

    // Array di listview

    String[] NamaNegara = {
            "Puspa Petshop Bogor",
            "Petshop Lembah Anai",
            "Petshopku Padamu",
            "Rabbit Warehouse",
            "Ucup Petshop",
            "Petshop Petshopan",
            "Red Z Petshop",
            "Toko Hewan Mang Ujang",
            "Toko Alat Pancing Madura",
            "Toko Binatang dan Petshop"
    };

    String[] NamaSub = {
            "Jl. Raya Bogor, No.21",
            "Jl. Raya Serpong, Ruko Madani",
            "Jl. Akses Kelapa Dua UI",
            "Jl. Roda Hias Serpong, Tangerang Selatan",
            "Kompleks Perumahan Maicih Bogor",
            "Jl. Doang Jadian Kagak",
            "Jl. Jaletreng Komplek Haji Maman",
            "Perumahan Elit Bastian",
            "Jl. Elon Musk Mantep",
            "Jl. Kita Bersama Ke Pelaminan"
    };

    Integer[] GbrBendera={
            R.mipmap.outlinehome,
            R.mipmap.outlinehome,
            R.mipmap.outlinehome,
            R.mipmap.outlinehome,
            R.mipmap.outlinehome,
            R.mipmap.outlinehome,
            R.mipmap.outlinehome,
            R.mipmap.outlinehome,
            R.mipmap.outlinehome,
            R.mipmap.outlinehome
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petshop);

        //Set adapter Gambar

        GambarAdapter adapter=new GambarAdapter(this, NamaNegara, NamaSub, GbrBendera);
        listing=(ListView)findViewById(R.id.listkotak);
        listing.setFastScrollAlwaysVisible(true);
        listing.setAdapter(adapter);

        // Penanganan Kejadian Klik listview


    }
}
