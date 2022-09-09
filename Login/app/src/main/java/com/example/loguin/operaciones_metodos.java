package com.example.loguin;

import android.widget.EditText;

public class operaciones_metodos implements Operaciones{

    public int Sumar(EditText A, EditText B) {
        int operacion;
        return operacion=Integer.parseInt(A.getText().toString())+Integer.parseInt(B.getText().toString());
    }

    @Override
    public int Resta(EditText A, EditText B) {
        int operacion;
        return operacion=Integer.parseInt(A.getText().toString())-Integer.parseInt(B.getText().toString());
    }

    @Override
    public int Multiplicacion(EditText A, EditText B) {
        int operacion;
        return operacion=Integer.parseInt(A.getText().toString())*Integer.parseInt(B.getText().toString());
    }

    @Override
    public float Divicion(EditText A, EditText B) {
        int operacion;
        return operacion=Integer.parseInt(A.getText().toString())/Integer.parseInt(B.getText().toString());
    }

}
