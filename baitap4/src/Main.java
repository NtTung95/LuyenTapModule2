import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Method m = new Method();
        Menus menu = new Menus();
        LocalDate myObj = LocalDate.now();
        do{
            System.out.println("1. Add new member");
            System.out.println("2. Display all member");
            System.out.println("3. Display all member info");
            System.out.println("4. Display list book must return in last day of month");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    MemberCard memberCard = menu.addMenu();
                    m.create(memberCard);

                    memberCard.setDateBorrowed(myObj);
                    memberCard.setReturnDate(myObj.plusDays(memberCard.getNumberOfDaysBorrowed()));
                    m.displayAll();
                    break;
                case 2:
                    m.displayAll();
                    break;
                case 3:
                    m.displayStudentOnly();
                    break;
                case 4:
                    m.lastDayOfMonthMushBeReturnBook();
            }
        } while (true);
    }
}
