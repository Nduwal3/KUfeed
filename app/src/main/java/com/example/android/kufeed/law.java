package com.example.android.kufeed;

import android.app.Activity;
import android.content.Intent;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.TextView;

public class law extends Activity {
    TextView txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        txtMessage=(TextView)findViewById(R.id.txtMessage);
        txtMessage.setText("Kathmandu University School of Law (KUSL) is the seventh School in the Kathmandu University System.\n" +
                "\n" +
                "The School of Law is based in Dhulikhel municipality of Kavre District. It was established in December 2013 following the decision of the Senate in July the same year and some preparatory works accomplished by the Offices of the Vice Chancellor and Registrar.\n" +
                "\n" +
                "The University has trained confident, creative, and socially responsible professionals ever since it was established in 1991. The School of Law builds on this knowledge infrastructure.\n" +
                "\n" +
                "We encourage our students, parents or guardians to visit us at Dhulikel. Our Academic Counsellor will be happy to take you for a round, and explain you everything that you dont find on this website.\n\n"+"#Contact KUSL" +
                "\n" +
                " Dhulikhel, Nepal\n" +
                "(Close to Bus Park)\n" +
                " P.O.Box - 6250\n" +
                " Phone:977-011-490735\n" +
                " Fax- 977-011-661443\n\n\n@ 2017 Kathmandu University School of Law\n" +
                " Designed & Developed By: Bhupendra Huzdar, : +977-9841461445\n");
    }
    Intent intent = getIntent();
}
