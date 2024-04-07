public class Student {

    public String fName;
    public String LName;
    public int IndexNumber;
    public String email;
    public String adress;
    public int grades;

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            throw new IllegalStateException("Student nie ma ocen.");
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

}
