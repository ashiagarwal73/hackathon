package com.agarwal.ashi.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Events_Details extends AppCompatActivity {
    ImageView imageView;
    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events__details);
        //imageView=findViewById(R.id.image);
        textView=findViewById(R.id.description);
        textView2=findViewById(R.id.revert);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String[] desc=bundle.getStringArray("poster_desc");
        String[] revert=bundle.getStringArray("revert");
        //String[] images=bundle.getStringArray("images");
        int position=bundle.getInt("position");
        if(desc[position].equals(""))
        {
            desc[position]="No Description sent";
        }
        textView.setText(desc[position]);
        textView2.setText(revert[position]);
//        Picasso.with(Events_Details.this)
//                .load(images[position])
//                .noFade()
//                .into(imageView);
    }
}
