import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Method m = new Method();
        do{
            System.out.println("1.Create new customer");
            System.out.println("2.Display all customer");
            System.out.println("3.ElectricBill");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    Receipt receipt = new Receipt();
                    System.out.println("Enter customer name");
                    receipt.customer.setName(input.nextLine());
                    System.out.println("Enter customer apartmentNumber");
                    receipt.customer.setApartmentNumber(Integer.parseInt(input.nextLine()));
                    System.out.println("Enter customer electricMeter");
                    receipt.customer.setElectricMeter(Integer.parseInt(input.nextLine()));
                    System.out.println("Enter customer lastMonthConsumption");
                    receipt.setLastMonthConsumption(Float.parseFloat(input.nextLine()));
                    System.out.println("Enter customer thisMonthConsumption");
                    receipt.setThisMonthConsumption(Float.parseFloat(input.nextLine()));
                    m.create(receipt);
                    break;
                case 2:
                    m.displayAllReceipt();
                    break;
                case 3:
                    System.out.println("Enter electric meter: ");
                    m.calculatorElectricBill(Integer.parseInt(input.nextLine()));
                    break;
            }
        }while (true);
    }
}
