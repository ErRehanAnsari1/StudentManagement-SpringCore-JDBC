import java.util.*;

public class StudentDAOImpl implements StudentDAO {
    private Map<Integer, Student> studentDB = new HashMap<>();

    public void addStudent(Student student) {
        studentDB.put(student.getId(), student);
        System.out.println("Student Added: " + student);
    }

    public Student getStudentById(int id) {
        return studentDB.get(id);
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(studentDB.values());
    }

    public void deleteStudent(int id) {
        studentDB.remove(id);
        System.out.println("Student with ID " + id + " removed.");
    }
}
