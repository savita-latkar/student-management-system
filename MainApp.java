import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        System.out.println("Enter Student ID:");
        int id = sc.nextInt();

        sc.nextLine(); // clear buffer

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Student Age:");
        int age = sc.nextInt();

        Student s = new Student();
        s.id = id;
        s.name = name;
        s.age = age;

        service.addStudent(s);

        System.out.println("Student Added Successfully!");
        System.out.println("Student List:");
        service.displayStudents();
    }
}
