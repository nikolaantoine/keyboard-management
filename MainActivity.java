package com.example.keyboardmanagment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnKeyListener {

    EditText editTextLogin;
    EditText editTextPassword;
    Button button;

    @Override
    public boolean onKey(View view, int i, KeyEvent keyEvent) {

        if (i == KeyEvent.KEYCODE_ENTER && keyEvent.getAction() == keyEvent.ACTION_DOWN) {
            press();
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLogin = findViewById(R.id.editLogin);
        editTextPassword = findViewById(R.id.editPassword);

        editTextPassword.setOnKeyListener(this);

    }

    public void press () {
        Log.i("Pressed", "Successful");
    }



}