public class JavaVariables {
    public static void main(String[] args) {
        int intOperandA = 5;
        int intOperandB = 3;
        int intSum = intOperandA + intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;

        System.out.println("Int operations:");
        System.out.println("Sum: " + intSum);
        System.out.println("Product: " + intProduct);
        System.out.println("Difference: " + intDifference);
        System.out.println("Quotient: " + intQuotient);
        System.out.println("Modulo: " + intModulo);

        double doubleOperandA = 5.5;
        double doubleOperandB = 3.0;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;
        double doubleModulo = doubleOperandA % doubleOperandB;

        System.out.println("\nDouble operations:");
        System.out.println("Sum: " + doubleSum);
        System.out.println("Product: " + doubleProduct);
        System.out.println("Difference: " + doubleDifference);
        System.out.println("Quotient: " + doubleQuotient);
        System.out.println("Modulo: " + doubleModulo);
    }
}
