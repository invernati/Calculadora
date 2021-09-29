package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double resultado = 0.0;
    private TextView txt_resultado = null;
    private EditText edt_numero1  = null;
    private EditText  edt_numero2= null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_numero1 = findViewById(R.id.txPrimerNumero);
        edt_numero2 = findViewById(R.id.txSegundoNumero);
        txt_resultado = findViewById(R.id.txResultado);
    }


    public void suma(View view) {


        double numero1 = 0.0;
        double numero2 = 0.0;
        String textoNumero1 = String.valueOf(edt_numero1.getText());
        if (!textoNumero1.isEmpty()){


            numero1 = Double.valueOf(textoNumero1);

        }else {
            Toast.makeText(this, "Introduce un numero porfavor", Toast.LENGTH_SHORT).show();

        }
        String textoNumero2 = String.valueOf(edt_numero2.getText());

        if (!textoNumero2.isEmpty()){

            numero2 = Double.valueOf(textoNumero2);

        }


        resultado = numero1 + numero2;

        txt_resultado.setText(String.valueOf(resultado));

    }
}