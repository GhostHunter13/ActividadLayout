package com.example.actividad6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnConstraintLayout, btnLayoutHorizontal,
            btnLayoutVertical, btnRelativeLayout, btnTableLayout, btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setDatos();

    }

    private void setDatos() {
        btnConstraintLayout = findViewById(R.id.btnToConstraintLayout);
        btnLayoutHorizontal = findViewById(R.id.btnToLayoutHorizontal);
        btnLayoutVertical = findViewById(R.id.btnToLayoutVertical);
        btnRelativeLayout = findViewById(R.id.btnToRelativeLayout);
        btnTableLayout = findViewById(R.id.btnToTableLayout);
        btnSalir = findViewById(R.id.btnSalir);

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

        btnConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intConstraint = new Intent(MainActivity.this, constraintLayout.class);
                startActivity(intConstraint);
            }
        });

        btnLayoutHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intHorizontal = new Intent(MainActivity.this, layoutHorizontal.class);
                startActivity(intHorizontal);
            }
        });

        btnLayoutVertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intVertical = new Intent(MainActivity.this, layoutVertical.class);
                startActivity(intVertical);
            }
        });

        btnRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intRelative = new Intent(MainActivity.this, relativeLayout.class);
                startActivity(intRelative);
            }
        });

        btnTableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intTable = new Intent(MainActivity.this, tableLayout.class);
                startActivity(intTable);
            }
        });

    }
}