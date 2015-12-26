package com.nickjwpark.techbridgeandroidsandbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    TextView textLog;
    ScrollView scrollLog;
    Button btnRun;


    public void runMethod() {
        //try something!
        println("Hello World!");
        int a = 10;
        int b = 3;
        double c = (double) a / b;
        println(""+c);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textLog = (TextView) findViewById(R.id.textLog);
        scrollLog = (ScrollView) findViewById(R.id.scrollLog);
        btnRun = (Button) findViewById(R.id.btnRun);

        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                println("");
                println("--------Running--------");
                runMethod();
            }
        });
    }
    public void println(String str) {
        String txt = (String) textLog.getText();
        txt += "\n";
        textLog.setText(txt + str);
        scrollLog.scrollTo(0, scrollLog.getBottom());
    }
}