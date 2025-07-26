package com.school;

public class Course {
    int courseId;    
    String courseName;
    private static int nextCourseIdCounter = 101;

    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }
    public int getCourseId() {
        return courseId ;
    }
    public String getCourseName() {
        return courseName;
    }
    public void displayDetails() {
        System.out.println("Course ID: C" + this.courseId + ", Name: " + this.courseName);
    }
}