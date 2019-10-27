package com.e.administraciongastos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TransportePublico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte_publico);
        recibirdatos();

    }
    public void recibirdatos(){
        Bundle extras = getIntent().getExtras();
        String d1=extras.getString("transportepublico");

    }

    public void Regresar (View view){

        Intent regresar = new Intent(this,MainActivity.class);
        startActivity(regresar);
    }

    public void Metro(View view) {
        Toast.makeText(this, "Metro ha Descontado 5 pesos de Salario", Toast.LENGTH_LONG).show();

    }

    public void Metrobus(View view) {
        Toast.makeText(this, "Metrobus ha Descontado 6 pesos de Salario", Toast.LENGTH_LONG).show();
    }

    public void cablebus(View view) {
        Toast.makeText(this, "Cablebus ha Descontado 5 pesos de Salario", Toast.LENGTH_LONG).show();
    }

    public void ruta(View view) {
        Toast.makeText(this, "Camión ha Descontado 5.5 pesos de Salario", Toast.LENGTH_LONG).show();
    }

    public void rtp(View view) {
        Toast.makeText(this, "rtp ha Descontado 3 pesos de Salario", Toast.LENGTH_LONG).show();
    }

    public void ecobici(View view) {
        Toast.makeText(this, "Ecobici ha Descontado 13 pesos de Salario", Toast.LENGTH_LONG).show();
    }

    public void trenligero(View view) {
        Toast.makeText(this, "Tren Ligero ha Descontado 5 pesos de Salario", Toast.LENGTH_LONG).show();
    }

    public void gasolina(View view) {
        Intent gas = new Intent (this,Gasolina.class);
        startActivity(gas);
    }



}
