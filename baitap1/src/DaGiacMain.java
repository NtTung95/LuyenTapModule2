import java.util.Scanner;

public class DaGiacMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soCanh;
        System.out.println("Nhap so canh da giac");
        soCanh = Integer.parseInt(input.nextLine());
        DaGiac daGiac = new DaGiac(soCanh);
        System.out.println(daGiac.ChuVi());
        System.out.println(daGiac);
    }
}

