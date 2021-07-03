package com.example.eva2_7_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        intent = getIntent();
        Bundle bundle = intent.getExtras();
        MiClase miClase = (MiClase) bundle.getSerializable("Prueba");

        Toast.makeText(this, bundle.getString("Mensaje")+ "" + bundle.getInt("Edad")
        + "" +  bundle.getBoolean("Empleado") +miClase.getParam1() +
                "" + miClase.getParam2(), Toast.LENGTH_LONG).show();
    }
}