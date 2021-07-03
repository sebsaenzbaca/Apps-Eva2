package com.example.eva_2_6_on_activity_result;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Secundaria extends AppCompatActivity {
Intent intent;
@Override
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_secundaria);
    intent = new Intent();

}
public void onClick(View v){
    intent.putExtra("VALOR", "Hola Mundo Cruel!!");
    setResult(Activity.RESULT_OK, intent);
    finish();

}
public void onClickCancel(View v){
    setResult(Activity.RESULT_CANCELED);
    finish();
}
}