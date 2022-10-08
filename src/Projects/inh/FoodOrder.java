package Projects.inh;

public class FoodOrder extends BaseOrder{
    String cutleryPackw;
    String promotion;
    String drink;
    int drinkPrice;
    double promotionPrice;

    public double getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(double promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public int getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(int drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getCutleryPackw() {
        return cutleryPackw;
    }

    public void setCutleryPackw(String cutleryPackw) {
        this.cutleryPackw = cutleryPackw;
    }
}
