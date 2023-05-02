package com.nimbuscloud.csumbcoursecatalog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
   ListView listView;
   ArrayList<Course> courseList;

   @Override protected void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      getSupportActionBar().hide();

      //finds listview by id
      listView = findViewById(R.id.listView);
      init();

      //Displays everything on listview
      ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,
            android.R.layout.simple_list_item_1, courseList);
      listView.setAdapter(adapter);

      listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
         public void onItemClick(AdapterView<?> adapterView,
               View view,
               int i,
               long l)
         {

            Intent showDetails = new Intent(getApplicationContext(),
                  DetailsActivity.class);
            showDetails.putExtra("courseList", courseList);
            showDetails.putExtra("position", i);
            startActivity(showDetails);

         }
      });

   }

   //button to go to show video activity
   public void playVideo(View view)
   {
      Intent playVideo = new Intent(getApplicationContext(),
            ShowVideoActivity.class);
      startActivity(playVideo);
   }

   //initializes courseList arraylist
   private void init()
   {
      Course cst300 = new Course("CST 300: Major ProSeminar",
            "Helps students identify and articulate personal, professional, " +
            "and social goals. Provides an integrated overview of the " +
            "computer science and communication design majors and their " +
            "requirements. Students develop a plan for their learning goals. " +
            "Students learn writing, presentation, research and " +
            "critical-thinking skills within the diversified fields of " +
            "information technology and communication design. Students learn " +
            "how to analyze, predict, and articulate trends in the academic, " +
            "public service.", 4);

      Course cst338 = new Course("CST 338: Software Design",
            "Provides students with the fundamental concepts to develop " +
            "large-scale software, focusing on the object-oriented " +
            "programming techniques. Coverage includes the introduction to " +
            "Java programming language, object-oriented programming, software" +
            " life cycle and development processes, requirements analysis, " +
            "and graphical user interface development.", 4);

      Course cst363 = new Course("CST 363: Introduction to Database Systems",
            "This course provides balanced coverage of database use and " +
            "design,focusing on relational databases. Students will learn to " +
            "design relational schemas, write SQL queries, access a DB " +
            "programmatically,and perform database administration. Students " +
            "will gain a working knowledge of the algorithms and data " +
            "structures used in query evaluation and transaction processing. " +
            "Students will also learn to apply newer database technologies " +
            "such as XML, NoSQL, and Hadoop.", 4);

      Course cst334 = new Course("CST 334: Operating Systems",
            "Students in this course will learn about the use and design of " +
            "modern operating systems, focusing on Linux. On the “use” side, " +
            "students will learn the Linux command line, to write shell " +
            "scripts, and to build programs with GNU utilities like awk, sed," +
            " and make. On the “design” side, students will develop a deep " +
            "understanding of process management, memory management, file " +
            "systems, and concurrency, and how they apply to modern " +
            "technologies like virtualization and cloud computing.", 4);

      Course cst311 = new Course("CST 311: Introduction to Computer Networking",
            "Survey of Telecomm and Data Comm Technology Fundamentals, Local " +
            "Area Network, Wide Area Network, Internet and internetworking " +
            "protocols including TCP/IP, network security and performance, " +
            "emerging industry trends such as voice over the network and high" +
            " speed networking. Designed as a foundation for students who " +
            "wish to pursue more advanced network studies including " +
            "certificate programs. Includes hands-on networking labs that " +
            "incorporate Cisco CCNA lab components.", 4);

      Course cst336 = new Course("CST 336: Internet Programming",
            "Provides students with dynamic web application development " +
            "skills, focusing on the integration of server-side programming, " +
            "database connectivity, and client-side scripting. Coverage " +
            "includes the Internet architecture, responsive design, RESTful " +
            "web services, and Web APIs. ", 4);

      Course cst462S = new Course(
            "CST 462S: Race, Gender, Class in the Digital World",
            "Provides students with key knowledge of race, gender, class and " +
            "social justice especially in relation to technology in today’s " +
            "digital world. Students challenge the barriers of expertise, " +
            "gender, race, class, and location that restrict wider access to " +
            "and understanding of the production and usage of new " +
            "technologies. Students will engage in a practical experience in " +
            "the community via their service placements, which will provide " +
            "depth and context for considering questions of justice, " +
            "equality, social responsibilities and the complexities of " +
            "technology and its societal impact. The course uses scenario " +
            "based approach combining presentations, discussions, and " +
            "reflections to allow students explore the relationship between " +
            "critical reflection and action on the topics mentioned above. ",
            3);

      Course cst328 = new Course("CST 328: Digital Art and Design",
            "A survey course that combines the study of technology, design " +
            "and aesthetic principles as they apply to twenty-first century " +
            "visual media. Students learn how fundamental concepts of art and" +
            " design apply to a broad range of commercial, expressive and " +
            "entertainment forms. Students also study the democratization of " +
            "the creative process through digital media, using current " +
            "technology to produce sophisticated and expressive examples of " +
            "personal digital creativity.", 3);

      Course cst370 = new Course("CST 370: Design and Analysis of Algorithms",
            "Students learn important data structures in computer science and" +
            " acquire fundamental algorithm design techniques to get the " +
            "efficient solutions to several computing problems from various " +
            "disciplines. Topics include the analysis of algorithm " +
            "efficiency, hash, heap, graph, tree, sorting and searching, " +
            "brute force, divide-and-conquer, decrease-and-conquer, " +
            "transform-and-conquer, dynamic programming, and greedy " +
            "programming.", 4);

      Course cst383 = new Course("CST 383: Introduction to Data Science",
            "In data science, data analysis and machine learning techniques " +
            "are applied to visualize data, understand trends, and make " +
            "predictions. In this course students will learn how to obtain " +
            "data, preprocess it, apply machine learning methods, and " +
            "visualize the results. A student who completes the course will " +
            "have enough theoretical knowledge, and enough skill with modern " +
            "statistical programming languages and their libraries,to define " +
            "and perform complete data science projects.", 4);

      Course cst438 = new Course("CST 438: Software Engineering",
            "Prepares students for large-scale software development using " +
            "software engineering principles and techniques. Coverage " +
            "includes software process, requirements analysis and " +
            "specification, software design, implementation, testing, and " +
            "project management. Students are expected to work in teams to " +
            "carry out a realistic software project.", 4);

      Course cst329 = new Course(" CST 329: Reasoning with Logic",
            "In this course students learn to develop skill in using logic to" +
            " describe and assess arguments. Students will learn to write " +
            "formulas in propositional and first-order logic, and more " +
            "importantly, to write and check proofs. Students will also learn" +
            " to write formulas in three-valued and modal logic, know how to " +
            "choose an appropriate logic, and understand the limitations of " +
            "logic in capturing human reasoning.\n", 3);

      Course cst489 = new Course("CST 489: Capstone Project Planning",
            "Students create a detailed proposal of a substantial, " +
            "professional level project with an approval of the student’s " +
            "capstone advisor. Students learn and practice project planning, " +
            "collaboration and writing skills required in the industry.", 1);

      Course cst499 = new Course("CST 499: Directed Group Capstone",
            "Students will work on a project in large groups (up to 5 " +
            "students in each group), developing requirements specification, " +
            "a solution plan followed by design and implementation of the " +
            "solution. The problem statement for the projects will be " +
            "selected by the faculty. Faculty will also play the role of a " +
            "project manager directing the schedule and deliverables for " +
            "these projects.", 4);

      //intializes arraylist and adds courses
      this.courseList = new ArrayList<>();
      courseList.add(cst300);
      courseList.add(cst338);
      courseList.add(cst363);
      courseList.add(cst334);
      courseList.add(cst311);
      courseList.add(cst336);
      courseList.add(cst462S);
      courseList.add(cst328);
      courseList.add(cst370);
      courseList.add(cst383);
      courseList.add(cst438);
      courseList.add(cst329);
      courseList.add(cst489);
      courseList.add(cst499);
   }
}