package com.example.android.kufeed;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class internalku extends AppCompatActivity {

    Button B1;
    Button B2;
    Button B3;
    Button B4;
    public WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internalku);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        B1 = (Button) findViewById(R.id.button1);
        B2 = (Button) findViewById(R.id.button2);
        B3 = (Button) findViewById(R.id.button3);
        B4=(Button)findViewById(R.id.button4);
    }

    Intent intent = getIntent();
    public void button1(View view){
        Intent i=new Intent(this , button1.class);
        startActivity(i);
    }
    public void button2(View view) {
        Intent i = new Intent(this, button2.class);
        startActivity(i);
    }
    public void button3(View view) {
        Intent i = new Intent(this, button3.class);
        startActivity(i);
    }
    public void button4(View view) {
        Intent i = new Intent(this, routine.class);
        startActivity(i);
    }
}
