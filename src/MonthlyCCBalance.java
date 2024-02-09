public class MonthlyCCBalance {
    public static void main(String[] args) {
        double balance = 5000.0;
        double interestRate = 0.17;
        double interestAfterOneMonth = balance * interestRate;
        double interestAfterTwoMonths = balance * interestRate * 2;
        System.out.println("Interest due after one month: $" + interestAfterOneMonth);
        System.out.println("Interest due after two months: $" + interestAfterTwoMonths);
    }
}
