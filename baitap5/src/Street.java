import Entities.FamilyMember;
import Entities.Households;

import java.time.LocalDate;
import java.util.ArrayList;

public class Street {
    ArrayList<Households> householdsList = new ArrayList<>();
    LocalDate localDate = LocalDate.now();

    public void create(Households households){
        householdsList.add(households);
    }

    public void displayAll(){
        for (Households households: householdsList) {
            System.out.println(households);
        }
    }

    public void displayMembersInFamily(int idHouse){
        for (Households memberList : householdsList) {
            if(memberList.getIdHouse() == idHouse) {
                for (FamilyMember familyMember : memberList.getFamilyMembersList()) {
                    if(familyMember.getRelationshipWithOwner() == null){
                        familyMember.setRelationshipWithOwner("Chủ hộ");
                    }
                    System.out.println(familyMember);
                }
            }
        }
    }

    public void over80YearOldMember(){
        for (Households oldPeoples : householdsList) {
            for (FamilyMember oldPeople2 : oldPeoples.getFamilyMembersList()) {
                if(localDate.getYear() - oldPeople2.getBirthday().getYear() >= 80){
                    System.out.println("số nhà " + oldPeoples.getIdHouse() + " có " + oldPeople2 + "năm nay thượng thọ trên hoặc bằng 80");
                }
            }
        }
    }

    public void dieMember(int idHouse, String name){
        FamilyMember temp = new FamilyMember();
        for (Households households : householdsList) {
            if (households.getIdHouse() == idHouse) {
                for (FamilyMember dieMan : households.getFamilyMembersList()) {
                    if (dieMan.getName().equals(name)){
                        temp = dieMan;
                    }
                }
                households.getFamilyMembersList().remove(temp);
            }
        }
    }
}
