import java.util.ArrayList;

public class Method {
    ArrayList<MemberCard> memberCards = new ArrayList<>();
    
    public void create(MemberCard memberCard){
        memberCards.add(memberCard);
    }
    
    public void displayAll(){
        for (MemberCard member : memberCards) {
            System.out.println(member);
        }
    }

    public void displayStudentOnly(){
        for (MemberCard students :
                memberCards) {
            System.out.println(students.getStudent());
        }
    }
    public void lastDayOfMonthMushBeReturnBook(){
        for (MemberCard mushReturnListBook : memberCards) {
            if(mushReturnListBook.getReturnDate().getDayOfMonth() == 30 || mushReturnListBook.getReturnDate().getDayOfMonth() == 31){
                System.out.println(mushReturnListBook);
            }
        }
    }
}
