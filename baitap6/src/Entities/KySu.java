package Entities;

import java.time.LocalDate;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu(){}

    public KySu(String name, String birthday, String gender, String address, String nganhDaoTao) {
        super(name, birthday, gender, address);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "name='" + getName() + '\'' +
                ", birthday=" + getBirthday() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", nganhDaoTao='" + nganhDaoTao + '\'' +
                '}';
    }
}
