package com.example.sgra;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        // Encontra o texto/botão de voltar pelo ID do XML
        TextView textVoltarLogin = findViewById(R.id.textVoltarLogin);

        // Configura o que acontece quando clica em "Voltar para o Login"
        textVoltarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Fecha a tela atual de cadastro e retorna para a tela de login (MainActivity)
                finish();
            }
        });
    }
}