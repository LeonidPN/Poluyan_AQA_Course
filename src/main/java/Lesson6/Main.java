package Lesson6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Ivan Ivanov", "A", 1,
                new HashMap<String, Integer>(Map.of("History", 3, "Art", 4, "Math", 5))));
        students.add(new Student("Sidor Ivanov", "A1", 1,
                new HashMap<String, Integer>(Map.of("History", 3, "Art", 3, "Math", 5))));
        students.add(new Student("Ivan Sidorov", "B", 1,
                new HashMap<String, Integer>(Map.of("History", 3, "Art", 3, "Math", 2))));
        students.add(new Student("Svetlana Alexandrova", "C2", 2,
                new HashMap<String, Integer>(Map.of("History", 3, "Art", 3, "Math", 5, "Math2", 5, "PE", 4, "CS", 5))));
        students.add(new Student("Lev Alexandrov", "C", 2,
                new HashMap<String, Integer>(Map.of("History", 5, "Art", 5, "Math", 5, "Math2", 5, "PE", 5, "CS", 5))));
        students.add(new Student("Pyotr Dmitriev", "D2", 2,
                new HashMap<String, Integer>(Map.of("History", 3, "Art", 3, "Math", 2, "Math2", 2, "PE", 5, "CS", 3))));
        students.add(new Student("Dmitriy Alexandrov", "E3", 2,
                new HashMap<String, Integer>(Map.of("History", 3, "Art", 3, "Math", 3, "Math2", 2, "PE", 3, "CS", 3))));
        for (Student student : students) {
            student.print();
            System.out.println();
        }
        System.out.println();

        Main main = new Main();
        main.expelStudents(students);
        for (Student student : students) {
            student.print();
            System.out.println();
        }
        System.out.println();

        main.moveStudentsNextCourse(students);
        for (Student student : students) {
            student.print();
            System.out.println();
        }
        System.out.println();

        main.printStudents(students, 2);
        System.out.println();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("8-999-383-24-11", "Ivanov");
        phoneBook.add("8-989-341-41-51", "Petrov");
        phoneBook.add("8-972-533-56-16", "Sidorov");
        phoneBook.add("8-963-345-50-84", "Petrenko");
        phoneBook.add("8-989-353-32-14", "Uvarov");
        phoneBook.add("8-909-953-50-03", "Alexsandrova");
        phoneBook.add("8-999-360-42-21", "Ivanov");
        phoneBook.add("8-800-533-87-91", "Kirillov");
        phoneBook.add("8-989-893-43-61", "Petrov");
        phoneBook.add("8-994-666-11-11", "Petrov");
        phoneBook.add("8-933-113-22-80", "Petrova");
        for (String phoneNumber : phoneBook.get("Petrov")) {
            System.out.println(phoneNumber);
        }
    }

    public void expelStudents(Set<Student> students) {
        for (Student student : Set.copyOf(students)) {
            if (student.getAvgGrade() < 3) {
                students.remove(student);
            }
        }
    }

    public void moveStudentsNextCourse(Set<Student> students) {
        for (Student student : students) {
            if (student.getAvgGrade() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
