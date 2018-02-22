package com.example.android.businesscard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
    }


    public void goToAddress(View view) {
        Intent browser = new Intent (Intent.ACTION_VIEW, Uri.parse(getString (R.string.text_6)));
        startActivity (browser);
    }


}