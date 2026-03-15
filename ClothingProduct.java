package LK03;

public class ClothingProduct extends Product {
    private String size, brand;

    public ClothingProduct(String productId, String name, double price, int stockQuantity, String size, String brand){
        super(productId, name, price, stockQuantity);
        this.size = size;
        this.brand = brand;
    }

    @Override
    public double calculateDiscount(){
        if (size.equals("L") || size.equals("XL")) {
            return getPrice() * 0.15;
        }
        return 0;
    }

    @Override
    public void getProductInfo(){
        super.getProductInfo();
        System.out.print(brand + " | Size: " + size+" | ");
    }
}
