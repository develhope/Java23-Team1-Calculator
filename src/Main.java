public class Main {

    public static void main(String[] args) {
        System.out.println("Type of operation is = " + checkOperation(5, '/', 9));
        System.out.println("Type of operation is = " + checkOperation(5, '*', 9));
        System.out.println("Type of operation is = " + checkOperation(5, '-', 9));
        System.out.println("Type of operation is = " + checkOperation(5, '+', 9));
        System.out.println("Type of operation is = " + checkOperation(5, '^', 9));
        System.out.println("Type of operation is = " + checkOperation(5, '&', 9));
        System.out.println();

        System.out.println("Type of operation is = " + checkOperator("15 + 89"));
        System.out.println("Type of operation is = " + checkOperator("15 / 89"));
        System.out.println("Type of operation is = " + checkOperator("15 * 89"));
        System.out.println("Type of operation is = " + checkOperator("15 - 89"));
        System.out.println("Type of operation is = " + checkOperator("15 ^ 89"));
        System.out.println("Type of operation is = " + checkOperator("15 & 89"));

    }

    public static String checkOperation(float n1, char operator, float n2) {
        String operationName = "";
        switch (operator) {
            case '+':
                operationName = "Sum";
                break;
            case '-':
                operationName = "Subtraction";
                break;
            case '*':
                operationName = "Multiplication";
                break;
            case '/':
                operationName = "Division";
                break;
            case '^':
                operationName = "Exponents";
                break;
            default:
                operationName = "Not an operation";

        }
        return operationName;
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

}
