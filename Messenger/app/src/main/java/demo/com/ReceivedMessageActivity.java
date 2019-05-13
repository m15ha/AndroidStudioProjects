package demo.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMessageActivity extends AppCompatActivity {
    public TextView textViewReceivedMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);
        textViewReceivedMsg = findViewById(R.id.textViewReceivedMsg);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        textViewReceivedMsg.setText(msg);

    }
}
