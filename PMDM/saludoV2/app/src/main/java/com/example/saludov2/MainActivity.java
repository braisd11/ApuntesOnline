package com.example.saludov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private EditText nombre, anho;
    private RadioButton rbtSra, rbtSr, rbtOtro;
    private RadioGroup rgGenero;
    private String texto;
    private String nombreText;
    private String anhoText;
    private int anhoInt;
    private int edad;
    private String generoText = "Sra.";
    private Button btnSaludar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        extracted();
        rgGenero.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId==R.id.rbtSr){
                    generoText="Sr.";
                } else if (checkedId==R.id.rbtOtro){
                    generoText="";
                } else {
                    generoText="Sra.";
                }
                System.out.println(generoText);
            }
        });
    }

    private void extracted() {
        nombre = findViewById(R.id.etNombre);
        anho = findViewById(R.id.etAnho);
        rbtSr = findViewById(R.id.rbtSr);
        rbtSra = findViewById(R.id.rbtSra);
        rbtOtro = findViewById(R.id.rbtOtro);
        rgGenero = findViewById(R.id.rgGenero);
        btnSaludar = findViewById(R.id.btnSaludar);
    }

    public void onClickToActivity2(View view) {

        if (view.getId() == R.id.btnSaludar){
            try{
                nombreText = nombre.getText().toString();
                String edad = comprobarEdad();
                String genero = comprobarRadio();
                texto = "Hola, " + genero + " " + nombreText + "\n" + edad;
                Intent intent = new Intent(this, Saludando.class);
                intent.putExtra("mensaje", texto);
                startActivity(intent);
            } catch (Exception ex){
                Toast.makeText(this, "Hay campos sin rellenar", Toast.LENGTH_SHORT).show();
            }

        }
    }

    private String comprobarRadio() {

        return generoText;
    }

    private String comprobarEdad() {
        anhoInt = Integer.parseInt(anho.getText().toString());
        int anhoActual = Calendar.getInstance().get(Calendar.YEAR);
        if (anhoInt>anhoActual){
            Toast.makeText(this, "El año no puede ser mayor que el actual", Toast.LENGTH_SHORT).show();
        } else {
            edad = anhoActual-anhoInt;
            if (edad<18){
                anhoText="Eres menor de edad";
            } else {
                anhoText = "Eres mayor de edad";
            }
        }
        return anhoText;
    }
}