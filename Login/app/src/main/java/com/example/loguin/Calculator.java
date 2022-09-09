package com.example.loguin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    private EditText EditTextviewA;
    private EditText EditTextviewB;
    private TextView textview_Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        EditTextviewA=findViewById(R.id.EditTextviewA);
        EditTextviewB=findViewById(R.id.EditTextviewB);

        textview_Resultado=findViewById(R.id.textview_Resultado);
    }
    public  void suma(View view){
        operaciones_metodos opemeto=new operaciones_metodos();
        textview_Resultado.setText(opemeto.Sumar(EditTextviewA,EditTextviewB)+"");
    }
    public  void Resta(View view){
        operaciones_metodos opemeto=new operaciones_metodos();
        textview_Resultado.setText(opemeto.Resta(EditTextviewA,EditTextviewB)+"");
    }
    public  void Multiplicacion(View view){
        operaciones_metodos opemeto=new operaciones_metodos();
        textview_Resultado.setText(opemeto.Multiplicacion(EditTextviewA,EditTextviewB)+"");
    }
    public  void Division(View view){
        operaciones_metodos opemeto=new operaciones_metodos();
        textview_Resultado.setText(opemeto.Divicion(EditTextviewA,EditTextviewB)+"");
    }
    public  void Borrar(View view){
        operaciones_metodos opemeto=new operaciones_metodos();
        textview_Resultado.setText(0+"");
        EditTextviewA.setText(null);
        EditTextviewB.setText(null);
    }
}