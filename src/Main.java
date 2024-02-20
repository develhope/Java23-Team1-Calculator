public class Main {

    public static void main(String[] args) {
        System.err.println("la potenza è" + getpow(0, 0));
    }

    public static int getpow(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;

        }
        return result;
    }

}
