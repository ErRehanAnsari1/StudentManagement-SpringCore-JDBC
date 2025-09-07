import java.util.List;

public interface StudentDAO {
    void addStudent(Student student);
    Student getStudentById(int id);
    List<Student> getAllStudents();
    void deleteStudent(int id);
}
