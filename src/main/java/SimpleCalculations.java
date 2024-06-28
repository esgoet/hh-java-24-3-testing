public class SimpleCalculations {
    public static void main(String[] args) {

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String toUpperCase(String s) {
        return s.toUpperCase();
    }

    public static boolean checkPositive(int a) {
        if (a > 0) {
            return true;
        }
        return false;
    }
}
