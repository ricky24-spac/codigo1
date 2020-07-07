package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Ejemplo", "onCreate");

        Button button = (Button) findViewById(R.id.btn_accion2);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          TextView tv_mensaje = (TextView) findViewById(R.id.txt_mensaje);
                                          tv_mensaje.setText("RICKY MUY FIEL ");
                                      }
                                  }

        );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ejemplo", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Ejemplo", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Ejemplo", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Ejemplo", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ejemplo", "onDestroy");
        Log.i("Ejemplo", "Has salido de la app");
    }

    public void mostarTexto(View view) {
        TextView tv_mensaje = (TextView) findViewById(R.id.txt_mensaje);
        tv_mensaje.setText("hola a todos perras");
    }

    public void AbrirActivity(View view) {
        EditText etnombre = findViewById(R.id.edt_Nombre);
        String nombre = etnombre.getText().toString();
        Intent intent = new Intent(this,App2.class);
        intent.putExtra("nombre", nombre);
        startActivity(intent);
    }

    public void abrirTelefono(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+545424));
        startActivity(intent);
    }
}