package com.school;

public class AttendanceRecord {
    private int StudentId;
    private int CourseId;
    private String status;
    AttendanceRecord(int StudentId, int CourseId, String status) {
        this.StudentId = StudentId;
        this.CourseId = CourseId;
        if (!"Present".equalsIgnoreCase(status) && !"Absent".equalsIgnoreCase(status)) {
            this.status="Invalid";
        }
        else{
            this.status = status;
        }
    }
    public int getStudentId() {
        return StudentId;
    }
    public int getCourseId() {
        return CourseId;
    }
    public String getStatus() {
        return status;
    }
    public void displayDetails() {
        System.out.println("Student ID: " + this.StudentId + ", Course ID: " + this.CourseId + ", Status: " + this.status);
    }
}
