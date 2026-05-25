package Lesson6;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private int course;
    private HashMap<String, Integer> grades;

    public Student(String name, String group, int course, HashMap<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public HashMap<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(HashMap<String, Integer> grades) {
        this.grades = grades;
    }

    public double getAvgGrade() {
        double avgGrade = 0;
        for (Map.Entry<String, Integer> grade : grades.entrySet()) {
            avgGrade += grade.getValue();
        }
        avgGrade /= grades.size();
        return avgGrade;
    }

    public void print() {
        System.out.printf("Name: %20s | Group: %3s | Course: %2s | Average grade: %.2f", name, group, course, getAvgGrade());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(group, student.group) && Objects.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, course, grades);
    }
}
