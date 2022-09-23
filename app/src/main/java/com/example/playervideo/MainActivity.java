package com.example.playervideo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View decorview = getWindow().getDecorView();

        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;

        decorview.setSystemUiVisibility(uiOptions);

        getSupportActionBar().hide();
    }

    public void abrirVideo (View view) {
        Intent intent = new Intent(this,PlayerActivity.class);
        startActivity(intent);
    }

}