package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity5 extends AppCompatActivity {
    private Button btnRetornar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        btnRetornar = findViewById(R.id.btnEnviarRespuesta);

        btnRetornar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //operaciones que queremos que se ejecuten al pulsar
                //volver a la actividad 1 enviándole un dato
                String mensajeRespuesta = "Respondiendo desde la actividad 5";
                Intent intent = new Intent();
                intent.putExtra("mensaje_retornado", mensajeRespuesta);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }


}