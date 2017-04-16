package com.example.android.kufeed;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.kufeed.R.id.txtMessage;

public class about extends AppCompatActivity {
    TextView kuTxtView;
    ImageView ku_imageView;
    Button introBtn;
    Button objectBtn;
    Button strategyBtn;
    Button constitutionBtn;
    Button adminBtn;
    TextView txtMessage1;
    TextView txtMessage2;
    TextView txtMessage3;
    TextView txtMessage4;
    TextView txtMessage5;
    public int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        kuTxtView=(TextView)findViewById(R.id.kuTxtView);
        ku_imageView=(ImageView)findViewById(R.id.ku_imageView);
        introBtn=(Button)findViewById(R.id.introBtn);
        objectBtn=(Button)findViewById(R.id.objectBtn);
        strategyBtn=(Button)findViewById(R.id.strategyBtn);
        constitutionBtn=(Button)findViewById(R.id.constutionBtn);
        adminBtn=(Button)findViewById(R.id.adminBtn);
        counter = 1;


    }

    public void introBtn(View view){
        txtMessage1 = (TextView) findViewById(R.id.txtMessage1);

        if(counter!=0)
        {
            counter=0;

            txtMessage1 = (TextView) findViewById(R.id.txtMessage1);
            txtMessage1.setText("Kathmandu University is an autonomous, not-for-profit, non - government institution dedicated to maintain high standards of academic excellence. It is committed to develop leaders in professional areas through quality education.\n" +
                    "\n" +
                    "It is located in a mountainous landscape in Dhulikhel Municipality about 30 kilometers east of Kathmandu (KTM) having round-the-year pleasant climate and panoramic Himalayan Views.\n" +
                    "KU had a very modest start from a rented building at Tangal, Kathmandu. Now, it has been able to create a built up space of 46,846 square meters.\n" +
                    "\n" +
                    "Within a period of 21 years, KU has built not only reasonable infrastructure, but also established a track record of academic excellence. At present, the University offers various undergraduate, graduate and postgraduate programs in science, engineering, medicine, management, education, arts, pharmacy, environment, music, human & natural resources, information technology and biotechnology, through School of Science, School of Management, School of Engineering, School of Medical Sciences, School of Education and School of Arts. In addition to 3695 students studying in its constituent campuses 7500 students are in its affiliated colleges.\n" +
                    "\n" +
                    "The academic programs of the University are based on credit-semester system with continuous internal evaluations. The University has adopted 1 to 10 teacher–student ratio. However, KU is very cautious in recruitment of every single faculty or non-teaching staff. The staff strength at KU is 458 for teaching and 725 for nonteaching (Including Paramedical staff). The academic calendar of minimum 230 days is strictly adhered to; admission of students is based on merit, based on their score in the previous examination and written and oral entrance tests.\n" +
                    "\n" +
                    "Every School has its own Teacher Welfare Society, Student Welfare Council and Staff Welfare Society. The Executive Board is composed of members elected by teachers and students for the welfare of their community. Quality control is strictly followed in all programs of the university. In addition, to continually enhance the educational standard, KU has been successfully collaborating with more than fifty universities and institutions of international repute for faculty and students exchange programs, credit transfer and joint research work and exchange information. This has helped KU to establish itself well in the world community.");
        }
        else{
            counter=1;
            txtMessage1.setText("");

        }

    }
    public void objectBtn(View view){


        txtMessage2=(TextView)findViewById(R.id.txtMessage2);
        if (counter!=0) {
            counter = 0;
            txtMessage2=(TextView)findViewById(R.id.txtMessage2);

            txtMessage2.setText("Higher education should become a high quality education resulting in the development of overall personality of the student. As education shapes human life and the type of society in which we live, it becomes an investment to improve the quality of life for everyone in the nation. Therefore, KU is being developed with objectives to:\n" +
                    "\n" +
                    "Promote all-round development of the students’ abilities and personalities;\n" +
                    "Develop awareness about the role of science and its application in understanding problems of the contemporary society;\n" +
                    "Extend and disseminate knowledge and foster its application;\n" +
                    "Create knowledge industry through accessing the sources of knowledge at the global level, processing them and providing access to such knowledge to the people.\n" +
                    "Establish a community of scholars, students, and staff in which understanding and\n" +
                    "wisdom can grow and flourish.\n" +
                    "The main thrust of KU is to make it a research-cum-teaching university in science, management, engineering, medical sciences, arts, and education.");
        }
        else{
            counter=1;
            txtMessage2.setText("");
        }
    }
    public void strategyBtn(View view){
        txtMessage3=(TextView)findViewById(R.id.txtMessage3);
        if(counter!=0) {
            counter =0;
            txtMessage3=(TextView)findViewById(R.id.txtMessage3);
            txtMessage3.setText("The long-term strategy for its development are:\n" +
                    "\n" +
                    "Achieving excellence in teaching;\n" +
                    "Providing strong support to professional courses;\n" +
                    "Strengthening research activities in the fields of environment, energy, medicinal plants and information technology");
        }
        else{
            counter=1;
            txtMessage3.setText("");
        }
    }
    public void constitutionBtn(View view){
        txtMessage4=(TextView)findViewById(R.id.txtMessage4);
        if(counter!=0){
            counter=0;
            txtMessage4=(TextView)findViewById(R.id.txtMessage4);

        txtMessage4.setText("Kathmandu University is an independent, not for profit, non-government public institution which was created through private initiative. It is being developed as an institution of higher learning dedicated to maintain high standards of academic excellence. \n" +
                "\n" +
                "The final authority for approving the educational and academic programs rests with the Academic Council. \n" +
                "\n" +
                "In the context of establishing Kathmandu University, adequate legal provision has been made to authorize the university to formulate its own rules and regulations, in relation to organizational, administrative, personal and academic matters. \n" +
                "\n" +
                "Provisions has also been made for the university to grant affiliation to other educational institutions.\n");
        }
        else{
            counter=1;
            txtMessage4.setText("");
        }
    }
    public void adminBtn(View view){
        txtMessage5=(TextView)findViewById(R.id.txtMessage5);
        if(counter!=0) {
            counter = 0;
            txtMessage5=(TextView)findViewById(R.id.txtMessage5);
            txtMessage5.setText("The university enjoyed utmost autonomy in operation and management. The Senate, Executive Council, Academic Council and the Deans are responsible for development of policies and programs of the university.\n" +
                    "\n" +
                    "Kathmandu University Senate has thirty-five members who are ex-officio university authorities, educationists, industrialists, donors, trustees, and representatives of the affiliated institutions. Hon’ble Prime-Minister, the Chancellor of the university, is the chair. Hon’ble Education & Sports Minister is the Pro-Chancellor. The Vice Chancellor, Registrar, and the Deans, one principal of affiliated college, two teacher representatives and a student representative sit in the senate. Member, National Planning Commission, Parliamentarians, Secretary of Ministry of Education & Sports, Secretary of Ministry of Finance, Mayors of Dhulikhel and Banepa Municipalities are also ex-officio members.\n" +
                    "\n" +
                    "The Senate is the supreme governing body of the university which, inter-alia, decides about academic programs, degrees, affiliations; examines and approves annual programs, budget proposals, audited report, fixes number of teachers, administrative staff, and employees and terms and condition of their services; constitutes recommendation committee for the appointment of Vice Chancellor and other committees as required.\n" +
                    "\n" +
                    "The University’s Board of Trustees is composed of renowned personalities and is entrusted with responsibilities of approving long term plans, generating, and controlling of resource. It gives direction whenever needed and also represents in the search committee for the selection of Vice Chancellor.\n" +
                    "\n" +
                    "The Executive Council (EC) consists of the Vice Chancellor (VC), Registrar, two Deans and one teacher representative nominated by the Senate. VC Chairs the EC meeting which executes the decisions and directives of the Senate, follows the policy and guidelines of Government of Nepal, prepares and presents annual programs, budget, progress and audited reports to the Senate, accepts grants and donations, manages funds, assets-movable and immovable and disposes of property, provides oversight to programs run and reports on them, prepares draft rules and submits them for approval, appoints personnel as required, fixes terms and conditions of their services and presents them to the Senate.\n" +
                    "\n" +
                    "The Academic Council is the main educational and academic authority of the university. It consists of fifteen members – Vice Chancellor, Registrar, six Deans, five chairpersons of the subject committee, and two representatives of affiliated colleges. The Vice Chancellor is the chair of the council. It sets up the standard of learning and teaching, curricula, quality of teaching materials, types of examinations, methods of evaluations, size of the classes and admission requirements. It also sets up policies for standard of education and research, arranges for awarding honorary degrees and prescribes minimum qualifications of teachers of various levels.\n" +
                    "\n" +
                    "Schools are the centers of educational activities and Deans are their chief. Each school has one faculty board and a research committee headed by the respective Dean and several subject committees which are chaired by the Head of Department (HoD) of the concerned subject.\n" +
                    "\n");
        }
        else{
            counter=1;
            txtMessage5.setText("");
        }

    }
}
