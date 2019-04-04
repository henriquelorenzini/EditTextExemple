package com.example.edittextexemple;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickEnviar(View view){
        TextInputEditText nomeTextInput = findViewById(R.id.editTextCliente);
        String nome = nomeTextInput.getText().toString();

        TextView textViewResult = findViewById(R.id.textViewResult);
        textViewResult.setText(nome);

    }
}
