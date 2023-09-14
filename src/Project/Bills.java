package Project;

import java.util.ArrayList;

public class Bills {
    protected String billName; //Nome da conta (Energia, agua, gas).
    protected double billPrice; //Preço da conta.

    public Bills(String name, double price) {
        this.billName = name;
        this.billPrice = price;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public double getBillPrice() {
        return billPrice;
    }

    public void setBillPrice(double billPrice) {
        this.billPrice = billPrice;
    }

    public void addUpAll() {}
}
