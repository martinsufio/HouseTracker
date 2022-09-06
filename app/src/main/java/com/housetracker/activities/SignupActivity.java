package com.housetracker.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.housetracker.R;


public class SignupActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private EditText UsernameInput;
    private EditText PasswordInput;
    private Button SignupButton;
    private TextView hasAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
}