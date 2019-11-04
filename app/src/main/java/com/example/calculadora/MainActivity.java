package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
calculadora proceso;
EditText caja1;
EditText caja2;
Button btnSuma;
Button btnResta;
Button btnMulti;
Button btnDivi;
TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        proceso = new calculadora();
        caja1 = (EditText) findViewById(R.id.et_numa);
        caja2 = (EditText) findViewById(R.id.et_numb);

        tvResultado = (TextView) findViewById(R.id.tv_resultado);

        btnSuma = (Button) findViewById(R.id.bt_suma);
        btnResta = (Button) findViewById(R.id.bt_resta);
        btnMulti = (Button) findViewById(R.id.bt_multi);
        btnDivi = (Button) findViewById(R.id.bt_div);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtenerDatos();
                tvResultado.setText(String.valueOf(proceso.Sumar()));
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtenerDatos();
                tvResultado.setText(String.valueOf(proceso.Restar()));
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtenerDatos();
                tvResultado.setText(String.valueOf(proceso.Multi()));
            }
        });
        btnDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtenerDatos();
                tvResultado.setText(String.valueOf(proceso.Divi()));
            }
        });







    }
    private void  obtenerDatos(){
        proceso.setNumA(Integer.parseInt(caja1.getText().toString()));
        proceso.setNumB(Integer.parseInt(caja2.getText().toString()));

    }
}
