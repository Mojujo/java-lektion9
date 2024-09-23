package se.oscar;

public class Student {
    private String name;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }
    public String getCourse() {
        return course.getName();
    }
}
