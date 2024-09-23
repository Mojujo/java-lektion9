package se.oscar;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Matte");
        Student student = new Student("Oscar", course);
        System.out.println(student.getCourse());
    }
}