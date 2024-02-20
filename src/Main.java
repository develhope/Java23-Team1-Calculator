public class Main {

    public static void main(String[] args) {
        System.err.println("la potenza è" + pow(2, 4));
    }

    public static int pow(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;

        }
        return result;
    }

}