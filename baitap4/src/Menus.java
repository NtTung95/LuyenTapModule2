import java.time.LocalDate;
import java.util.Scanner;

public class Menus {
    Scanner input = new Scanner(System.in);

    public MemberCard addMenu(){
        MemberCard memberCard = new MemberCard();
        System.out.println("Enter student class");
        memberCard.student.setStudentClass(input.nextLine());
        System.out.println("Enter student ID");
        memberCard.student.setIdStudent(Integer.parseInt(input.nextLine()));
        System.out.println("Enter student name");
        memberCard.student.setName(input.nextLine());
        System.out.println("Enter student birthday");
        memberCard.student.setBirthday(LocalDate.of(Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine())));

        System.out.println("Enter ID card");
        memberCard.setIdCard(Integer.parseInt(input.nextLine()));
        System.out.println("Enter book name");
        memberCard.setBookName(input.nextLine());
        System.out.println("Enter Number Of Days Borrowed");
        memberCard.setNumberOfDaysBorrowed(Integer.parseInt(input.nextLine()));

        return memberCard;
    }
}
