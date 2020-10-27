public class Receipt {
    Customer customer = new Customer();
    private float lastMonthConsumption;
    private float thisMonthConsumption;

    public float getLastMonthConsumption() {
        return lastMonthConsumption;
    }

    public void setLastMonthConsumption(float lastMonthConsumption) {
        this.lastMonthConsumption = lastMonthConsumption;
    }

    public float getThisMonthConsumption() {
        return thisMonthConsumption;
    }

    public void setThisMonthConsumption(float thisMonthConsumption) {
        this.thisMonthConsumption = thisMonthConsumption;
    }

    @Override
    public String toString() {
        return "Information of " + customer.getName() + "{" +
                "apartmentNumber=" + customer.getApartmentNumber() +
                ", electricMeter=" + customer.getElectricMeter() +
                ", lastMonthConsumption=" + lastMonthConsumption +
                ", thisMonthConsumption=" + thisMonthConsumption +
                '}';
    }
}
