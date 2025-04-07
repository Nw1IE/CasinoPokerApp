package com.example.casinopokerapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PokerActivity extends AppCompatActivity {

    private TextView tvGameInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poker);

        tvGameInfo = findViewById(R.id.tvGameInfo);
        startGame();
    }

    private void startGame() {
        // Здесь будет ваша логика игры
        tvGameInfo.setText("Игра в покер начата!"); // Пример сообщения
    }
}