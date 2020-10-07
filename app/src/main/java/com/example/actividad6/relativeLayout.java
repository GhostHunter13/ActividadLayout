package com.example.actividad6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class relativeLayout extends AppCompatActivity {

    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        btnRegresar = findViewById(R.id.btnRegresarRl);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intBack = new Intent(relativeLayout.this, MainActivity.class);
                startActivity(intBack);
            }
        });

    }

    public void regresarMain(View view){
        Intent intBack = new Intent(relativeLayout.this, MainActivity.class);
        startActivity(intBack);
    }
}