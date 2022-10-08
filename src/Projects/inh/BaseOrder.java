package Projects.inh;

public class BaseOrder {
    private String productName;
    private String productId;
    private int productPrice;
    private String paymentType;
    private double cargoPrice;

    public String getProductName() {
        return productName;
    }

    public void setProduct(String product) {
        this.productName = product;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public double getCargoPrice() {
        return cargoPrice;
    }

    public void setCargoPrice(double cargoPrice) {
        this.cargoPrice = cargoPrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public void Order() {
        System.out.println("The order has been taken.");
    }

}
