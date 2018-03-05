package com.example.ilham.qnowpets;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ilham on 2/10/18.
 */

public class GambarAdapter extends ArrayAdapter<String> {

    private final AppCompatActivity context;
    private final String[] NamaNegara;
    private final String[] NamaSub;
    private final Integer[] GbrBendera;


    public GambarAdapter(AppCompatActivity context, String[] NamaNegara, String[] NamaSub, Integer[] GbrBendera) {
        super(context, R.layout.activity_list_kotak, NamaNegara);

        this.context=context;
        this.NamaNegara=NamaNegara;
        this.NamaSub=NamaSub;
        this.GbrBendera=GbrBendera;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_list_kotak, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        TextView txtSubtitle = (TextView) rowView.findViewById(R.id.subitem);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);


        txtTitle.setText(NamaNegara[position]);
        txtSubtitle.setText(NamaSub[position]);
        imageView.setImageResource(GbrBendera[position]);

        return rowView;

    };
}