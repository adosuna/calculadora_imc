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
    //Variables de clase, tambien conocidas como campos
    private TextView textoResultado;
    private Button botonCalcular;
    private RadioButton botonHombre;
    private RadioButton botonMujer;
    private EditText edadEditarTexto;
    private EditText centimetrosEditarTexto;
    private EditText pesoEditarTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //R = resource o recurso
        buscarVistas();

        configurarBotonClicListener();
    }

    private void buscarVistas(){
        textoResultado = findViewById(R.id.vista_texto_resultado);

        botonHombre = findViewById(R.id.boton_radio_hombre);
        botonMujer = findViewById(R.id.boton_radio_mujer);

        edadEditarTexto = findViewById(R.id.editar_texto_edad);
        centimetrosEditarTexto = findViewById(R.id.editar_texto_centimetros);
        pesoEditarTexto = findViewById(R.id.editar_texto_peso);

        botonCalcular = findViewById(R.id.boton_calcular);
    }

    private void configurarBotonClicListener() {
        botonCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calcularImc();
            }
        });
    }

    private void calcularImc() {
        String edadTexto = edadEditarTexto.getText().toString();
        String centimetrosTexto = centimetrosEditarTexto.getText().toString();
        String pesoTexto = pesoEditarTexto.getText().toString();

        // Convirtiendo numeros en String a int
        int edad = Integer.parseInt(edadTexto);
        double altura = Double.parseDouble(centimetrosTexto);
        int peso = Integer.parseInt(pesoTexto);

        //Altura en metros
        double alturaMetros = (altura / 100);

        double imc = peso / (alturaMetros*alturaMetros);

        String imcResultadoTexto = String.valueOf(imc);

        textoResultado.setText(imcResultadoTexto);
    }
}