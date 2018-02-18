package com.agarwal.ashi.hackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ProgressBar;

import static java.security.AccessController.getContext;

public class FetchData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_data);
        GridView gridView = findViewById(R.id.gridview);
        ProgressBar progressBar = findViewById(R.id.progress);
        MyAsync my = new MyAsync(FetchData.this, progressBar, gridView,"prodigy");
        my.execute("http://500052000.000webhostapp.com/Event_name.php", "http://500052000.000webhostapp.com/poster.php","http://500052000.000webhostapp.com/Event_desc.php","http://500052000.000webhostapp.com/Revertdesc.php");
    }
}
