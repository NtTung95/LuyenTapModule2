import Entities.CongNhan;
import Entities.KySu;
import Entities.NhanVien;

import java.util.Scanner;

public class Menus {
    Scanner input = new Scanner(System.in);

    public KySu addKySu(){
        KySu kySu = new KySu();
        System.out.println("Nhập tên kỹ sư");
        kySu.setName(input.nextLine());
        System.out.println("Nhập birthday kỹ sư");
        kySu.setBirthday(input.nextLine());
        System.out.println("Nhập giới tính kỹ sư");
        kySu.setGender(input.nextLine());
        System.out.println("Nhập địa chỉ kỹ sư");
        kySu.setAddress(input.nextLine());
        System.out.println("Nhập ngành đào tạo");
        kySu.setNganhDaoTao(input.nextLine());
        return kySu;
    }
    public NhanVien addNhanVien(){
        NhanVien nhanVien = new NhanVien();
        System.out.println("Nhập tên nhân viên");
        nhanVien.setName(input.nextLine());
        System.out.println("Nhập birthday nhân viên");
        nhanVien.setBirthday(input.nextLine());
        System.out.println("Nhập giới tính nhân viên");
        nhanVien.setGender(input.nextLine());
        System.out.println("Nhập địa chỉ nhân viên");
        nhanVien.setAddress(input.nextLine());
        System.out.println("Nhập công việc");
        nhanVien.setJob(input.nextLine());
        return nhanVien;
    }
    public CongNhan addCongNhan(){
        CongNhan congNhan = new CongNhan();
        System.out.println("Nhập tên công nhân");
        congNhan.setName(input.nextLine());
        System.out.println("Nhập birthday công nhân");
        congNhan.setBirthday(input.nextLine());
        System.out.println("Nhập giới tính công nhân");
        congNhan.setGender(input.nextLine());
        System.out.println("Nhập địa chỉ công nhân");
        congNhan.setAddress(input.nextLine());
        System.out.println("Nhập bậc lương");
        congNhan.setBacLuong(Integer.parseInt(input.nextLine()));
        return congNhan;
    }
}
