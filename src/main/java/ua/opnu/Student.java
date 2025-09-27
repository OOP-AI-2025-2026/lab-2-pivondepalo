package ua.opnu;

public class Student {
    private String name;
    private int year;
    private String[] courses;
    private int courseCount;

    public Student(String name, int year) {
        this.name = name;
        if (year < 1 || year > 4) {
            this.year = 1;
        } else {
            this.year = year;
        }
        this.courses = new String[100];
        this.courseCount = 0;
    }

    public void addCourse(String courseName) {
        if (courseName != null && courseCount < courses.length) {
            courses[courseCount] = courseName;
            courseCount++;
        }
    }

    public void dropAll() {
        for (int i = 0; i < courseCount; i++) {
            courses[i] = null;
        }
        courseCount = 0;
    }

    public int getCourseCount() {
        return courseCount;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getTuition() {
        return year * 20000;
    }
}
