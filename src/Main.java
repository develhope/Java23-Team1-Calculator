public class Main {

    public static void main(String[] args) {
        System.out.println(getMulptiplication(0.5f, 35f));
        System.out.println(getMulptiplication(-5, -35));
        System.out.println(getMulptiplication(8f, -10f));
        System.out.println(getMulptiplication(999999999f, 1f));
    }

    public static float getMulptiplication(float n1, float n2) {

        if (n1 > 999999999f) {
            System.out.println("Err");
        }
        if (n2 > 999999999f) {
            System.out.println("Err");
        }
        return n1 * n2;
    }
}
