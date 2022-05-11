package com.example.estausdecalificacion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.matEditTex);
        et2 = (EditText) findViewById(R.id.fisEditTex);
        et3 = (EditText) findViewById(R.id.naturalestex);
        tv1 = (TextView) findViewById(R.id.textView);
    }
        //ESTE ES EL METODO QUE REALIZA EL PROMEDIO O LA EVALUCACION

        public void Evaluar(View hola) {
            String mat_string = et1.getText().toString();
            String fis_string = et2.getText().toString();
            String nat_string = et3.getText().toString();

            int mat_int = Integer.parseInt(mat_string);
            int fis_int = Integer.parseInt(fis_string );
            int nat_int = Integer.parseInt(nat_string);

            int evaluar = (mat_int + fis_int + nat_int ) /3;

            if (evaluar >= 6){
                String result = String.valueOf(evaluar);
                tv1.setText("Usted abaca de pasar con "+ evaluar);
            } else if (evaluar <=5){
                tv1.setText("Usted acaba de reprobar con "+ evaluar);
            }

        }



    }
