package Tugas;

public class Main {
    public static void main(String[] args) {
        // Create a lecture
        Lecture lecture1 = new Lecture("Amam Agus", 40, "Jakarta", "2107532");

        // Create students
        Student student1 = new Student("Haidar", 20, "Surabaya", "2402213214");
        Student student2 = new Student("Nabiel", 22, "Bandung", "240213543");

        // Create courses
        Course course1 = new Course("CSC101", "Introduction to Programming", lecture1);
        Course course2 = new Course("CSC201", "Data Structures", lecture1);

        // Enroll students in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course2);

        // Add students to courses
        course1.addStudent(student1);
        course2.addStudent(student1);
        course2.addStudent(student2);

        // View enrolled courses for students
        student1.viewEnrolledCourses();
        student2.viewEnrolledCourses();

        // View taught courses for lecture
        lecture1.viewTaughtCourses();

        // View enrolled students for courses
        course1.viewEnrolledStudents();
        course2.viewEnrolledStudents();
    }
}
