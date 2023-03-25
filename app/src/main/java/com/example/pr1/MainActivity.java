package com.example.pr1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonEdit = findViewById(R.id.button_edit);
        Button buttonIntentSecond = findViewById(R.id.button_intent_second);
        Button buttonIntentThird = findViewById(R.id.button_intent_third);

        EditText editText = findViewById(R.id.edit_text);
        TextView textView = findViewById(R.id.text_third);

        buttonEdit.setOnClickListener(view -> textView.setText(editText.getText()));
        buttonIntentSecond.setOnClickListener(view -> {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra(EXTRA_MESSAGE, textView.getText().toString());
            startActivity(intent);
        });
        buttonIntentThird.setOnClickListener(view -> {
            Intent intent = new Intent(this, ThirdActivity.class);
            intent.putExtra(EXTRA_MESSAGE, textView.getText().toString());
            startActivity(intent);
        });
    }
}