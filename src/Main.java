public class Main {

    public static void main(String[] args) {

        System.out.println(getMultiplication(-5, -35));
        System.out.println(getMultiplication(8, -10));

        System.out.println(getSum(8, 11));
        System.out.println(getSum(-6, -4));
        System.out.println(getSum(-12, 10));
        System.out.println(getSum(38, 45));
        System.out.println(getSum(0, -6));
    }

    public static int getSum(int n1, int n2) {
        return n1 + n2;

    }

    public static int getMultiplication(int n1, int n2) {
        return n1 * n2;
    }
}
