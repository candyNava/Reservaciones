package com.example.reservaciones;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Total extends AppCompatActivity {
   TextView txtSub,txtTotal,txtIva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.total);

        txtSub= findViewById(R.id.XMLSub);
        txtIva= findViewById(R.id.XMLIva);
        txtTotal= findViewById(R.id.XMLTotal);
        String p1=getIntent().getExtras().getString("p1");
        String p2=getIntent().getExtras().getString("p2");
        String p3=getIntent().getExtras().getString("p3");
        txtTotal.setText("Total = "+p3);
        txtIva.setText("IVA = "+p2);
        txtSub.setText("SUB = "+p1);


    }



}