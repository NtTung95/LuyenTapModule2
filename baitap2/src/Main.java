import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hotel m = new Hotel();

        do{
            System.out.println("1.Nhập khách thuê");
            System.out.println("2.Hiện các khách đang thuê");
            System.out.println("3.Xóa");
            System.out.println("4.Thanh toán");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    Customer customer = new Customer();
                    m.create(customer);
                    System.out.println("Nhập hạng phòng");
                    customer.setTypeOfRoom(input.nextLine());
                    System.out.println("Nhập tên khách");
                    customer.setName(input.nextLine());
                    System.out.println("Nhập tuổi khách");
                    customer.setAge(Integer.parseInt(input.nextLine()));
                    System.out.println("Nhập số CMND");
                    customer.setId(Integer.parseInt(input.nextLine()));
                    System.out.println("Nhập số ngày thuê");
                    customer.setDays(Integer.parseInt(input.nextLine()));
                    m.displayAll();
                    break;
                case 2:
                    m.displayAll();
                    break;
                case 3:
                    System.out.println("Nhập ID khách cần xóa");
                    m.delete(Integer.parseInt(input.nextLine()));
                    m.displayAll();
                    break;
                case 4:
                    System.out.println("Nhập ID khách cần thanh toán");
                    int idCheckOut = Integer.parseInt(input.nextLine());
                    m.checkOut(idCheckOut);
                    m.delete(idCheckOut);
                    break;
            }
        } while (true);
    }
}
