import java.util.ArrayList;

public class Hotel {
    ArrayList<Customer> customers = new ArrayList<>();

    public void create(Customer p){
        customers.add(p);
    }
    public void displayAll(){
        if(customers.isEmpty()){
            System.out.println("K có khách thuê");
        }
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
    public void delete(int id){
        Customer temp = new Customer();
        for (Customer per : customers) {
            if(per.getId() == id){
                temp = per;
            }
        }
        if(customers.isEmpty()){
            System.out.println("K còn khách thuê");
        }
        customers.remove(temp);
    }

    public double checkOut(int id){
        double price = 0;
        for (Customer per : customers) {
            if(per.getId() == id){
                System.out.println("Giá phòng cần thanh toán");
                price = per.getPriceOfRoom()*per.getDays();
                System.out.println(price);
            }
        }
        return price;
    }
}
