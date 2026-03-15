package LK03;
public class FoodProduct extends Product {
    private String expiryDate;

    public FoodProduct(String productId, String name, double price, int stockQuantity, String expiryDate){
        super(productId, name, price, stockQuantity);
        this.expiryDate = expiryDate;
    }
    @Override
    public double calculateDiscount(){
        if(getStockQuantity() > 10){
            return getPrice() * 0.10;
        }
        return 0;
    }
    @Override
    public void getProductInfo(){
        super.getProductInfo();
        System.out.print("Expired: " + expiryDate + " | ");
    }
}
