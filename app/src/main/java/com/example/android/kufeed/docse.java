package com.example.android.kufeed;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.kufeed.R.id.txtMessage;

public class docse extends AppCompatActivity {
    TextView txtMessage;
    ImageView docse1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docse);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        docse1=(ImageView)findViewById(R.id.docse1);
        txtMessage=(TextView)findViewById(R.id.txtMessage);
        txtMessage.setText("Founded in 1994, Kathmandu University, Dhulikhel, has rapidly achieved a status of one of the top institutions in the nation for higher education and scientific research. \n"+
                "With the need to develop and deploy the digital concepts that are changing the world rapidly with astonishing inventions and innovation,Kathmandu University launched Computer Science and Engineering program.\n"+
        "With some 18+ years of fruitful experience in the field of computing, the department possesses a strong background in providing quality education to the students herein. Continuous interaction,contact hours,technology and project work/industry internship are the compelling factor for KU to be the first choice of students.\n" +
                "\n" +
                "The dissolved set of diverse faculties with quest of leadership education and each fashioned in providing up-to date course materials are the key points in selecting KU’s Computer Engineering as the career step by most of the students.\n" +
                "\n" +
                "[MISSION]\n" +
                "\n" +
                "To become a centre of excellence in computer science and engineering education and research.\n" +
                "To produce self-motivated, qualified, confident and creative graduate of high quality with entrepreneurial attitude.\n" +
                "To closely collaborate with the industries and institutions so that the education and research in the department in line with the current domestic and international needs.\n"+"[WHY COMPUTER ENGINEERING @ KU]\n" +
                "\n" +
                "There has been significant paradigm shift in the business models with the advent of information technology. To complement the momentum gained in terms of establishment of national as well as foreign software houses and service sectors,Kathmandu University has devised the curriculum that exactly fits into the need of industries. Here at KU, students learn the curriculum guided by local industries and at the same time KU has always been committed to make its curriculum at par to the international standards. The 100% absorption rate of graduates down the line of 2 months from graduation is the self-explanatory indicator of success factor.\n" +
                "\n" +
                "[SALIENT FEATURES]\n" +
                "\n" +
                "Involvement of IT expert in the subject committee.\n" +
                "Updated syllabus to meet the industry requirement.\n" +
                "Faculty members with reputed degrees and expertise.\n" +
                "Industry based Faculty members\n" +
                "Intensive guidance by the faculties.\n" +
                "Industry based internship(3 months)\n" +
                "Higher contact hours\n" +
                "Project works based learning methodology\n" +
                "Industry standard mini and mega projects.\n" +
                "1:1 ration of computers and students\n" +
                "100% industry absorption rate\n" +
                "24 * 7 internet connectivity(including hostel)\n" +
                "Visiting faculties from software industries.\n" +
                "Frequently seminar organised by IT-experts.\n" +
                "Internationally acceptable grading system\n" +
                "Video Conferencing and E-learning\n" +
                " \n" +
                "\n" +
                "[CAREER PROSPECTS]\n" +
                "\n" +
                "Software Industries\n" +
                "Research and Development\n" +
                "Academics\n" +
                "Financial Institutions\n" +
                "NGO/INGO\n" +
                "Government recruitment\n" +
                " \n" +
                "\n" +
                "[RESEARCH ACTIVITIES]\n" +
                "\n" +
                "Research activities determine the gravity of academic entity. At DoCSE,faculty members and students devote significant amount of time in research activities, thus keeping themselves abreast with the state of the art technology.\n" +
                "\n" +
                "Current research areas at Department of Computer Science and Engineering includes Natural Language Processing, Software Engineering and Grid Computing.\n" +
                "\n" +
                "[LABORATORIES AND OTHER FACILITIES]\n" +
                "\n" +
                "DoCSE  enjoys the facility of adequate labs for diverse set of tasks that students need to perform. 24 * 7 facility of internet services (with optical fibre backbone) further assures the remarkable increment in the learning curve of students. Machines in lab are equipped with cutting edge technology which is again updated frequently to be in line with the ever changing paradigm of IT.\n" +
                "\n" +
                "The students can work in homely environment with the access to multiple platform with wide variety of tools for their experiments and research work. The lab are continuously upgraded with recent software releases that too help students to work using latest technology.\n" +
                "\n" +
                "[COMMUNITIES/CLUB]\n" +
                "\n" +
                "Kathmandu University Computer Club (KUCC) is an independent club organised by students of Computer Science and Engineering with the vision of “An eye of IT students” on July 10,1997 by the group of enthusiastic students for cooperation among students to create learning environment, help solving problem of students and even help on the activities of DoCSE.\n" +
                "\n");

    }

    Intent intent = getIntent();








}

