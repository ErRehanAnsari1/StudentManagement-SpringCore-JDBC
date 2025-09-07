import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService service = (StudentService) context.getBean("studentService");

        // Add Students
        service.addStudent(new Student(1, "Rehan", "Java", 22));
        service.addStudent(new Student(2, "Aman", "Spring", 23));
        service.addStudent(new Student(3, "Zoya", "SQL", 21));

        // Fetch All
        System.out.println("All Students: " + service.getAllStudents());

        // Fetch by ID
        System.out.println("Student with ID 1: " + service.getStudentById(1));

        // Delete Student
        service.deleteStudent(2);

        // Final List
        System.out.println("After Deletion: " + service.getAllStudents());
    }
}
