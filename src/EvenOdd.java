public class EvenOdd {
    public static void main(String[] args) {
        int numToExamine = 2;
        boolean result = (numToExamine % 2 == 0);
        String output = result ? "Even" : "Odd";
        System.out.println(numToExamine + " is " + output);
    }
}
