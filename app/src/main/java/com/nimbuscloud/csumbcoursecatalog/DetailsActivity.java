package com.nimbuscloud.csumbcoursecatalog;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * An activity to display details about a course
 */
public class DetailsActivity extends AppCompatActivity
{

   @Override protected void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_details);
      getSupportActionBar().hide();
      //gets position of item clicked to use to access item in arraylist in
      // this activity
      int position = getIntent().getIntExtra("position", 0);

      //gets arraylist from main activity
      ArrayList<Course> courseList =
            (ArrayList<Course>) getIntent().
                  getSerializableExtra("courseList");

      Course item = courseList.get(position);
      String courseName = item.getCourseName();
      String courseDescription = item.getCourseDescription();
      String courseUnits = "Course Units: " + item.getCourseUnits();

      //Sets title with course name
      TextView title = findViewById(R.id.txtCourseTitle);
      title.setText(courseName);
      //sets number of course units
      TextView units = findViewById(R.id.txtCourseUnits);
      units.setText(courseUnits);
      //sets course description

      TextView description = findViewById(R.id.txtDescription);
      description.setText(courseDescription);
      description.setMovementMethod(new ScrollingMovementMethod());

   }
}