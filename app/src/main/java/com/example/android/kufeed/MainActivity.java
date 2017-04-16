package com.example.android.kufeed;

import android.app.ActionBar;
import android.app.Activity;
import android.content.DialogInterface;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.Menu;


public class MainActivity extends Activity {
    Button seminarButton;
    Button noticeButton;
    Button eventsButton;
    Button internal;
    Button schools;
    Button aboutus;
    ImageView I1;


    public WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



        seminarButton = (Button) findViewById(R.id.seminarButton);
        I1 = (ImageView) findViewById(R.id.ku_imageView);
        noticeButton = (Button) findViewById(R.id.noticeButton);
        eventsButton = (Button) findViewById(R.id.eventsButton);
        internal=(Button)findViewById(R.id.internalKuButton);
        aboutus=(Button)findViewById(R.id.aboutButton);
        schools=(Button)findViewById(R.id.schoolsButton);

    }



        public void seminarButtonClicked(View view) {
            Intent i = new Intent(this, seminar.class);
            startActivity(i);
        }


        public void noticeButtonClicked(View view) {
            Intent i = new Intent(this, notice.class);
            startActivity(i);
        }

        public void eventsButtonClicked(View view) {
            Intent i = new Intent(this, event.class);
            startActivity(i);

        }

        public void internalButtonClicked(View view) {
           Intent i= new Intent(this , internalku.class);
            startActivity(i);

        }

        public void schoolsButtonClicked(View view) {
            Intent i = new Intent(this, schools.class);
            startActivity(i);

        }

        public void aboutButtonClicked(View view) {
            Intent i = new Intent(this, about.class);
            startActivity(i);
        }


    }
