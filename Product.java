package LK03;

public abstract class Product {
    private String productId;
    private String name;
    private double price;
    private int stockQuantity;
    
    public Product(String productId, String name, double price, int stockQuantity){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public abstract double calculateDiscount();

    public void getProductInfo(){
        System.out.print(productId+" | ");
        System.out.print(name+" | ");
        System.out.printf("%.3f | ", price);
        System.out.print("Stok: "+stockQuantity+" | ");
    }
    public String getProductId(){return productId;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public int getStockQuantity(){return stockQuantity;}
    public void setStockQuantity(int stockQuantity){this.stockQuantity = stockQuantity;}

    public void updateStock(int quantity){
        stockQuantity += quantity;
    }
    public void updateStock(int quantity, String reason){
        stockQuantity += quantity;
        System.out.println("Update stok karena "+ reason);
    }
}
