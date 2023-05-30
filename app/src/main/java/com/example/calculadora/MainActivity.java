package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements chenaoh {

    EditText et1, et2;
    TextView tv1;
    Button btnSumar;
    Button btnRestar;
    Button btnMultiplication;
    Button btnDivider;
    @SuppressLint("MissingInflatedID")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.txtnumero1);
        et2 = (EditText) findViewById(R.id.txtnumero2);
        tv1 = (TextView) findViewById(R.id.lblresultado);
        btnSumar = (Button) findViewById(R.id.btnsumar);
        btnSumar.setOnClickListener((View.OnClickListener) this);
        btnRestar = (Button) findViewById(R.id.btnrestar);
        btnRestar.setOnClickListener((View.OnClickListener) this);
        btnMultiplication = (Button) findViewById(R.id.btnmultiplicar);
        btnMultiplication.setOnClickListener((View.OnClickListener) this);
        btnDivider = (Button) findViewById(R.id.btndividir);
        btnDivider.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View v)           {
            float n1, n2, res;
            n1 = Float.parseFloat(et1.getText().toString());
            n2 = Float.parseFloat(et2.getText().toString());
            res = n1 + n2;

            tv1.setText("El resultado es "+res);

            Toast.makeText(getApplicationContext(), "El resultado es" +res, Toast.LENGTH_LONG).show();

            float nume1, nume2, resu;
            nume1 = Float.parseFloat(et1.getText().toString());
            nume2 = Float.parseFloat(et2.getText().toString());
            resu = nume1 - nume2;
            tv1.setText("El resul es "+resu);

            Toast.makeText(getApplicationContext(), "El resul es" +res, Toast.LENGTH_LONG).show();

            float nu1, nu2, resul;
            nu1 = Float.parseFloat(et1.getText().toString());
            nu2 = Float.parseFloat(et2.getText().toString());
            resul = nu1 * nu2;
            tv1.setText("El result es "+resul);

            Toast.makeText(getApplicationContext(), "El resul es" +resul, Toast.LENGTH_LONG).show();

            float num1, num2, resultad;
            num1 = Float.parseFloat(et1.getText().toString());
            num2 = Float.parseFloat(et2.getText().toString());
            resultad = num1 / num2;
            tv1.setText("El resulta es "+resultad);

            Toast.makeText(getApplicationContext(), "El resultad es" +resultad, Toast.LENGTH_LONG).show();
        }
    }



