import Entities.Households;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Street m = new Street();
        Menus menu = new Menus();

        do {
            System.out.println("1.Thêm hộ gia đình mới");
            System.out.println("2.Hiển thị các hộ gia đình trong khu phố");
            System.out.println("3.Hiển thị các thành viên trong gia đình theo số nhà");
            System.out.println("4.Hiện thị hộ dân có người năm nay thượng thọ 80 tuổi");
            System.out.println("5.Báo tử");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    Households households = menu.addHouseholds();
                    m.create(households);

                    m.displayAll();
                    break;
                case 2:
                    m.displayAll();
                    break;
                case 3:
                    System.out.println("Nhập số nhà của gia đình muốn xem thành viên");
                    int idHouse = Integer.parseInt(input.nextLine());
                    m.displayMembersInFamily(idHouse);
                    break;
                case 4:
                    m.over80YearOldMember();
                    break;
                case 5:
                    int idDieMan = Integer.parseInt(input.nextLine());
                    String nameDieMan = input.nextLine();
                    m.dieMember(idDieMan, nameDieMan);
                    break;
            }
        } while (true);
    }
}
