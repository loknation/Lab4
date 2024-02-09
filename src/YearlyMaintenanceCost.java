public class YearlyMaintenanceCost {
    public static void main(String[] args) {
        double springCost = 500.0;
        double summerCost = 600.0;
        double fallCost = 400.0;
        double winterCost = 700.0;
        double yearlyMaintenanceCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("Spring maintenance cost: $" + springCost);
        System.out.println("Summer maintenance cost: $" + summerCost);
        System.out.println("Fall maintenance cost: $" + fallCost);
        System.out.println("Winter maintenance cost: $" + winterCost);
        System.out.println("Total yearly maintenance cost: $" + yearlyMaintenanceCost);
    }
}
