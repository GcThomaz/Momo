package Project;

import java.util.ArrayList;

public class FixedBills extends Bills implements BillsTeste{

    ArrayList<FixedBills> fixedBillsList;

    public FixedBills(String name, double price) {
        super(name, price);
        this.fixedBillsList = new ArrayList<>();
    }
}
