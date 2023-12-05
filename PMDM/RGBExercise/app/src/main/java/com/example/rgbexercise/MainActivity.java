package com.example.rgbexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar redsb, greensb, bluesb, alphasb;

    private int red, green , blue, alpha;

    private TextView redtxt, greentxt, bluetxt, alphatxt, fondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redsb = findViewById(R.id.redsb);
        greensb = findViewById(R.id.greensb);
        bluesb = findViewById(R.id.bluesb);
        alphasb = findViewById(R.id.alphasb);

        redtxt = findViewById(R.id.redtxt);
        greentxt = findViewById(R.id.greentxt);
        bluetxt = findViewById(R.id.bluetxt);
        alphatxt = findViewById(R.id.alphatxt);
        fondo = findViewById(R.id.fondo);

        redsb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                red = progress;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                redtxt.setText("Red: " + red + " //");
                changeColor(red,green,blue,alpha);
            }
        });

        greensb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                green = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                greentxt.setText("Green: " + green + " //");
                changeColor(red,green,blue,alpha);
            }
        });

        bluesb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                blue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                bluetxt.setText("Blue: " + blue + " //");
                changeColor(red,green,blue,alpha);
            }
        });

        alphasb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                alpha = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                alphatxt.setText("Alpha: " + alpha + " //");
                changeColor(red,green,blue,alpha);
            }
        });


    }


    private void changeColor(int red, int green, int blue, int alpha){
        fondo.setBackgroundColor(Color.argb(alpha,red,green,blue));
    }

}