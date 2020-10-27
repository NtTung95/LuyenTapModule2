package Entities;

import java.time.LocalDate;

public class FamilyMember extends Person {
    private String relationshipWithOwner;

    public FamilyMember(){}

    public FamilyMember(String name, LocalDate birthday, String job, String relationshipWithOwner) {
        super(name, birthday, job);
        this.relationshipWithOwner = relationshipWithOwner;
    }

    public FamilyMember(String relationshipWithOwner) {
        this.relationshipWithOwner = relationshipWithOwner;
    }

    public String getRelationshipWithOwner() {
        return relationshipWithOwner;
    }

    public void setRelationshipWithOwner(String relationshipWithOwner) {
        this.relationshipWithOwner = relationshipWithOwner;
    }

    @Override
    public String toString() {
        return "Thành viên{" +
                "name= " + super.getName() +
                ", birthday=" + super.getBirthday() +
                ", job=" + super.getJob() +
                ", quan hệ vs chủ hộ =" + relationshipWithOwner +
                '}';
    }
}
