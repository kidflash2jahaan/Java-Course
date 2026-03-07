package com.systemerr.javacourse.streamingstudentschallenge;

import java.time.LocalDate;

public class CourseEngagement {
    private Course course;
    private LocalDate enrollmentDate;
    private String engagementType;
    private int lastLecture;
    private LocalDate lastActivityDate;

    public CourseEngagement(Course course, LocalDate enrollmentDate, String engagementType, int lastLecture, LocalDate lastActivityDate) {
        this.course = course;
        this.enrollmentDate = enrollmentDate;
        this.engagementType = engagementType;
        this.lastLecture = lastLecture;
        this.lastActivityDate = lastActivityDate;
    }

    public CourseEngagement(Course course, LocalDate enrollmentDate, String engagementType) {
        this(course, enrollmentDate, engagementType, 0, enrollmentDate);
    }

    public String getCourseCode() {
        return course.courseCode();
    }
    
    public int getEnrollmentYear() {
        return enrollmentDate.getYear();
    }

    public int getLastActivityYear() {
        return lastActivityDate.getYear();
    }

    public String getLastActivityMonth() {
        return lastActivityDate.getMonth().toString();
    }

    public int getMonthsSinceActive() {
        return (LocalDate.now().getYear() * 12 + LocalDate.now().getMonthValue()) - (lastActivityDate.getYear() * 12 + lastActivityDate.getMonthValue());
    }

    public double getPercentComplete() {
        return 100.0 * (double) lastLecture / (double) course.lectureCount();
    }

    public void watchLecture(int lecture, LocalDate date) {
        lastLecture = lecture;
        lastActivityDate = date;
    }



    public Course getCourse() {
        return course;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public String getEngagementType() {
        return engagementType;
    }

    public int getLastLecture() {
        return lastLecture;
    }

    public LocalDate getLastActivityDate() {
        return lastActivityDate;
    }
}
