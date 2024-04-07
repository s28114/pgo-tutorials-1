import java.util.List;

public class StudentGroup {
    public String name;
    public List<Student> students;
    public static final int MAX_GROUP_SIZE = 15;

    public void addStudent(Student student) {
        if (students.size() >= MAX_GROUP_SIZE) {
            throw new IllegalStateException("Group is full.");
        }
        if (students.contains(student)) {
            throw new IllegalArgumentException("Student already exists in the group.");
        }
        students.add(student);
    }
}