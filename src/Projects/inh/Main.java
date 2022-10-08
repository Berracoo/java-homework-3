package Projects.inh;

public class Main {
    public static void main(String[] args) {
        DessertOrder dessertOrder = new DessertOrder();
        dessertOrder.setProductPrice(15);
        dessertOrder.setProduct("İce cream");
        dessertOrder.setCargoPrice(5);
        dessertOrder.setProductId("234524665");
        dessertOrder.setPaymentType("Credit Card");
        dessertOrder.Order();

        PersonelCareProductOrder personelCareProductOrder = new PersonelCareProductOrder();
        personelCareProductOrder.setProduct("Makeup remover");
        personelCareProductOrder.setProductId("243554774");
        personelCareProductOrder.setDiscount(0.5);
        personelCareProductOrder.setProductPrice(45);
        personelCareProductOrder.setCargoPrice(20);
        personelCareProductOrder.setPaymentType("Cash");
        personelCareProductOrder.Pricediscount(45, 0.5);
        personelCareProductOrder.discount();

        FoodOrder foodOrder = new FoodOrder();
        foodOrder.setCutleryPackw("Cutlery pack hasn't been wanted ");
        foodOrder.setDrink("The drink has been chosen");
        foodOrder.setDrinkPrice(13);
        foodOrder.setPromotion("Promotion hasn't been wanted. ");
        foodOrder.setCargoPrice(25);
        foodOrder.setProduct("Pizza");
        foodOrder.setPaymentType("Credit Card");
        foodOrder.setProductId("223476598");
        foodOrder.setProductPrice(63);

        BaseOrder[] baseOrders = {dessertOrder, personelCareProductOrder, foodOrder};


        for (BaseOrder baseOrder : baseOrders) {
            System.out.println("-------------");
            System.out.println(baseOrder.getProductName());
            System.out.println("-------------");

        }
        System.out.println(multiple(dessertOrder.getProductPrice(), foodOrder.getDrinkPrice(), foodOrder.getProductPrice()));


    }

    public static int multiple(int price1, int price2, int price3) {
        return price1 + price2 + price3;

    }

}
