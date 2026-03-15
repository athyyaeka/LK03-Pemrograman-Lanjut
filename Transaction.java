package LK03;

public class Transaction {
    private String transactionId;
    private Product[] items;
    private int[] quantities;
    private int totalItems;

    public Transaction(String transactionId) {
        this.transactionId = transactionId;
        items = new Product[10];
        quantities = new int[10];
        totalItems = 0;
    }
    // jika beli 1 item
    public void addItem(Product item) {
        items[totalItems] = item;
        quantities[totalItems] = 1;
        totalItems++;
    }
    // jika beli lebih dari 1
    public void addItem(Product item, int quantity) {
        items[totalItems] = item;
        quantities[totalItems] = quantity;
        totalItems++;
    }

    public double processSale() {
    double total = 0;
    double totalHargaAsli = 0;
    double totalDiskon = 0;

    System.out.println("Transaction ID: " + transactionId);
    System.out.println("Daftar Item:");

    for(int i = 0; i < totalItems; i++) {
        double price = items[i].getPrice();
        double discount = items[i].calculateDiscount();
        int qty = quantities[i];

        double hargaAsliItem = price * qty;
        double diskonItem = discount * qty;
        double finalPrice = (price - discount) * qty;

        System.out.printf(items[i].getName() +
                           " x " + qty +
                           " = %.3f \n", finalPrice);

        totalHargaAsli += hargaAsliItem;
        totalDiskon += diskonItem;
        total += finalPrice;
        // kurangi stok
        items[i].updateStock(-qty);
    }
    System.out.println();
    System.out.printf("Total Harga Asli  : %.3f\n", totalHargaAsli);
    System.out.printf("Total Diskon      : %.3f\n", totalDiskon);
    System.out.printf("Total Harga Akhir : %.3f - %.3f = %.3f\n",
                        totalHargaAsli, totalDiskon, total);
    System.out.println("------------------------------------------------\n");
    return total;
    }
}
