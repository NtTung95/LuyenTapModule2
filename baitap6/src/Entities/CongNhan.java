package Entities;

import java.time.LocalDate;

public class CongNhan extends CanBo {
    private int bacLuong;

    public CongNhan(String name, String birthday, String gender, String address, int bacLuong) {
        super(name, birthday, gender, address);
        this.bacLuong = bacLuong;
    }

    public CongNhan() { }

    public int getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(int bacLuong) {
        this.bacLuong = bacLuong;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "name='" + getName() + '\'' +
                ", birthday=" + getBirthday() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", bacLuong=" + bacLuong +
                '}';
    }
}
