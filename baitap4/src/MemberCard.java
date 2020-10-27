import java.time.LocalDate;

public class MemberCard {
    Student student = new Student();
    private int idCard;
    private String bookName;
    private LocalDate dateBorrowed;
    private LocalDate returnDate;
    private int numberOfDaysBorrowed;

    public Student getStudent() {
        return student;
    }

    public int getNumberOfDaysBorrowed() {
        return numberOfDaysBorrowed;
    }

    public void setNumberOfDaysBorrowed(int numberOfDaysBorrowed) {
        this.numberOfDaysBorrowed = numberOfDaysBorrowed;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public LocalDate getDateBorrowed() {
        return dateBorrowed;
    }

    public void setDateBorrowed(LocalDate dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "MemberCard{" +
                "student=" + student +
                ", idCard=" + idCard +
                ", dateBorrowed=" + dateBorrowed +
                ", returnDate=" + returnDate +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
