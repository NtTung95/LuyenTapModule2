import java.util.Arrays;
import java.util.Scanner;

public class DaGiac {
    Scanner input = new Scanner(System.in);
    int soCanh;
    double[] listCanh;

    public DaGiac() {}
    public DaGiac(int soCanh){
        this.soCanh = soCanh;
        listCanh = new double[soCanh];
        for(int i = 0; i < soCanh; i++){
            System.out.println("Nhap canh " + (i+1));
            listCanh[i] = Integer.parseInt(input.nextLine());
        }
    }

    public double ChuVi(){
        double chuvi = 0;
        for(int i = 0; i<listCanh.length; i++){
            chuvi += listCanh[i];
        }
        return chuvi;
    }

    @Override
    public String toString() {
        return "DaGiac{" +
                "soCanh=" + soCanh +
                ", listCanh=" + Arrays.toString(listCanh) +
                '}';
    }
}
