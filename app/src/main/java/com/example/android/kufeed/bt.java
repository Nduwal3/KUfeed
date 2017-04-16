package com.example.android.kufeed;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class bt extends AppCompatActivity {
    TextView txt;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        img=(ImageView)findViewById(R.id.bt1);
        txt=(TextView)findViewById(R.id.txtMessage);
        txt.setText("# Overview\n" +
                "The Department of Biotechnology, first of its kind in Nepal, was established at Kathmandu University in 2003 in view of responding to a sharp shortage of graduate biotechnologists in the national bio-industries and allied areas with a mission to cater to and supply a steady stream of highly competent biotechnology graduates required for the country and contribute to generating new knowledge in the field of biotechnology.\n" +
                "\n" +
                "Inspired by the mission of the university, the program activities of the Department of Biotechnology are designed to achieve the following objectives:\n" +
                "\n" +
                "Provide educational opportunities to students for preparing them to pursue higher studies for the development of their career in bio-industries.\n" +
                "\n" +
                "Enhance professional practices for bio-industries through industrial visits as well as interactions.\n" +
                "\n" +
                "Assist biotechnological industries and related organizations to address their problems by providing consultancy services, HRD interventions and so on.\n" +
                "\n" +
                "Enhance innovative activities in biotechnology and promote scientific publications and intellectual property.\n" +
                "\n" +
                "Strengthen need based programs in higher education as well as continuing education for the benefit of bio-industries of Nepal.\n" +
                "Graduates from the Department of Biotechnology will be equipped with both theoretical knowledge and practical experience to pursue higher studies and entre into job markets in Nepal and overseas.\n" +
                "\n" +
                "It is our mission to prepare students to face the challenges ahead in view of the emerging needs for new knowledge and skills generated from innovation and experience. The department will strive to make sure that students that graduate from KU with a biotechnology degree are recognized at the national and international levels and that their knowledge will enhance biotechnology worldwide.\n" +
                "\n" +
                "# What is Biotechnology?\n" +
                "Biotechnology is a frontier area offering a new technological base to understand living beings at the molecular level, unravel the genetic codes that govern biological processes and thereby be able to manipulate those for the betterment of humankind. Biotechnology is not just one subject; rather it is an amalgam of a number of different scientific fields. Biotechnology uses knowledge of microbiology, molecular biology, immunology, biochemistry just to name a few. In recent times, new concepts such as bioinformatics, proteomics, microarrays are becoming standard terminologies within this vast area of research. Novel research findings by scientists in this field of science are helping people worldwide in their quest for a healthier lifestyle.\n" +
                "\n" +
                "A career in biotechnology is not just a job; it is an invitation to participate in the development of new products and processes that also contribute to improving people's standards of living.\n" +
                "\n" +
                "Where are the career development opportunities?\n" +
                "Major avenues of career development opportunities are as follows:\n" +
                "\n" +
                "Research and development in the processing of diverse biological materials and in the field of managing bio-industries.\n" +
                "\n" +
                "Employment opportunities are available in the industries such as chemicals, pharmaceuticals, food and beverages and plant and animal biotechnology and other options in forensics, disease and diagnostic therapy, education and environmental protection bodies.\n" +
                "\n" +
                "Opening ways for pursuing further studies at Masters or Doctoral levels.\n");

    }

}
