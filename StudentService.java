import java.util.ArrayList;

public class StudentService {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayStudents() {
        for (Student s : students) {
            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);
            System.out.println("Age: " + s.age);
            System.out.println("------------------");
        }
    }
}
