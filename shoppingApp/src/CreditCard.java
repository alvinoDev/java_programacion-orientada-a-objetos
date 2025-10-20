import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double blance;
    private List<Buy> shoppingList;

    public CreditCard(double limit) {
        this.limit = limit;
        this.blance = limit;
        shoppingList = new ArrayList<>();
    }

    public boolean startShopping(Buy buy) {
        if(this.blance >= buy.getValue()) {
            this.blance -= buy.getValue();
            this.shoppingList.add(buy);
            return true;
        }
        return false;
    }

    public double getLimit() {
        return limit;
    }

    public double getBlance() {
        return blance;
    }

    public List<Buy> getShoppingList() {
        return shoppingList;
    }
}
