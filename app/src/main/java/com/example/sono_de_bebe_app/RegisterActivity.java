package com.example.sono_de_bebe_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button submitRegister = findViewById(R.id.btnRegister);
        EditText emailField = findViewById(R.id.inputEmail);
        EditText passwordField = findViewById(R.id.inputPassword);
        TextView forgotPassword = findViewById(R.id.forgotPassword);

        String resultado = emailField.getText().toString();
        submitRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forgotPassword.setText(resultado);
            }
        });
    }
}