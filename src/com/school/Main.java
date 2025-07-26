package com.school;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- School Attendance System ---");

        Student[] students = new Student[2];
        students[0] = new Student("Alice Smith");
        students[1] = new Student("Bob Johnson");

        Course[] courses = new Course[2];
        courses[0] = new Course("Intro to Programming");
        courses[1] = new Course("Linear Algebra");

        System.out.println("\nRegistered Students:");
        for (Student student : students) {
            if (student != null) student.displayDetails();
        }

        System.out.println("\nAvailable Courses:");
        for (Course course : courses) {
            if (course != null) course.displayDetails();
        }
        System.out.println("\nSession 2: Core Domain Modelling Complete.");
        ArrayList<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(students[0].getStudentId(), courses[0].getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(students[1].getStudentId(), courses[1].getCourseId(), "absents"));
        for (AttendanceRecord record : attendanceLog) {
            if (record != null) record.displayDetails();
        }
    }
}