package com.example.ilham.qnowpets;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.ilham.qnowpets._Slider.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    //Slider
    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;
    //_Slider

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Slider
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        sliderDotspanel = (LinearLayout) findViewById(R.id.SliderDots);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];
        for(int i = 0; i < dotscount; i++){

            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel.addView(dots[i], params);

        }
        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotscount; i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        //_Slider

        //Pindah ke Tentang QNOW

        FrameLayout keTentang = (FrameLayout) findViewById(R.id.tentangQnow);
        keTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), QnowActivity.class);
                startActivity(intent);
            }
        });

        // pindah ke tips
        FrameLayout keTips = (FrameLayout) findViewById(R.id.tipsku);
        keTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TipsActivity.class);
                startActivity(intent);
            }
        });

        FrameLayout kePetshop = (FrameLayout) findViewById(R.id.petshop);
        kePetshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), PetshopActivity.class);
                startActivity(intent);
            }
        });

        FrameLayout keluarapps = (FrameLayout) findViewById(R.id.keluar);
        keluarapps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder kotakDialog = new AlertDialog.Builder(MainActivity.this);
                kotakDialog.setCancelable(false);
                kotakDialog.setMessage("Kamu akan menutup Aplikasi ini ?");
                kotakDialog.setTitle("Konfirmasi");

                //Mengatur tombol ya
                kotakDialog.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    //Menangani kejadian onClick tombol Ya
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                });

                // Mengatur tombol tidak
                kotakDialog.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    // Menangani kejadian klik tidak
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
            }
        });

                kotakDialog.create().show();

            }
        });

        FrameLayout kePets = (FrameLayout) findViewById(R.id.pets);
        kePets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), PilihanPetActivity.class);
                startActivity(intent);
            }
        });
    } // Penutup penanganan

    // Back Action Close

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Kamu akan menutup aplikasi ini ?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                finish();
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    // MENU Titik Tiga !!!!

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.petsmenu :
                Intent intent = new Intent(this, PilihanPetActivity.class);

                startActivity(intent);

                return true;

            case R.id.petshopmenu :
                Intent intent1 = new Intent(this, PetshopActivity.class);

                startActivity(intent1);

                return true;

            case R.id.tipsmenu :
                Intent intent2 = new Intent(this, TipsActivity.class);

                startActivity(intent2);

                return true;

            case R.id.tentangmenu:
                Intent intent3 = new Intent(this, QnowActivity.class);

                startActivity(intent3);

                return true;

            case R.id.keluarmenu :
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setCancelable(false);
                builder.setMessage("Kamu akan menutup aplikasi ini ?");
                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //if user pressed "yes", then he is allowed to exit from application
                        finish();
                    }
                });
                builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //if user select "No", just cancel this dialog and continue with app
                        dialog.cancel();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
                return true;

            default:

                return super.onOptionsItemSelected(item);
        }
    }

}
