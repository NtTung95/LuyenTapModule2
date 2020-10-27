package Entities;

import java.util.ArrayList;

public class Households {
    private int idHouse;
    private int familyMembers;
    private FamilyMember owner = new FamilyMember();
    ArrayList<FamilyMember> familyMembersList = new ArrayList<>(familyMembers);

    public Households() {
    }

    public FamilyMember getOwner() {
        return owner;
    }

    public void setOwner(FamilyMember owner) {
        this.owner = owner;
    }

    public int getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(int idHouse) {
        this.idHouse = idHouse;
    }

    public int getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(int familyMembers) {
        this.familyMembers = familyMembers;
    }

    public ArrayList<FamilyMember> getFamilyMembersList() {
        return familyMembersList;
    }

    public void setFamilyMembersList(ArrayList<FamilyMember> familyMembersList) {
        this.familyMembersList = familyMembersList;
    }

    public String ownerInfo(){
        return "name = " + owner.getName()+
                ", birthday = " + owner.getBirthday()+
                ", job = " + owner.getJob();
    }

    @Override
    public String toString() {
        return "Số nhà =" + idHouse +
                ", Số người ở =" + familyMembers +
                ", Chủ hộ =" + ownerInfo();
    }
}
