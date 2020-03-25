package com.example.reservaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class SegundoBalcon extends AppCompatActivity {
    TextView txtCantidad;
    RadioButton bt1,bt2,bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundo);
        txtCantidad= findViewById(R.id.XMLCantidad);
        bt1= findViewById(R.id.rd280);
        bt2= findViewById(R.id.rb300);
        bt3= findViewById(R.id.rb250);

    }

    public void btnEntrar(View view){
        float sub = 0, total=0, iva=0;
        if (view.getId() == R.id.XMLCalcula1) {
            if(!txtCantidad.getText().toString().equals("")) {

            Intent i = new Intent(this, Total.class);
            if (bt1.isChecked()) {
                int cantidad = Integer.valueOf(txtCantidad.getText().toString());
                sub = 280 * cantidad;
                iva = sub * .16f;
                total=iva+sub;

            }
            if (bt2.isChecked()) {
                int cantidad = Integer.valueOf(txtCantidad.getText().toString());
                sub = 300 * cantidad;
                iva = sub * .16f;
                total=iva+sub;
            }
            if (bt3.isChecked()) {
                int cantidad = Integer.valueOf(txtCantidad.getText().toString());
                sub = 250 * cantidad;
                iva = sub * .16f;
                total=iva+sub;

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