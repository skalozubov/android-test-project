package com.example.askalozubov.mytestapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.askalozubov.mytestapp.SecondaryActivity.KEY_TEXT;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainButton = (Button) findViewById(R.id.button);
        mainButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra(KEY_TEXT, "Hello");
                startActivity(intent);
                break;
        }
    }
}
