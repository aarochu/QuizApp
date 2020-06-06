package com.example.aaron.starter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by aaron on 6/2/20.
 */

public class NewActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    EditText editText2;
    EditText editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_main);
        button = (Button) findViewById(R.id.button2);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitAnswers();
            }
        });
    }
    public void submitAnswers(){
        int numbcorrect = 0;
        String content2 = editText2.getText().toString();
        if (content2.equals("5")) {
            numbcorrect +=1;
        }
        String content3 = editText3.getText().toString();
        if (content3.equals("12")) {
            numbcorrect +=1;
        }
        String content = editText.getText().toString();
        if (content.equals("2√10")) {
            numbcorrect +=1;
        }
        Context context = getApplicationContext();
        CharSequence text = "You got "+numbcorrect+" correct";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        if (numbcorrect == 0) {
            text = "You need to retake kindergarten";
            int duration2 = Toast.LENGTH_SHORT;
        }
        if (numbcorrect == 1) {
            text = "Lucky guess";
            int duration3 = Toast.LENGTH_SHORT;
        }
        if (numbcorrect == 2) {
            text = "Not bad";
            int duration4 = Toast.LENGTH_SHORT;
        }
        if (numbcorrect == 3) {
            text = "Next Einstein?";
            int duration5 = Toast.LENGTH_SHORT;
        }
        Toast toast2 = Toast.makeText(context, text, duration);
        toast2.show();
    }
}
