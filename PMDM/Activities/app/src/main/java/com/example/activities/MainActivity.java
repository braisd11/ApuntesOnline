package com.example.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String dato;
    private static final int LLAMADA_ACTIVIDAD5 = 0;
    private TextView txtEscucha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtEscucha = findViewById(R.id.txtEscucha);
    }

    public void onClickCambioActivity(View view) {
        Intent intent = null;
        if (view.getId()==R.id.btnLlamadaAct2){
            intent = new Intent(this, Activity2.class);


        } else if (view.getId()==R.id.btnLlamadaAct3) {
            intent = new Intent(this, Activity3.class);
            dato = "El Activity 1 envía este mensaje a la activity3";
            intent.putExtra("mensaje", dato);



        } else if (view.getId()==R.id.btnLlamadaAct4) {
            intent = new Intent(this, Activity4.class);
            dato = "El Activity 1 envía este mensaje a la activity4 a través de un bundle";

            Bundle bundle = new Bundle();
            bundle.putString("mensaje", dato);

            intent.putExtras(bundle);
        } else if (view.getId() == R.id.btnLlamadaEsperaRespuesta){
            intent = new Intent(this, Activity5.class);

            //LLamada esperando respuesta
            startActivityForResult(intent, LLAMADA_ACTIVIDAD5);
        }
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //Vemos quien nos contesta
        if (requestCode == LLAMADA_ACTIVIDAD5){
            //testeamos el código del resultado
            if (resultCode == RESULT_OK){
                //operaciones si la actividad llamada finaliza según lo previsto
                Toast.makeText(this, "Todo ok", Toast.LENGTH_SHORT).show();
                txtEscucha.setText(data.getStringExtra("mensaje_retornado"));
            } else {
                //operaciones si la actividad llamada no hace lo previsto
                Toast.makeText(this, "Algo falló", Toast.LENGTH_SHORT).show();
            }
        }
    }
}