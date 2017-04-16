package com.example.android.kufeed;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class cocse extends AppCompatActivity {
    ImageView I1;
    TextView txtMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocse);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        I1=(ImageView)findViewById(R.id.cocse1);
        txtMessage=(TextView)findViewById(R.id.txtMessage);
        txtMessage.setText("Chemical engineers play an important role in today's world. They are responsible for a broad range of activities that have direct impact on the daily operation of industries, and the overall design of processes, equipment and plants. Chemical engineers are dedicated to process engineering and product engineering. They operate and optimize the processes in all the manufacturing industries, and they also conceive and design new products that meet the high standards for sustainable and green solutions.\n" +
                "\n" +
                "Although existing pharmaceutical, cements, steels, paper, food and beverage industries have high demand of chemical engineers, most of these industries recruit them from the foreign markets. Further, the country is currently running big and small industries and many mechanical, civil and electrical engineers are involved in such diverse fields. Until now, no single academic institute in Nepal has chemical engineering curriculum.\n" +
                "\n" +
                "To uplift the economy and production capacity of Nepal, the government of Nepal is positively seeking to increase the number of industrial regions throughout the country. With such policies reinforcing the scope of production, Nepal will soon move towards more effective and intensive industrialization, and foremost, this requires the highly skilled chemical engineers. Hence, the proposed chemical engineering program is the first of its kind in Nepal and it aims to produce highly skilled graduates to fulfill the country's demand.\n\n\nContact\n" +
                "School of Engineering\n" +
                "Kathmandu University\n" +
                "P.O.Box - 6250\n" +
                "Dhulikhel, Kavre, Nepal.\n" +
                "Contact No: +977-11-661399 Ext no: 0612/1215\n" +
                "  Email: kuchemicalengg@gmail.com");
    }
    Intent intent = getIntent();
}
