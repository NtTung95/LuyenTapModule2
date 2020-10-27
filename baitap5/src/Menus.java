import Entities.FamilyMember;
import Entities.Households;
import java.time.LocalDate;
import java.util.Scanner;

public class Menus {
    Scanner input = new Scanner(System.in);

    public Households addHouseholds(){
        Households households = new Households();

        System.out.println("Nhập số nhà");
        households.setIdHouse(Integer.parseInt(input.nextLine()));
        System.out.println("Nhập số người ở");
        households.setFamilyMembers(Integer.parseInt(input.nextLine()));
        System.out.println("Nhập tên chủ hộ");
        households.getOwner().setName(input.nextLine());
        System.out.println("Nhập ngày tháng năm sinh chủ hộ (yyyy/mm/dd)");
        households.getOwner().setBirthday(LocalDate.of(Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine())));
        System.out.println("Nhập công việc chủ hộ");
        households.getOwner().setJob(input.nextLine());

        households.getFamilyMembersList().add(households.getOwner());

        int i = 0;
        while (i < households.getFamilyMembers() - 1) {
            System.out.println("Nhập thành viên thứ " + (i + 1));

            households.getFamilyMembersList().add(addFamilyMember());
            i++;
        }

        return households;
    }

    public FamilyMember addFamilyMember(){
        FamilyMember familyMember = new FamilyMember();

        System.out.println("Quan hệ với chủ hộ là");
        familyMember.setRelationshipWithOwner(input.nextLine());

        System.out.println("Nhập tên");
        familyMember.setName(input.nextLine());

        System.out.println("Nhập ngày tháng năm sinh (yyyy/mm/dd)");
        familyMember.setBirthday(LocalDate.of(Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine())));

        System.out.println("Nhập nghề nghiệp");
        familyMember.setJob(input.nextLine());

        return familyMember;
    }
}
