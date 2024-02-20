public class Main {

    public static void main(String[] args) {
        int result = getPow(0, 0);
        System.out.println("result: " + result);
    }

    public static int getPow(int base, int exponent) {
        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}