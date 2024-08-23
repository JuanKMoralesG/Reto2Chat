package com.example.reto2chat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.reto2chat.Presenter.RegistroPresenter;
import com.example.reto2chat.model.RegistroModel;
import com.example.reto2chat.view.RegistroContract;

public class RegisterActivity extends AppCompatActivity implements RegistroContract.View {

    private EditText editTextName, editTextEmail, editTextPassword;
    private Button btnRegister;
    private TextView textViewLogin;

    private RegistroPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextName = findViewById(R.id.usernameEditText);
        editTextEmail = findViewById(R.id.emailEditText);
        editTextPassword = findViewById(R.id.passwordEditText);
        btnRegister = findViewById(R.id.registerButton);
        textViewLogin = findViewById(R.id.loginText);

        // Creación del presentador
        presenter = new RegistroPresenter(this, new RegistroModel());

        btnRegister.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                presenter.registerUser();
            }
        });

        textViewLogin.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                navigateToLogin();
            }
        });
    }
    @Override
    public void showToast(String message) {
        // Mostrar un mensaje de tostada
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void clearInputFields() {
        // Limpiar los campos de entrada
        editTextName.setText("");
        editTextEmail.setText("");
        editTextPassword.setText("");
    }

    @Override
    public void navigateToLogin() {
        // Navegar a la actividad de inicio de sesión
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public String getName() {
        // Obtener el nombre ingresado por el usuario
        return editTextName.getText().toString().trim();
    }

    @Override
    public String getEmail() {
        // Obtener el correo electrónico ingresado por el usuario
        return editTextEmail.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        // Obtener la contraseña ingresada por el usuario
        return editTextPassword.getText().toString().trim();
    }
}