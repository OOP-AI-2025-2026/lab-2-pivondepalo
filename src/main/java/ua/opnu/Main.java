package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Петро", 3);

        student.addCourse("Програмування");
        student.addCourse("Бази даних");
        student.addCourse("Математика");

        System.out.println(student.getName() + ": кількість вивчаємих дисциплін - " + student.getCourseCount());
        System.out.println(student.getName() + ": рік навчання - " + student.getYear());
        System.out.println(student.getName() + ": заплатив за навчання - " + student.getTuition());
    }
}
