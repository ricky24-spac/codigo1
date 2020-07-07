package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class App2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app2);

        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("nombre");

        TextView txtContenido  = findViewById(R.id.txt_captura);
        txtContenido.setText("Bienvenido: "+nombre);
    }
}