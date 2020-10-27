import Entities.CanBo;
import Entities.CongNhan;
import Entities.KySu;
import Entities.NhanVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        Menus menu = new Menus();

        do {
            System.out.println("1.Thêm cán bộ");
            System.out.println("2.Tìm kiếm theo họ tên");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice){
                case 1:
                    System.out.println("1.Thêm kỹ sư");
                    System.out.println("2.Thêm nhân viên");
                    System.out.println("3.Thêm công nhân");
                    int addChoice = Integer.parseInt(input.nextLine());
                    switch (addChoice){
                        case 1:
                            KySu kySu = menu.addKySu();
                            qlcb.addKySu(kySu);
                            break;
                        case 2:
                            NhanVien nhanVien = menu.addNhanVien();
                            qlcb.addNhanVien(nhanVien);
                            break;
                        case 3:
                            CongNhan congNhan = menu.addCongNhan();
                            qlcb.addCongNhan(congNhan);
                            break;
                    }
                    qlcb.displayAllCanBo();
                    break;
                case 2:
                    System.out.println("Nhập tên cán bộ cần tìm");
                    qlcb.search(input.nextLine());
                    break;
            }
        }while (true);
    }
}
