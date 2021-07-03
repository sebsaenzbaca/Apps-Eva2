package com.example.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText edtTxtNom, edtTxtSal;
    CheckBox chkBxInfo;
    RadioGroup rdGrpEstadoCiv;


    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, Secundaria.class);
    }
    protected void onStart(View v){
        super.onStart();
        edtTxtNom = findViewById(R.id.edtTxtNombre);
        edtTxtSal = findViewById(R.id.edtTxtSal);
        chkBxInfo = findViewById(R.id.chkBxInfo);
        rdGrpEstadoCiv = findViewById(R.id.rdGrpEstadoCiv);


    }
    public void onClick(View v){
        intent.putExtra("Nombre", edtTxtNom.getText().toString());
        Double dSalario = 0.0;
        dSalario = Double.parseDouble(edtTxtSal.getText().toString());
        intent.putExtra("Salario", dSalario);
        intent.putExtra("Info", chkBxInfo.isChecked());
        intent.putExtra("Estado Civil",rdGrpEstadoCiv.getCheckedRadioButtonId() );
        startActivity(intent);
    }
}