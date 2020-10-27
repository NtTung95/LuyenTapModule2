public class TamGiac extends DaGiac {
    private double canh1;
    private double canh2;
    private double canh3;

    public TamGiac(double canh1, double canh2, double canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    public boolean isTamGiac(){
        if (canh1+canh2>canh3 && canh1+canh3>canh2 && canh3+canh2>canh1){
            return true;
        }else
            System.out.println("K phai tam giac");
            return false;
    }

    @Override
    public double ChuVi() {
        double chuvi = 0;
        if(isTamGiac())
            chuvi = canh1 + canh2 + canh3;
        return chuvi;
    }

    public double DienTich(){
        double dientich = 0;
        if(isTamGiac()){
            double duongCaoCanh1 = 2*(Math.sqrt(ChuVi()/2*(ChuVi() - canh1)*(ChuVi() - canh2)*(ChuVi() - canh3))/canh1);
            dientich = 0.5*canh1*duongCaoCanh1;
        }
        return dientich;
    }

    @Override
    public String toString() {
        return "TamGiac{" +
                "canh1=" + canh1 +
                ", canh2=" + canh2 +
                ", canh3=" + canh3 +
                ", chu vi=" + ChuVi() +
                ", dien tich=" + DienTich() +
                '}';
    }
}
