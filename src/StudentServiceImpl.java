import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDAO studentDAO;

    // Setter Injection
    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }

    public Student getStudentById(int id) {
        return studentDAO.getStudentById(id);
    }

    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }
}
