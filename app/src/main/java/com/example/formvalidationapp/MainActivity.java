package com.example.formvalidationapp;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends  AppCompatActivity{
    private EditText editTextName;
    private EditText editTextEmail;
    private Button buttonSumbit;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        buttonSumbit = findViewById(R.id.buttonSumbit);

        buttonSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();

                if (name.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Prosze wprowadzic imie", Toast.LENGTH_SHORT).show();
                } else if (email.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Prosze wprowadzic adres email", Toast.LENGTH_SHORT).show();
                } else if
                (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {

                Toast.makeText(MainActivity.this, "Niepoprawny adres email", Toast.LENGTH_SHORT).show();
            }else

            {
                Toast.makeText(MainActivity.this, "Formularz przeslany poprawnie", Toast.LENGTH_SHORT).show();
            }
            }
        });
    }
}