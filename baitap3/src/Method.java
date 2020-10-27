import java.util.ArrayList;

public class Method {
    public static final int UNIT_PRICE_OF_ELECTRICITY = 750;
    ArrayList<Receipt> receipts = new ArrayList<>();
    public void create(Receipt receipt){
        receipts.add(receipt);
    }

    public void displayAllReceipt(){
        for (Receipt receipt : receipts) {
            System.out.println(receipt);
        }
    }

    public double calculatorElectricBill(int electricMeter){
        double electricBill = 0;
        for (Receipt receipt: receipts) {
            if(receipt.customer.getElectricMeter() == electricMeter){
                electricBill = (receipt.getThisMonthConsumption() - receipt.getLastMonthConsumption()) * UNIT_PRICE_OF_ELECTRICITY;
            }
        }
        System.out.println("Receipt this month must pay is: " + electricBill + "$");
        return electricBill;
    }
}
