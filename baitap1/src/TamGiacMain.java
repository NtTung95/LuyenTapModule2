import java.util.ArrayList;
import java.util.Scanner;

public class TamGiacMain {
    public static void main(String[] args) {
        ArrayList<TamGiac> listTamGiac = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1: Tạo 1 tam giac");
            System.out.println("2: In ra các tam giác");
            System.out.println("3: Hien thi tam giac co dien tich lớn nhất");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    System.out.println("nhap canh a");
                    double a = Integer.parseInt(input.nextLine());
                    System.out.println("nhap canh b");
                    double b = Integer.parseInt(input.nextLine());
                    System.out.println("nhap canh c");
                    double c = Integer.parseInt(input.nextLine());
                    TamGiac tamGiac = new TamGiac(a,b,c);
                    listTamGiac.add(tamGiac);
                    break;
                case 2:
                    for (TamGiac displayTamGiac : listTamGiac) {
                        System.out.println(displayTamGiac);
                    }
                    break;
                case 3:
                    double dientich = 0;
                    for (TamGiac x : listTamGiac) {
                        if(x.DienTich()>dientich){
                            dientich = x.DienTich();
                        }
                    }
                    for (TamGiac y : listTamGiac) {
                        if(dientich == y.DienTich()){
                            System.out.println(y);
                        }
                    }
                    break;
            }
        } while (true);


    }
}
