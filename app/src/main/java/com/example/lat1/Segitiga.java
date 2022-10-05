package com.example.lat1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {
    EditText a,t;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        a = (EditText) findViewById(R.id.T1);
        t = (EditText) findViewById(R.id.T2);
        hitung = (Button) findViewById(R.id.B_hasil);
        hasil = (TextView) findViewById(R.id.H1);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a.length() == 0 && t.length() == 0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }else if(a.length() == 0){
                    Toast.makeText(getApplication(),"Alas Tidak boleh kosong",Toast.LENGTH_LONG).show();
                }else if (t.length() == 0){
                    Toast.makeText(getApplication(),"Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }else{
                 String isiAlas = a.getText().toString();
                 String isiTinggi = t.getText().toString();
                 double a = Double.parseDouble(isiAlas);
                 double t = Double.parseDouble(isiTinggi);
                 double hs = LuasSegitiga(a,t);
                 String output = String.valueOf(hs);
                 hasil.setText(output.toString());
                }

            }
        });
    }
    public double LuasSegitiga(double a, double t){return a*t/2;}
}