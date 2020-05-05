
public class DivideIntegers {
    public static int divide(int dividend, int divisor) {
        int remainder;
        try {
            remainder = dividend / divisor;
        } catch (ArithmeticException ae) {
            return 0;
        }

        if (divisor == -1 && dividend < 0 && Math.abs(remainder) == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (remainder > Integer.MAX_VALUE || remainder < Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        return remainder;
    }

    public static void main(String[] args) {
        System.out.println("remainder" + divide(-2147483648, -1));
    }
}
