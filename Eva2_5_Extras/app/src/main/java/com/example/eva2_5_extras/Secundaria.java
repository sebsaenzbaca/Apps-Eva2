package com.example.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {
    Intent intent;
    TextView txtVwDatos;
    private String sNom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        intent = getIntent();
        intent.getStringExtra("NOMBRE");
        Double dsal = intent.getDoubleExtra("SALARIO", 0.0);
        boolean bInfo = intent.getBooleanExtra("INFO", false);
        int iEstado = intent.getIntExtra("ESTADO_CIVIL", 0);
        TextView txtVwDatos;
        txtVwDatos = findViewById(R.id.txtVwDatos);
        txtVwDatos.append("Nombre: \n");
        txtVwDatos.append(sNom + "\n");
        txtVwDatos.append("Salario: \n");
        txtVwDatos.append("dSal: \n");
        txtVwDatos.append("Informacion: \n");
    if (bInfo)
        txtVwDatos.append("Con informacion: \n");
    else   
        txtVwDatos.append("\n");
    
    txtVwDatos.append("\n");
    }
    
    
    public void onClickSal(View v){

        finish();
    }
}