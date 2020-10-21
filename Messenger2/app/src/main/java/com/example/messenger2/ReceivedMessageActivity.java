package com.example.messenger2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMessageActivity extends AppCompatActivity {

    private TextView textViewReceivedMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);
        textViewReceivedMessage = findViewById(R.id.textViewReceivedMessage);
        Intent intent = getIntent();
        String m1 = intent.getStringExtra("m1");
        textViewReceivedMessage.setText(m1);
    }
}