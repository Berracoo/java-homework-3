package Projects.inh;

public class PersonelCareProductOrder extends BaseOrder {
    private double discount;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    String[] discountP = {
            "Makeup remover,Nail polisher, Lip balm"
    };

    public double Pricediscount(int productPrice, double discount){
        for (String products:discountP) {
            if(getProductName()==products){
                System.out.println(Pricediscount(getProductPrice(),getDiscount()));
            }
        }
        return productPrice - productPrice * discount;
    }
    public void discount(){

        System.out.println(Pricediscount(getProductPrice(),getDiscount()));
    }


}
