package com.example.android.kufeed;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ns extends AppCompatActivity {
    TextView txt;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ns);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        img=(ImageView)findViewById(R.id.ns1);
        txt=(TextView)findViewById(R.id.txtMessage);
        txt.setText("Department of Natural Sciences focuses on the interdisciplinary applications of Mathematical Sciences, Physics, Chemistry and Biology in various disciplines. Foundations of these subjects are taught to undergraduates of up to fifth semester from Computer Engineering, Mechanical Engineering, Biotechnology, Pharmacy, Electrical and Electronics Engineering, Environmental Science, Environmental Engineering, Human Biology. Some courses are also offered at graduate levels in Electrical, Mechanical, Computer Engineering.  This department also offers M.Phil and Ph.D program in Mathematics, Physics and Chemistry. Our major objective is in capacity building of undergraduates and graduates on interdisciplinary applications of theoretical knowledge. This can be useful in identification, alleviation and resolution of day to day problems from energy to environment.\n" +
                "\n" +
                "In the present globalised world where information and knowledge transfer can take place in a matter of seconds, special focus should be placed on immediate interdisciplinary applications.  This approach enables application and linkage of theoretical research knowledge present in different disciplines in the resolution of real life problems. Research Areas of this department as a whole are principal components analysis, linear mixed effect model, statistical analysis and its application to problems from energy and environment, low temperature plasma physics, fixed point method, mathematical modeling etc.\n" +
                "\n\n" +
                "#Contact Address\n" +
                "\n" +
                " Department of Natural Science\n" +
                " Kathmandu University\n" +
                " PO BOX 6250\n" +
                " Kathmandu,Nepal\n" +
                "\n" +
                " Email: dsubedi@ku.edu.np (HOD)\n" +
                "\n" +
                " Departmental Phone: +97711661399 ext. 176\n" +
                " University Fax: +97711661443");

    }
}
