package com.nimbuscloud.csumbcoursecatalog;

import java.io.Serializable;

/**
 * A class to hold course related data
 */
public class Course implements Serializable
{

   private String courseName;
   private String courseDescription;
   private int courseUnits;

   /**
    * Constructor
    *
    * @param courseName name of course
    * @param courseDescription course description
    * @param courseUnits
    */
   public Course(String courseName,
         String courseDescription,
         int courseUnits)
   {

      this.courseUnits = courseUnits;
      this.courseName = courseName;
      this.courseDescription = courseDescription;
   }

   public String getCourseDescription()
   {
      return courseDescription;
   }

   public void setCourseDescription(String courseDescription)
   {
      this.courseDescription = courseDescription;
   }

   public String getCourseName()
   {
      return courseName;
   }

   public void setCourseName(String courseName)
   {
      this.courseName = courseName;
   }

   public int getCourseUnits()
   {
      return courseUnits;
   }

   public void setCourseUnits(int courseUnits)
   {
      this.courseUnits = courseUnits;
   }

   @Override public String toString()
   {
      return getCourseName();
   }

}
