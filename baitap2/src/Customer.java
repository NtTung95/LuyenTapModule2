import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Customer extends Person {
    private int days;
    private String typeOfRoom;
    private double priceOfRoom;

    public Customer(){}

    public Customer(int id, String name, int age, int days, String typeOfRoom) {
        super(id, name, age);
        this.days = days;
        this.typeOfRoom = typeOfRoom;

    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public double getPriceOfRoom() {
        switch (typeOfRoom){
            case "A":
                priceOfRoom = 1000;
                break;
            case "B":
                priceOfRoom = 800;
                break;
            case "C":
                priceOfRoom = 500;
                break;
        }
        return priceOfRoom;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", days=" + days +
                ", typeOfRoom='" + typeOfRoom + '\'' +
                ", priceOfRoom=" + getPriceOfRoom()+
                '}';
    }
}
