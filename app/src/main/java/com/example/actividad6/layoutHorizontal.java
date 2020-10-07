package com.example.actividad6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layoutHorizontal extends AppCompatActivity {

    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_horizontal);

        btnRegresar = findViewById(R.id.btnRegresarLh);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intLh = new Intent(layoutHorizontal.this, MainActivity.class);
                startActivity(intLh);
            }
        });

    }
}