package com.e.administraciongastos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class MainActivity extends AppCompatActivity {

    public EditText dinero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            dinero = (EditText) findViewById(R.id.Num_1);

            String num[] = fileList();

            if(ValorExiste(num, "numero.int")) {
                try {
                    InputStreamReader numero = new InputStreamReader(openFileInput("numero.int"));
                    BufferedReader br = new BufferedReader(numero);
                    String linea = br.readLine();
                    String numeroEntero = "";
                    while (linea != null) {
                        numeroEntero = numeroEntero + linea + "\n";
                        linea = br.readLine();
                    }
                    br.close();
                    numero.close();
                    dinero.setText(numeroEntero);
                } catch (IOException e) {}
            }
        }
        private boolean ValorExiste(String num [], String Nombre){
            for(int i=0; i < num.length; i++)
                if(Nombre.equals(num[i]))
                    return true;
            return false;
        }
        public void Evento (View view) {
            try {
                OutputStreamWriter numero = new OutputStreamWriter(openFileOutput("numero.int", Activity.MODE_PRIVATE));
                numero.write(dinero.getText().toString());
                //int dinero1 =Integer.parseInt(dinero);
                numero.flush();
            } catch (IOException e){}
            Toast.makeText(this, "Dato guardado correctamente", Toast.LENGTH_LONG).show();
        }





    public void Transporte (View view){

            Intent transporte = new Intent(MainActivity.this,TransportePublico.class);
            transporte.putExtra("Transportepublico",dinero.toString());
            startActivity(transporte);
        }




    public void Entretenimiento (View view){

        Intent entretenimiento = new Intent (this, Entretenimiento.class);
        startActivity(entretenimiento);

    }

    public void GastosFijos (View view){

        Intent gastos = new Intent (this, GastosFijos.class);
        startActivity(gastos);

    }







}
