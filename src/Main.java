import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        String input = "78 + 65";
        String input2 = "78 * 65";
        String input3 = "78 / 65";
        String input4 = "78 - 65";
        String input5 = "2 ^ 5";
        String input6 = "78 & 65";
        removeSpace(findNumAndOperator(input));
        checkOperator(removeSpace(findNumAndOperator(input)));

        System.out.println("Operation is: " + input + "\n the result is = " + doOperation(input));
        System.out.println("Operation is: " + input2 + "\n the result is = " + doOperation(input2));
        System.out.println("Operation is: " + input3 + "\n the result is = " + doOperation(input3));
        System.out.println("Operation is: " + input4 + "\n the result is = " + doOperation(input4));
        System.out.println("Operation is: " + input5 + "\n the result is = " + doOperation(input5));
        System.out.println("Operation is: " + input6 + "\n the result is = " + doOperation(input6));

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
                        result = getDivision(n1, n2);
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

    public static int getDivision(int div1, int div2) {
        return (div1 / div2);
    }

    public static int getDivisionArray(int[] operation) {
        int result = operation[0];
        for (int i = 1; i < operation.length; i++) {
            try {
                int error = operation[i] / 0;
            } catch (ArithmeticException e) {
                System.out.println("There is an error: " + e);
            }
            result /= operation [i];
        }
        return result;
    }

    public static int getRest(int div1, int div2) {
        return (div1 % div2);
    }

    public static void isOdd(int number) {
        if (number % 2 == 1) {
            System.out.println(number + " is odd.");
        } else {
            System.out.println(number + " is even.");
        }
    }

    public static int getPow(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static int getSubtractionArray(int[] operators) {
        int subtraction = operators[0];
        for (int i = 1; i < operators.length; i++) {
            subtraction = subtraction - operators[i];
        }
        return subtraction;
    }


    public static int getMultiplicationArray(int[] array) {
        int arrayMultiplication = 1;
        for (int i = 0; i < array.length; i++) {
            arrayMultiplication = arrayMultiplication * array[i];
        }
        return arrayMultiplication;
    }

    public static int getSumArray(int[] addendi) {
        int sum = 0;
        for (int i = 0; i < addendi.length; i++) {
            sum = sum + addendi[i];
        }
        return (sum);
    }
}
