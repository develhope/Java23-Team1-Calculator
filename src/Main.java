public class Main {
    public static void main(String[] args) {
      
        System.out.println("Type of operation is = " + checkOperator("15 + 89"));
        System.out.println("Type of operation is = " + checkOperator("15 / 89"));
        System.out.println("Type of operation is = " + checkOperator("15 * 89"));
        System.out.println("Type of operation is = " + checkOperator("15 - 89"));
        System.out.println("Type of operation is = " + checkOperator("15 ^ 89"));
        System.out.println("Type of operation is = " + checkOperator("15 & 89"));


        System.out.println(getSum(8, 11));
        System.out.println(getSum(-6, -4));
        System.out.println(getSum(-12, 10));
        System.out.println(getSum(38, 45));
        System.out.println(getSum(0, -6));
        System.out.println(getSubtraction(5, 2));
        System.out.println(getSubtraction(5, -5));
        System.out.println(getMultiplication(-5, -35));
        System.out.println(getMultiplication(8, -10));
        System.out.println (getDivision (133, 3)[0]);
        System.out.println (getDivision (133, 3)[1]);
        System.out.println (isOdd (5));

        int result = getPow(0, 0);
        System.out.println("result: " + result);

    }
  
   public static String checkOperator(String operation) {
        if (operation.contains("+")) {
            return "Sum";
        }
        if (operation.contains("-")) {
            return "Subtraction";
        }
        if (operation.contains("/")) {
            return "Division";
        }
        if (operation.contains("*")) {
            return "Multiplication";
        }
        if (operation.contains("^")) {
            return "Exponents";
        } else {
            return "This is not an operation";
        }
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
    public static int[] getDivision (int div1, int div2) {
        int[] resultERest = new int[2];
        resultERest[0] = div1 / div2;
        resultERest[1] = div1 % div2;
        return (resultERest);
    }
    public static boolean isOdd (int number) {
        return number % 2 == 1;
    }

    public static int getPow(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;

        
    }

    public static int getGenericSubtraction(int[] addendi) {
        int result = addendi[0];
        for (int i = 1; i < addendi.length; i++) {
            result -= addendi[i];
        }
        return result;
    }
    

}

