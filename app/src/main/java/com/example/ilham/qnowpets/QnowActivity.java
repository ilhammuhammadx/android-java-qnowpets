package com.example.ilham.qnowpets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class QnowActivity extends AppCompatActivity {

    Button sendEmail;
    EditText msg;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qnow);

        sendEmail = (Button) findViewById(R.id.submit);
        sendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ratingBar = (RatingBar) findViewById(R.id.ratingBar);
                String rating = String.valueOf(ratingBar.getRating());

                msg = (EditText) findViewById(R.id.txtMessage);
                String message =  msg.getText().toString();
                sendEmail(message,rating);
            }
        });

    }

    private void sendEmail(String message, String rating) {
        String[] to = new String[] {"ilhamhd98@gmail.com"};
        String subject=("Hallo QNOW Pets");
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        emailIntent.putExtra(Intent.EXTRA_TEXT,"RATING APLIKASI : "+"("+rating+")"+"\n\n PESAN : "+message);
        emailIntent.setType("message/rfc822");
        startActivity(Intent.createChooser(emailIntent,"Email"));
    }

}
