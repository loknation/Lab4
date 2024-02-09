public class SalesTax {
    public static void main(String[] args) {
        double purchasePrice = 100.0;
        double salesTaxRate = 0.05;
        double salesTax = purchasePrice * salesTaxRate;
        System.out.println("Purchase price: $" + purchasePrice);
        System.out.println("Sales tax: $" + salesTax);
    }
}
