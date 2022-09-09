package com.example.loguin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText EmailAddress;
    private EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EmailAddress = findViewById(R.id.EmailAddress);
        Password = findViewById(R.id.Password);
        Button button = findViewById(R.id.LOGIN);
        String id = "Pepitoperez@gmail.com";
        String Password1 = "123456";


                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (id.equals(EmailAddress.getText().toString())) {
                            if (Password1.equals(Password.getText().toString())) {
                        Intent intent = new Intent(MainActivity.this, Calculator.class);
                        startActivity(intent);
                            }
                        }
                    }
                });


    }
}