import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limitCreditCard;
    private double balanceCount;
    private List<Shop> shopList;

    public CreditCard(double limitCreditCard) {
        this.limitCreditCard = limitCreditCard;
        this.balanceCount = limitCreditCard;
        this.shopList = new ArrayList<>();
    }

    public boolean shopper(Shop shop) {
        if (this.balanceCount >= shop.getValue()) {
            balanceCount -= shop.getValue();
            shopList.add(shop);
            return true;
        }
        return false;
    }

    public double getLimitCreditCard() {
        return limitCreditCard;
    }

    public double getBalanceCount() {
        return balanceCount;
    }

    public List<Shop> getShopList() {
        return shopList;
    }
}
