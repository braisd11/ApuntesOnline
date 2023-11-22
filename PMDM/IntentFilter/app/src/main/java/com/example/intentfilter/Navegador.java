package com.example.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class Navegador extends AppCompatActivity {

    private WebView wbUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegador);

        extracted();
        cargarURL();
    }

    private void cargarURL() {
        Intent intent = getIntent();
        wbUrl.loadUrl(intent.getStringExtra("enlace"));
    }

    private void extracted() {
        wbUrl = findViewById(R.id.wbUrl);
    }


}