package Entities;

import java.time.LocalDate;

public class NhanVien extends CanBo {
    private String job;

    public NhanVien(){}

    public NhanVien(String name, String birthday, String gender, String address, String job) {
        super(name, birthday, gender, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + getName() + '\'' +
                ", birthday=" + getBirthday() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
