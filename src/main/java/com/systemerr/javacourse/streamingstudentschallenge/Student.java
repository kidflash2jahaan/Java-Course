package com.systemerr.javacourse.streamingstudentschallenge;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Student {
    private long studentId;
    private String countryCode;
    private int yearEnrolled;
    private int ageEnrolled;
    private String gender;
    private boolean programmingExperience;
    private Map<String, CourseEngagement> engagementMap;

    public Student(long studentId, String countryCode, int yearEnrolled, int ageEnrolled, String gender, boolean programmingExperience, Map<String, CourseEngagement> engagementMap) {
        this.studentId = studentId;
        this.countryCode = countryCode;
        this.yearEnrolled = yearEnrolled;
        this.ageEnrolled = ageEnrolled;
        this.gender = gender;
        this.programmingExperience = programmingExperience;
        this.engagementMap = engagementMap;
    }

    public void addCourse(Course course) {
        addCourse(course, LocalDate.now());
    }

    public void addCourse(Course course, LocalDate enrollDate) {
        engagementMap.put(course.courseCode(), new CourseEngagement(course, enrollDate, ""));
    }

    public int getAge() {
        return LocalDate.now().getYear() - (yearEnrolled - ageEnrolled);
    }

    public int getMonthsSinceActive(String courseCode) {
        return engagementMap.get(courseCode).getMonthsSinceActive();
    }

    public int getMonthsSinceActive() {
        int[] min = {-1};
        engagementMap.forEach((courseCode, courseEngagement) -> {
            if (courseEngagement.getMonthsSinceActive() < min[0] || min[0] == -1) {
                min[0] = courseEngagement.getMonthsSinceActive();
            }
        });
        return min[0];
    }

    public double getPercentComplete(String courseCode) {
        return engagementMap.get(courseCode).getPercentComplete();
    }

    public int getYearsSinceEnrolled() {
        return LocalDate.now().getYear() - yearEnrolled;
    }

    public void watchLecture(String courseCode, int lectureNumber, int month, int year) {
        engagementMap.get(courseCode).watchLecture(lectureNumber, LocalDate.of(year, month, 1));
    }

    public static Student getRandomStudent(Course... courses) {
        Student student = new Student(new Random().nextLong(000000001, 999999999), "en", new Random().nextInt(2000, LocalDate.now().getYear() + 1), new Random().nextInt(13, 80), new Random().nextBoolean() ? "male" : "female", new Random().nextBoolean(), new HashMap<>());
        for (Course course : courses) {
            student.addCourse(course, LocalDate.of(new Random().nextInt(student.getYearEnrolled(), LocalDate.now().getYear() + 1), 1, 1));
        }
        return student;
    }



    public long getStudentId() {
        return studentId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getYearEnrolled() {
        return yearEnrolled;
    }

    public int getAgeEnrolled() {
        return ageEnrolled;
    }

    public String getGender() {
        return gender;
    }

    public boolean isProgrammingExperience() {
        return programmingExperience;
    }

    public Map<String, CourseEngagement> getEngagementMap() {
        return engagementMap;
    }
}
