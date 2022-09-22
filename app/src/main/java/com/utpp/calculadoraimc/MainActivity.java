package com.utpp.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //R = resource o recurso

       TextView textoResultado = findViewById(R.id.vista_texto_resultado);

       RadioButton botonHombre = findViewById(R.id.boton_radio_hombre);
       RadioButton botonMujer = findViewById(R.id.boton_radio_mujer);

       EditText edadEditarTexto = findViewById(R.id.editar_texto_edad);
       EditText centimetrosEditarTexto = findViewById(R.id.editar_texto_centimetros);
       EditText pesoEditarTexto = findViewById(R.id.editar_texto_peso);

       Button botonCalcular = findViewById(R.id.boton_calcular);

       botonCalcular.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               Toast.makeText(MainActivity.this, "Orale, ya reacciona a botonazos",
                       Toast.LENGTH_LONG).show();
           }
       });


       textoResultado.setText("Orale, ya puedo actualizar mi textview - soy la mera onda");
    }
}