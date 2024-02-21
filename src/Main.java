public class Main {
    public static void main(String[] args) {

        System.out.println(getSum(8, 11));
        System.out.println(getSum(-6, -4));
        System.out.println(getSum(-12, 10));
        System.out.println(getSum(38, 45));
        System.out.println(getSum(0, -6));
        System.out.println(getSubtraction(5, 2));
        System.out.println(getSubtraction(5, -5));
        System.out.println(getMultiplication(-5, -35));
        System.out.println(getMultiplication(8, -10));
        int result = getPow(0, 0);
        System.out.println("result: " + result);

    }

    public static int getSum(int n1, int n2) {
        return n1 + n2;
    }

    public static int getSubtraction(int n1, int n2) {
        return n1 - n2;
    }

    public static int getMultiplication(int n1, int n2) {
        return n1 * n2;
    }

    public static int getPow(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}

