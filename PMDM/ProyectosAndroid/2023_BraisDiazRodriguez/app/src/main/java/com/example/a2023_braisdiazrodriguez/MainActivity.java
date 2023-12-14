package com.example.a2023_braisdiazrodriguez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private ImageButton imgBtn;
    private RadioGroup rgActivity1;
    private RadioButton rbtCalculate, rbtInformation;
    private Button btnActivity1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        extracted();

        imgBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (v.getId() == R.id.imgBtn){

                    imgBtn.setVisibility(View.GONE);

                    rgActivity1.setVisibility(View.VISIBLE);
                    rbtCalculate.setVisibility(View.VISIBLE);
                    rbtInformation.setVisibility(View.VISIBLE);
                    btnActivity1.setVisibility(View.VISIBLE);

                    if (rbtCalculate.isChecked()){

                        btnActivity1.setText(rbtCalculate.getText().toString());

                    } else {

                        btnActivity1.setText(rbtInformation.getText().toString());

                    }

                }

                return false;
            }
        });
    }

    private void extracted() {
        imgBtn = findViewById(R.id.imgBtn);
        rgActivity1 = findViewById(R.id.rgActivity1);
        rbtCalculate = findViewById(R.id.rbtCalculate);
        rbtInformation = findViewById(R.id.rbtInformation);
    }
}