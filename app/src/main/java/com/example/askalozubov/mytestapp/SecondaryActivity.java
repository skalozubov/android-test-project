package com.example.askalozubov.mytestapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {
    public static final String KEY_TEXT = "KEY_TEXT";
    private String message = "default";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        TextView textView = (TextView) findViewById(R.id.textView);

        if (savedInstanceState == null) {
            message = getIntent().getStringExtra(KEY_TEXT);
        }

        assert textView != null;
        textView.setText(message);
    }
}
