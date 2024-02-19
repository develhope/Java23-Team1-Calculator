public class Main {
    public static void main(String[] args) {
        double x = 133.78;
        double y = 33;
        int z = 5;
        System.out.println (division (x, y));
        System.out.println (isOdd (z));

    }
    public static double division (double div1, double div2) {
        return (div1 / div2);
    }
    public static boolean isOdd (int number) {
        return number % 2 == 1;
}
