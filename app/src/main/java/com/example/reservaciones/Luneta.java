package com.example.reservaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class Luneta extends AppCompatActivity {
   TextView txtCantidad;
   RadioButton bt1,bt2,bt3,bt4,bt5,bt6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.luneta);

        txtCantidad= findViewById(R.id.XMLpERS);
        bt1= findViewById(R.id.rb350);
        bt2= findViewById(R.id.rd650);
        bt3= findViewById(R.id.rd450);
        bt5= findViewById(R.id.rd550);
        bt6= findViewById(R.id.rb750);


    }
    public void btnEntrar(View view){
        float sub = 0, total=0, iva=0;
        if (view.getId() == R.id.XMLCalcula1) {
            Intent i = new Intent(this, Total.class);
            if(!txtCantidad.getText().toString().equals("")) {


                if (bt1.isChecked()) {
                    int cantidad = Integer.valueOf(txtCantidad.getText().toString());
                    sub = 350 * cantidad;
                    iva = sub * .16f;
                    total = iva + sub;

                }
                if (bt2.isChecked()) {
                    int cantidad = Integer.valueOf(txtCantidad.getText().toString());
                    sub = 650 * cantidad;
                    iva = sub * .16f;
                    total = iva + sub;
                }
                if (bt3.isChecked()) {
                    int cantidad = Integer.valueOf(txtCantidad.getText().toString());
                    sub = 450 * cantidad;
                    iva = sub * .16f;
                    total = iva + sub;

                }
                if (bt5.isChecked()) {
                    int cantidad = Integer.valueOf(txtCantidad.getText().toString());
                    sub = 550 * cantidad;
                    iva = sub * .16f;
                    total = iva + sub;
                }
                if (bt6.isChecked()) {
                    int cantidad = Integer.valueOf(txtCantidad.getText().toString());
                    sub = 750 * cantidad;
                    iva = sub * .16f;
                    total = iva + sub;
                }
                i.putExtra("p1", String.valueOf(sub));
                i.putExtra("p2", String.valueOf(iva));
                i.putExtra("p3", String.valueOf(total));
                startActivity(i);
            }else{
                Toast. makeText(getApplicationContext(),"Debe Introducir cantidad de  lugares", Toast. LENGTH_SHORT).show();
            }



        }
    }
}