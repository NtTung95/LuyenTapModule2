public class Customer {
    private String name;
    private int apartmentNumber;
    private int electricMeter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getElectricMeter() {
        return electricMeter;
    }

    public void setElectricMeter(int electricMeter) {
        this.electricMeter = electricMeter;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", apartmentNumber=" + apartmentNumber +
                ", electricMeter=" + electricMeter +
                '}';
    }
}
