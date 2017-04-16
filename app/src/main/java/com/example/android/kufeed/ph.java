package com.example.android.kufeed;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class ph extends AppCompatActivity {
    TextView txt;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ph);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        img=(ImageView)findViewById(R.id.ph1);
        txt=(TextView)findViewById(R.id.txtMessage);
        txt.setText("#Our mission:\n" +
                "*Provide educational facilities to students for careers in pharmacy profession.\n" +
                "*Study and strengthen the existing pharmacy practices in the private and public sector organizations through appropriate education and training programs.\n" +
                "*Assist pharmaceutical and related organizations in solving their problems by providing consultancy services.\n" +
                "*Contribute to pharmacy and pharmaceutical sciences literature relevant to Nepal through research and publications.\n" +
                "*Develop specialized pharmacy manpower to hospitals, industries, educational institutes and related organizations.\n\n1.To contact us by mail, write to: \n" +
                ">Department of Pharmacy\n" +
                " Kathmandu University\n" +
                ">P.O.BOX 6250 (Kathmandu)\n" +
                " Dhulikhel, Kavre, Nepal\n" +
                "\n" +
                "2.To contact us by e-mail ,write to\n" +
                ">pharmacy@ku.edu.np\n" +
                "   OR\n" +
                ">pannathapa@ku.edu.np\n" +
                "\n" +
                "Call or Fax:\n" +
                ">Phone: +977-11-661399/663199/661511\n" +
                ">Fax: +977-11-661443");
    }
}
