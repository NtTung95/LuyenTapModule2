import java.time.LocalDate;

public class Student {
    private int idStudent;
    private String name;
    private LocalDate birthday;
    private String studentClass;

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + idStudent +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", Class='" + studentClass + '\'' +
                '}';
    }
}
