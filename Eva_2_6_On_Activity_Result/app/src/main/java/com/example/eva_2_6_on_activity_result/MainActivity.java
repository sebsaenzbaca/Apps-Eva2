package com.example.eva_2_6_on_activity_result;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final static int CODIGO_SECUN = 1000;
    Button btnIniSecun;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, Secundaria.class);
    }
    @Override
    protected void onStart(){
        super.onStart();
        btnIniSecun = findViewById(R.id.btnIniSecun);
        btnIniSecun.setOnClickListener((view) ->{
            startActivityForResult(intent,CODIGO_SECUN);
        }) ;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case CODIGO_SECUN:
                if(resultCode == Activity.RESULT_OK){
                    Toast.makeText(this, data.getStringExtra("VALOR"), Toast.LENGTH_LONG).show();
                }
                break;
            default:
        }

    }
}