import Entities.CanBo;
import Entities.CongNhan;
import Entities.KySu;
import Entities.NhanVien;

import java.util.ArrayList;

public class QLCB {
    ArrayList<CanBo> canBoList = new ArrayList<>();

    public void addNhanVien(NhanVien nhanVien){
        canBoList.add(nhanVien);
    }
    public void addKySu(KySu kySu) {
        canBoList.add(kySu);
    }
    public void addCongNhan(CongNhan congNhan){
        canBoList.add(congNhan);
    }

    public void search(String name){
        boolean check = false;
        for (CanBo nameCanBo : canBoList) {
            if (nameCanBo.getName().equals(name)){
                System.out.println(nameCanBo);
                check = true;
            }
        }
        if(!check){
            System.err.println("Không tìm thấy");
        }

    }

    public void displayAllCanBo(){
        for (CanBo canBoList : canBoList) {
            System.out.println(canBoList);
        }
    }
}
