package com.example.android.kufeed;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ee extends AppCompatActivity {
    ImageView I1;
    TextView txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ee);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        I1=(ImageView)findViewById(R.id.ee1);
        txtMessage=(TextView)findViewById(R.id.txtMessage);
        txtMessage.setText("The Department of Electrical & Electronic Engineering, established in 1994, is one of the oldest engineering departments of Kathmandu University. It has the accumulated experiences and physical resources of more than 15 years for providing quality engineering education and performing applied engineering research. It has a strong group of faculties with diverse experiences. It is continuously evolving and continuously seeking its faculty and infrastructure development. It takes the followings as its prime objectives:\n" +
                "\n" +
                "To produce highly qualified, objective, confident, and creative graduates with entrepreneurial attitude, and attain excellence in engineering education and applied research\n" +
                "To become a center of excellence in electrical & electronics engineering research\n" +
                "To collaborate with the local industries and organizations in making the engineering education more relevant to the domestic context and in obtaining in-country applied research solutions to the domestic technical problems\n" +
                "The Department of Electrical & Electronic Engineering of Kathmandu University is situated at Dhulikhel Campus of the university. It currently has core engineering undergraduate program with about 200 students. It offers undergraduate degree, BE in Electrical & Electronic Engineering, with specialization in either Communication Engineering or Power-and-Control Engineering. It has an international NORAD (Norwegian Agency for Development Cooperation) Fellowship program of ME in Electrical Power Engineering, which is run in collaboration with Norwegian University of Science and Technology (NTNU), Norway.\n" +
                " \n"+"Contact\n" +
                "The Department of Electrical & Electronic Engineering, Kathmandu University is situated at Dhulikhel Campus of the university. The campus is situated in the mid-way between Banepa and Dhulikhel cities. The campus can be reached in an hour from Kathmandu by car. Local bus from Kathmandu in the following route,  Ratna Park -New Baneshwor-Koteshwor-Thimi-Bhaktapur-Banepa-Dhulikhel, can be taken to reach the vicinity of the campus. One must get off at a stop called Atthaiskilo (University Chowk) after Banepa and walk for 800 meters to reach the campus. The department is situated at the School of Engineering building (Block 11) of the campus.\n" +
                "\n" +
                "Postal Address: PO Box 6250, Kathmandu, Nepal\n" +
                "\n" +
                "Telephone: +977-11-661399 (Ext 0823)\n" +
                "\n" +
                "Fax: +977-11-661443\n" +
                "\n" +
                "E-mail: Link\n" +
                "Web:  http://www.ku.edu.np/ee");

    }
    Intent intent = getIntent();
}
