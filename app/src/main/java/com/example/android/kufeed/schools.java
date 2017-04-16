package com.example.android.kufeed;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class schools extends Activity {
    Button docsebutton;
    Button eebutton;
    Button mebutton;
    Button cgbutton;
    Button cocsebutton;
    Button B1;
    Button B2;
    Button B3;
    Button B4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schools);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        docsebutton = (Button)findViewById(R.id.docsebutton);
        eebutton = (Button)findViewById(R.id.eebutton);
        mebutton = (Button)findViewById(R.id.mebutton);
        cgbutton = (Button)findViewById(R.id.cgbutton);
        cocsebutton=(Button)findViewById(R.id.cocsebutton);
        B1=(Button)findViewById(R.id.bt_button_view);
        B2=(Button)findViewById(R.id.es_button_view);
        B3=(Button)findViewById(R.id.ns_button_view);
        B4=(Button)findViewById(R.id.ph_button_view);
    }



    Intent intent = getIntent();



    public void docseClicked(View view){
        Intent intent = new Intent(this, docse.class);
        startActivity(intent);

    }
    public void eeClicked(View view){
        Intent intent = new Intent(this, ee.class);
        startActivity(intent);

    }
    public void meClicked(View view){
        Intent intent = new Intent(this, routine.class);
        startActivity(intent);

    }
    public void cgClicked(View view){
        Intent intent = new Intent(this, cg.class);
        startActivity(intent);

    }
    public void cocseClicked(View view){
        Intent intent = new Intent(this, cocse.class);
        startActivity(intent);

    }
    public void btClicked(View view){
        Intent i=new Intent(this , bt.class);
        startActivity(i);


    }
    public void esClicked(View view){
        Intent i=new Intent(this , es.class);
        startActivity(i);

    }
    public void nsClicked(View view){
        Intent i=new Intent(this ,ns.class);
        startActivity(i);

    }
    public void phClicked(View view){
        Intent i=new Intent(this ,ph.class);
        startActivity(i);

    }
    public void lawClicked(View view){
        Intent i= new Intent(this , law.class);
        startActivity(i);
    }


}
