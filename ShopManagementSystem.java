package LK03;
public class ShopManagementSystem {
    public static void main(String[] args) {
        Product[] products = new Product[6];

        products[0] = new FoodProduct("F01","Roti",150,20,"2026-05-01");
        products[1] = new FoodProduct("F02","Susu",100,5,"2026-04-10");

        products[2] = new ElectronicProduct("E01","Headphone",600,8,"1 Tahun");
        products[3] = new ElectronicProduct("E02","Mouse",300,15,"6 Bulan");

        products[4] = new ClothingProduct("C01","Kaos",120.5,12,"L","Nike");
        products[5] = new ClothingProduct("C02","Jaket",700,7,"M","Uniqlo");

        System.out.println("----- Daftar Produk -----");
        for(Product p : products){
            p.getProductInfo();
            System.out.println("Diskon: " + p.calculateDiscount());
            System.out.println();
        }
        // Transaksi 1
        Transaction Budi = new Transaction("T01");
        Budi.addItem(products[0], 3);
        Budi.addItem(products[2]);
        Budi.addItem(products[4]);
        // Transaksi 2
        Transaction Anna = new Transaction("T02");
        Anna.addItem(products[1],2);
        Anna.addItem(products[3]);

        double total1 = Budi.processSale();
        double total2 = Anna.processSale();

        System.out.printf("Total transaksi Budi: %.3f \n", total1);
        System.out.printf("Total transaksi Anna: %.3f \n", total2);

        double totalSales = total1 + total2;
        System.out.println("------------------------------------------------");
        System.out.println("Total penjualan FILKOM Mart: " + totalSales);
        System.out.println();
    }
}
