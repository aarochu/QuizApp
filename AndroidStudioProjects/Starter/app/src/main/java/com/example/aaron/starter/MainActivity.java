package com.example.aaron.starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        Button button;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            button = (Button) findViewById(R.id.button24);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openNewActivity();
                }
            });
        }
        public void openNewActivity(){
            Intent intent = new Intent(this, NewActivity.class);
            startActivity(intent);

        }
    }

