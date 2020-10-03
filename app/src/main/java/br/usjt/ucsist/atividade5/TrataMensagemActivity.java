package br.usjt.ucsist.atividade5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TrataMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trata_mensagem);
        Intent origemIntent = getIntent();
        String mensagem = origemIntent.getStringExtra("msg");
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }
}