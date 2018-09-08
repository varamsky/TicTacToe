package com.example.shubham.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mButtonAlone;
    Button mButtonFriend;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonAlone = findViewById(R.id.button_alone);
        mButtonAlone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = MainActivity2.newIntent(MainActivity.this,R.id.button_alone);
                startActivity(intent);
            }
        });

        mButtonFriend = findViewById(R.id.button_friend);
        mButtonFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = MainActivity2.newIntent(MainActivity.this,R.id.button_friend);
                startActivity(intent);
            }
        });
    }
}
