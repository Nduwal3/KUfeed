package com.example.android.kufeed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class routine extends AppCompatActivity {
    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;
    TextView txt6;
    TextView txt7;
    TextView txt8;
    TextView txt9;
    TextView txt10;
    TextView txt11;
    TextView txt12;
    TextView txt13;
    TextView txt14;
    TextView txt31;
    TextView txt32;
    TextView txt33;
    TextView txt34;
    TextView txt35;
    TextView txt36;
    TextView txt37;
    TextView txt41;
    TextView txt42;
    TextView txt43;
    TextView txt44;
    TextView txt45;
    TextView txt46;
    TextView txt47;
    TextView txt51;
    TextView txt52;
    TextView txt53;
    TextView txt54;
    TextView txt55;
    TextView txt56;
    TextView txt57;
    TextView txt61;
    TextView txt62;
    TextView txt63;
    TextView txt64;
    TextView txt65;
    TextView txt66;
    TextView txt67;
    TextView txt71;
    TextView txt72;
    TextView txt73;
    TextView txt74;
    TextView txt75;
    TextView txt76;
    TextView txt77;
    TextView txtN;
    TextView txtN1;
    TextView txtN2;
    TextView txtN3;
    TextView txtN4;
    TextView txtN5;
    TextView txtN6;
    Button CE1btn;
    Button CE2btn;
    Button CE3btn;
    Button CE4btn;
    Button CS1btn;
    Button CS2btn;
    Button CS3btn;
    Button CS4btn;
    TextView textView;
    BufferedReader reader = null;
    TextView[] arrTxtView;
    String text = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);


        txt1 = (TextView) findViewById(R.id.txtView1);
        txt2 = (TextView) findViewById(R.id.txtView2);
        txt3 = (TextView) findViewById(R.id.txtView3);
        txt4 = (TextView) findViewById(R.id.txtView4);
        txt5 = (TextView) findViewById(R.id.txtView5);
        txt6 = (TextView) findViewById(R.id.txtView6);
        txt7 = (TextView) findViewById(R.id.txtView7);
        txt8 = (TextView) findViewById(R.id.txtView21);
        txt9 = (TextView) findViewById(R.id.txtView22);
        txt10 = (TextView) findViewById(R.id.txtView23);
        txt11 = (TextView) findViewById(R.id.txtView24);
        txt12 = (TextView) findViewById(R.id.txtView25);
        txt13 = (TextView) findViewById(R.id.txtView26);
        txt14 = (TextView) findViewById(R.id.txtView27);
        txt31 = (TextView) findViewById(R.id.txtView31);
        txt32 = (TextView) findViewById(R.id.txtView32);
        txt33 = (TextView) findViewById(R.id.txtView33);
        txt34 = (TextView) findViewById(R.id.txtView34);
        txt35 = (TextView) findViewById(R.id.txtView35);
        txt36 = (TextView) findViewById(R.id.txtView36);
        txt37 = (TextView) findViewById(R.id.txtView37);
        txt41 = (TextView) findViewById(R.id.txtView41);
        txt42 = (TextView) findViewById(R.id.txtView42);
        txt43 = (TextView) findViewById(R.id.txtView43);
        txt44 = (TextView) findViewById(R.id.txtView44);
        txt45 = (TextView) findViewById(R.id.txtView45);
        txt46 = (TextView) findViewById(R.id.txtView46);
        txt47 = (TextView) findViewById(R.id.txtView47);
        txt51 = (TextView) findViewById(R.id.txtView51);
        txt52 = (TextView) findViewById(R.id.txtView52);
        txt53 = (TextView) findViewById(R.id.txtView53);
        txt54 = (TextView) findViewById(R.id.txtView54);
        txt55 = (TextView) findViewById(R.id.txtView55);
        txt56 = (TextView) findViewById(R.id.txtView56);
        txt57 = (TextView) findViewById(R.id.txtView57);
        txt61 = (TextView) findViewById(R.id.txtView61);
        txt62 = (TextView) findViewById(R.id.txtView62);
        txt63 = (TextView) findViewById(R.id.txtView63);
        txt64 = (TextView) findViewById(R.id.txtView64);
        txt65 = (TextView) findViewById(R.id.txtView65);
        txt66 = (TextView) findViewById(R.id.txtView66);
        txt67 = (TextView) findViewById(R.id.txtView67);
        txt71 = (TextView) findViewById(R.id.txtView71);
        txt72 = (TextView) findViewById(R.id.txtView72);
        txt73 = (TextView) findViewById(R.id.txtView73);
        txt74 = (TextView) findViewById(R.id.txtView74);
        txt75 = (TextView) findViewById(R.id.txtView75);
        txt76 = (TextView) findViewById(R.id.txtView76);
        txt77 = (TextView) findViewById(R.id.txtView77);
        txtN = (TextView) findViewById(R.id.txtViewN);
        txtN1 = (TextView) findViewById(R.id.txtViewN1);
        txtN2 = (TextView) findViewById(R.id.txtViewN2);
        txtN3 = (TextView) findViewById(R.id.txtViewN3);
        txtN4 = (TextView) findViewById(R.id.txtViewN4);
        txtN5 = (TextView) findViewById(R.id.txtViewN5);
        txtN6 = (TextView) findViewById(R.id.txtViewN6);
        //reader=(BufferedReader);


       TextView[] array1 = {txt1, txt2, txt3, txt4, txt5, txt6, txt7,txtN, txt8, txt9, txt10, txt11, txt12, txt13, txt14,txtN1,txt31, txt32, txt33, txt34, txt35, txt36, txt37,txtN2, txt41, txt42, txt43, txt44, txt45, txt46, txt47, txtN3,txt51, txt52, txt53, txt54, txt55, txt56, txt57,txtN4, txt61, txt62, txt63, txt64, txt65, txt66, txt67,txtN5, txt71, txt72, txt73, txt74, txt75, txt76, txt77,txtN6};
        arrTxtView=array1;
        CE1btn = (Button) findViewById(R.id.CE1btn);
        CE2btn = (Button) findViewById(R.id.CE2btn);
        CE3btn = (Button) findViewById(R.id.CE3btn);
        CE4btn = (Button) findViewById(R.id.CE4btn);

        CS1btn = (Button) findViewById(R.id.CS1btn);
        CS2btn = (Button) findViewById(R.id.CS2btn);
        CS3btn = (Button) findViewById(R.id.CS3btn);
        CS4btn = (Button) findViewById(R.id.CS4btn);
        textView=(TextView)findViewById(R.id.textView);


        String text = "";
        try

        {
        textView.setText("Computer Engineering   Year- 1st sem-1st");
        InputStream is = getAssets().open("CE1.txt");
        reader = new BufferedReader(new InputStreamReader(getAssets().open("CE1.txt")));
        String eachline;
        int index = 0;
        while ((eachline = reader.readLine()) != null) {    //bufferreader.readline() converts inputStream into string.
            text = eachline;
            arrTxtView[index].setText(text);
            if (index >= 55) {
                break;
            } else {
                index++;
            }
        }

        }

        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }


    public void CE1btn(View view) {

        try {
            textView.setText("Computer Engineering   Year- 1st sem-1st");
            InputStream is = getAssets().open("CE1.txt");
            reader = new BufferedReader(new InputStreamReader(getAssets().open("CE1.txt")));
            String eachline;
            int index = 0;
            while ((eachline = reader.readLine()) != null) {
                text = eachline;
                arrTxtView[index].setText(text);
                if (index >= 55) {
                    break;
                } else {
                    index++;
                }
            }


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public void CE2btn(View view){

        try{
            textView.setText("Computer Engineering   Year-2nd sem-1st");
            InputStream is = getAssets().open("CE2.txt");
            reader=new BufferedReader(new InputStreamReader(getAssets().open("CE2.txt")));
            String eachline;
            int index=0;
            while((eachline = reader.readLine()) != null)
            {
                text=eachline;
                arrTxtView[index].setText(text);
                if(index >=55)
                {break;}
                else{
                    index++;}

            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }



    public void CE3btn(View view){

        try{
            textView.setText("Computer Engineering Year- 3rd sem-1st");
            InputStream is = getAssets().open("CE3.txt");
            reader=new BufferedReader(new InputStreamReader(getAssets().open("CE3.txt")));
            String eachline;
            int index=0;
            while((eachline = reader.readLine()) != null)
            {
                text=eachline;
                arrTxtView[index].setText(text);
                if(index >=55)
                {break;}
                else{
                    index++;}

            }


        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
     public void CE4btn(View view){

        try{
            textView.setText("Computer Engineering Year- 4th sem-1st");
            InputStream is = getAssets().open("CE4th.txt");
            reader=new BufferedReader(new InputStreamReader(getAssets().open("CE4th.txt")));
            String eachline;
            int index=0;
            while((eachline = reader.readLine()) != null)
            {

                text=eachline;
                arrTxtView[index].setText(text);

                if(index >=55)

                {break;}
                else{
                    index++;}

            }
            //Toast.makeText(getApplicationContext(),index,Toast.LENGTH_SHORT).show();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
     }
    public void CS1btn(View view){
        try{
            textView.setText("Computer Science Year- 1st sem-1st");
            InputStream is = getAssets().open("CS1st.txt");
            reader=new BufferedReader(new InputStreamReader(getAssets().open("CS1st.txt")));
            String eachline;
            int index=0;
            while((eachline = reader.readLine()) != null)
            {
                text=eachline;
                arrTxtView[index].setText(text);

                if(index >=55)

                {break;}
                else{
                    index++;}
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }


    }

    public void CS2btn(View view) {

        try {
            textView.setText("Computer Science Year- 2nd sem-1st");
            InputStream is = getAssets().open("cs2nd1st.txt");
            reader = new BufferedReader(new InputStreamReader(getAssets().open("cs2nd1st.txt")));
            String eachline;
            int index=0;
            while ((eachline= reader.readLine()) !=null)
            {
                text= eachline;
                arrTxtView[index].setText(text);
                if(index>=55){
                    break;
                }
                else{
                    index++;
                }
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        finally {
            System.out.println("Release resource");
        }
    }


    public void CS3btn(View view) {
        try {
            textView.setText("Computer Science   Year- 3rd sem-1st");
            InputStream is = getAssets().open("CS3rd1st.txt");
            reader = new BufferedReader(new InputStreamReader(getAssets().open("CS3rd1st.txt")));
            String eachline;
            int index=0;
            while ((eachline= reader.readLine()) !=null)
            {
                text= eachline;
                arrTxtView[index].setText(text);
                if(index>=55){
                    break;
                }
                else{
                    index++;
                }
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public void CS4btn(View view){
        try{
            textView.setText("Computer Science   Year-4th sem-1st ");
            InputStream is = getAssets().open("CS3rd1st.txt");
            reader = new BufferedReader(new InputStreamReader(getAssets().open("CS3rd!st")));
            String eachline;
            int index=0;
            while((eachline= reader. readLine())!=null)
            {
                text=eachline;
                arrTxtView[index].setText(text);
                if(index>=55){
                    break;
                }
                else{index++;}
            }

        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }





}
