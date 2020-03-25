package com.example.reservaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void btnEntrar(View view){
       if(view.getId()==R.id.XMLLuneta){
           Intent i = new Intent(this, Luneta.class);
           startActivity(i);
       }
        if(view.getId()==R.id.XMLpalcos){
            Intent i = new Intent(this, Palcos.class);
            startActivity(i);
        }
        if(view.getId()==R.id.XMLPrimer){
            Intent i = new Intent(this, PrimerBalcon.class);
            startActivity(i);
        }
        if(view.getId()==R.id.XMLSegundo){
            Intent i = new Intent(this, SegundoBalcon.class);
            startActivity(i);
        }
       }



}
