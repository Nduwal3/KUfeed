package com.example.android.kufeed;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class es extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_es);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        txt=(TextView)findViewById(R.id.txtMessage);
        txt.setText("#Introduction\n" +
                "The Department of Environmental Science and Engineering (DESE), earlier known as Department of Biological Sciences and Environmental Science, have been the leader in offering Environmental Science program in Nepal , starting its undergraduate program since 1994. Through all these years, it has been significantly accumulating experience and resources to deliver quality education and perform quality research. Faculties with diverse academic backgrounds, quest for leadership in providing best environmental studies and continuously evolving teaching-learning and research processes are its major characteristics.\n" +
                "\n" +
                "#Aim of the Department:\n" +
                "\n" +
                "*To produce self-motivated, objective, confident, and creative graduates of highest quality with an entrepreneurial attitude\n" +
                "*To develop as a center of excellence in Environmental education and researches.\n" +
                "\nThe academic program of the department contribute to fulfill the need of highly competitive, skilled and trained manpower in the areas of research, development, impact assessments, standards monitoring, management, conservation, legal measures, policy formulation, implementation and other relevant environmental fields. The graduate will also be competent enough to pursue higher studies in any reputed institutions. The department also pursues research relevant to local national, regional and global significance. Focus is also given to collaborative researches with national and international organizations and academic institutions.\n\n#Contact Address\n" +
                "\n" +
                " (Name of the faculty member)\n" +
                " Department of Environmental Science and Engineering\n" +
                " Kathmandu University\n" +
                " PO BOX 6250\n" +
                " Kathmandu, Nepal\n" +
                "\n" +
                " Phone: +97711661399 ext. 1217\n" +
                " University Fax: +97711661443\n" +
                "\n" +
                " Head of the Department\n" +
                " Dr. Bibhuti Ranjan Jha\n" +
                " Phone: +97711661399 ext. 2233\n" +
                " Email: desehodku.edu.np");
    }
}
