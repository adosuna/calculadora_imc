package com.utpp.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //R = resource o recurso

        String alertaTexto = "Este es mi texto de la variable";

        Toast.makeText(this, alertaTexto,
                Toast.LENGTH_LONG).show();
    }
}