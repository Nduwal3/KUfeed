package com.example.android.kufeed;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class cg extends AppCompatActivity {
    ImageView I1;
    TextView txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cg);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        I1=(ImageView)findViewById(R.id.cg1);
        txtMessage=(TextView)findViewById(R.id.txtMessage);
        txtMessage.setText("Bachelors of Engineering in Civil Engineering (specialization in Hydropower Engineering):\n" +
                "\n" +
                "Infrastructure development should be financially viable, socially acceptable and ecologically sustainable. Civil engineering encompasses branches of engineering science to develop and maintain sustainable infrastructures. It covers a wide-range of specialized fields that address all the above mentioned issues. Hydropower Engineering is the specialized field of civil engineering that requires multi-disciplinary knowledge of science and technology. Nepal’s present goal is to build hydropower projects for economic and social development. The vision is to install 25 GW in twenty years. This objective must be addressed from all levels.\n" +
                "\n" +
                "To increase the in-house capacity implementation of technically sound plans, designs, operations and maintenance of hydropower plants is essential. Kathmandu University aspires to proactively produce proficient engineers to meet national development challenges. The program that started on August 2009 will produce the first batch of civil engineers by 2013. Students enrolled in this program will benefit from the exceptional quality of education and will also enjoy the wonderful nature and pollution free learning environment at Dhulikhel.\n" +
                "\n" +
                "Career Oppertunities:\n" +
                "\n" +
                "Hydropower Industries\n" +
                "Governmental Organizations\n" +
                "NGO/INGOs\n" +
                "Academia\n" +
                "Consulting Firms\n" +
                "Contractors\n" +
                "Development Banking Sectors\n" +
                "Research Centers"+"\n"+"\n\n"+"\n Bachelors of Engineering in Geomatics Engineering\n" +
                "\n" +
                "Geomatics is a systemic, multidisciplinary, integrated approach to selecting the Instruments and the appropriate techniques for collecting, storing, integrating, modelling, analysing, retrieving at will, transforming, displaying and distributing spatially geo referenced data from different sources with well-defined accuracy characteristics, continuity and in a digital format . Based on the scientific framework of geodesy, it uses terrestrial, marine, airborne, and satellite-based sensors to acquire spatial and other data.\n" +
                "\n" +
                "Prior to mid 90′s, this program was known as “Surveying Technology”. “Geomatics” is a term that is currently used by educational institutions, governments and private industry. “Geomatics Engineering is the field of activity that integrates the acquisition, processing, analysis, display and management of spatial information. It is an exciting and new grouping of subj ects in the spatial and environmental information sciences with a broad range of employment opportunities as well as offering challenging pure and applied research problems in a vast range of interdisciplinary fields” [ Geomatics Engineering , From Wikipedia, the free encyclopedia]. It goes beyond commonly known or traditional areas of surveying and mapping, and includes a much wider range of activities and the use of rapidly changing technologies that relate to collecting and managing information.\n" +
                "\n" +
                "The economic growth of any country involves the development of natural resources, construction of large public works projects and the expansion of urban centers. This growth requires trained personnel to locate and map physical features on the land, determine property boundaries for titles to property, perform surveys to locate and build transportation systems and layout large industrial complexes such as refineries, dam sites, power, pipelines and surface and underground mining operations.\n" +
                "\n" +
                "The Geomatics Engineering program emphasizes the use of new technology for data collection, including electronic equipment for measuring, earth circling satellites for positioning, and computers for processing data and generating plans that are used in a wide variety of professional disciplines\n" +
                "\n" +
                "Career Oppertunities\n" +
                "\n" +
                "Government Ministries and Departments\n" +
                "Nepal Army/ Nepal Police\n" +
                "Nepal Electricity Authority\n" +
                "Private sector infrastructure development activities\n" +
                "NGO/INGO\n" +
                "International job market (Universities, private and public companies)\n" +
                "Academia and research institutes");
    }
    Intent intent = getIntent();
}
