package LK03;

public class ElectronicProduct extends Product {
    private String warrantyPeriod;

    public ElectronicProduct(String productId, String name, double price, int stockQuantity, String warrantyPeriod){
        super(productId, name, price, stockQuantity);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double calculateDiscount(){
        double discount = getPrice() * 0.05;
        if (getPrice() > 500000) {
            discount += getPrice() * 0.02;
        }
        return discount;
    }
    @Override
    public void getProductInfo(){
        super.getProductInfo();
        System.out.print("Garansi: " + warrantyPeriod + " | ");
    }
}
