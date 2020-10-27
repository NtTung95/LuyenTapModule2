package Entities;
import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthday;
    private String job;

    public Person(String name, LocalDate birthday, String job) {
        this.name = name;
        this.birthday = birthday;
        this.job = job;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name +
                ", birthday=" + birthday +
                ", job='" + job +
                '}';
    }
}
