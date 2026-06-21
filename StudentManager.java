import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void searchStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public void deleteStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public void countStudents() {
        System.out.println("Total Students: " + students.size());
    }

    public void updateStudent(int id, String newName, String newDepartment) {

        for (Student student : students) {

            if (student.getId() == id) {

                students.set(
                    students.indexOf(student),
                    new Student(id, newName, newDepartment)
                );

                System.out.println("Student updated successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}