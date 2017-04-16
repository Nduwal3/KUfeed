package com.example.android.kufeed;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class me extends AppCompatActivity {
    ImageView I1;
    TextView txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        I1=(ImageView)findViewById(R.id.me1);
        txtMessage=(TextView)findViewById(R.id.txtMessage);
        txtMessage.setText("Bachelor of Engineering in Mechanical Engineering is one of the oldest programs at the Kathmandu University and the first of its kind in the Republic of Nepal offered by the Department of Mechanical Engineering located at Kathmandu University, Dhulikhel. Situated in the serene, verdant, captivating milieu of Dhulikhel, Mechanical Department boasts the team of highly trained teachers and expatriate faculty. It strives to offer the most and exposes the students to the cutting edge technology in Mechanical Engineering discipline.\n" +
                "\n" +
                "Updating its laboratory with the mainstream of the technical advancement is one of the strong factors, turbine testing laboratory, sophisticated CAD and CAM Lab, Solid Works, ANSYS simulation, Rapid prototyping, Mechanical laboratories, highly equipped automobile and mechanical workshop which are on the run are the stronger side of the department.\n" +
                "\n" +
                "Mechanical Engineering is essential to a wide range of activities that includes research, design, development, manufacturing, management, and control of engineering systems, subsystems, and their components. Department of Mechanical Engineering is handling various fields of research viz. Turbine technology, Biomass gasification, improved cooking stove, Biogas generation etc. which will be beneficial for the nation in long run.\n+Contact Us:\n" +
                "\n" +
                "DEPARTMENT OF MECHANICAL ENGINEERING\n" +
                "School of Engineering\n" +
                "Kathmandu University\n" +
                "Dhulikhel, P.O.Box: 6250\n" +
                "Kathmandu, Nepal\n" +
                "Tel: (011) 661399, Fax: +977-11-661443\n" +
                "E-mail: mech@ku.edu.np");
    }
    Intent intent = getIntent();
}
