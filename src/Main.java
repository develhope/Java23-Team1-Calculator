import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        String input = "78 + 65";
        String input2 = "78 * 65";
//        String input3 = "78 / 65";
        String input4 = "78 - 65";
        String input5 = "2 ^ 5";
         String input6 = "78 & 65";
        removeSpace(findNumAndOperator(input));
        checkOperator(removeSpace(findNumAndOperator(input)));

        System.out.println("Operation is: " + input + "\n the result is = " + doOperation(input));
        System.out.println("Operation is: " + input2 + "\n the result is = " + doOperation(input2));
        System.out.println("Operation is: " + input4 + "\n the result is = " + doOperation(input4));
        System.out.println("Operation is: " + input5 + "\n the result is = " + doOperation(input5));
        System.out.println("Operation is: " + input6 + "\n the result is = " + doOperation(input6));


//        System.out.println(getSum(8, 11));
//        System.out.println(getSum(-6, -4));
//        System.out.println(getSum(-12, 10));
//        System.out.println(getSum(38, 45));
//        System.out.println(getSum(0, -6));
//        System.out.println(getSubtraction(5, 2));
//        System.out.println(getSubtraction(5, -5));
//        System.out.println(getMultiplication(-5, -35));
//        System.out.println(getMultiplication(8, -10));
//        System.out.println(getDivision(133, 3)[0]);
//        System.out.println(getDivision(133, 3)[1]);
//        System.out.println(isOdd(5));
//
//        int result = getPow(0, 0);
//        System.out.println("result: " + result);

    }

    public static String[] findNumAndOperator(String operation) {
        String[] operations = new String[3];
        boolean startNumber = false;
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < operation.length(); i++) {
            char chart = operation.charAt(i);
            if (Character.isDigit(chart)) {
                number.append(chart);
                startNumber = true;

            } else if (startNumber) {
                addNumber(operations, String.valueOf(number));
                number = new StringBuilder(" ");
                startNumber = false;
            }
            if (checkOperator(chart)) {
                number.append(chart);
                startNumber = true;

            }

        }
        if (startNumber) {
            addNumber(operations, String.valueOf(number));
        }
        return operations;
    }

    public static String[] removeSpace(String[] operation) {
        String[] operationNoSpace = new String[3];
        for (int i = 0; i < operation.length; i++) {
            operationNoSpace[0] = operation[i].replaceAll("\\s", "");
            operationNoSpace[1] = operation[i + 1].replaceAll("\\s", "");
            operationNoSpace[2] = operation[(i + 1) + 1].replaceAll("\\s", "");
            break;
        }
        return operationNoSpace;
    }

    private static void addNumber(String[] array, String number) {
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i], null)) {
                array[i] = number;
                break;
            }
        }
    }

    public static boolean checkOperator(char operator) {
        return switch (operator) {
            case '+' -> true;
            case '-' -> true;
            case '*' -> true;
            case '/' -> true;
            case '^' -> true;
            default -> false;
        };
    }

    public static boolean checkOperator(String[] operation) {
        boolean isOperation = false;
        for (int i = 0; i < operation.length; i++) {
            switch (operation[i]) {
                case "+":
                    isOperation = true;
                    break;
                case "-":
                    isOperation = true;
                    break;
                case "*":
                    isOperation = true;
                    break;
                case "/":
                    isOperation = true;
                    break;
                case "^":
                    isOperation = true;
                    break;
                default:
                    break;
            }
        }
        return isOperation;
    }

    public static String checkOperation(String[] operation) {
        String operationName = "";
        for (int i = 0; i < operation.length; i++) {
            switch (operation[i]) {
                case "+":
                    operationName = "Sum";
                    break;
                case "-":
                    operationName = "Subtraction";
                    break;
                case "*":
                    operationName = "Multiplication";
                    break;
                case "/":
                    operationName = "Division";
                    break;
                case "^":
                    operationName = "Exponents";
                    break;
                default:
                    break;
            }
        }
        return operationName;
    }

    public static int doOperation(String operation) {
        String[] operators = removeSpace(findNumAndOperator(operation));
        String operationType = checkOperation(operators);
        int result = 0;
        for (int i = 0; i < operators.length; i++) {
            if (checkOperator(operators)) {
                int n1 = Integer.parseInt(operators[i]);
                int n2 = Integer.parseInt(operators[i + 2]);
                switch (operationType) {
                    case "Sum":
                        result = getSum(n1, n2);
                        break;
                    case "Subtraction":
                        result = getSubtraction(n1, n2);
                        break;
                    case "Multiplication":
                        result = getMultiplication(n1, n2);
                        break;
                    case "Division":
                        break;
                    case "Exponents":
                        result = getPow(n1, n2);
                        break;
                    default:
                        break;
                }
                break;
            }

        }

        return result;
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

    public static int[] getDivision(int div1, int div2) {
        int[] resultERest = new int[2];
        resultERest[0] = div1 / div2;
        resultERest[1] = div1 % div2;
        return (resultERest);
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static int getPow(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}

