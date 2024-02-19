public class Main {

    public static void main(String[] args) {
        System.out.println(checkOperation('+'));
        System.out.println(checkOperation('-'));
        System.out.println(checkOperation('/'));
        System.out.println(checkOperation('*'));
        System.out.println(checkOperation('^'));
        System.out.println(checkOperation('&'));
    }

    public static String checkOperation (char operator) {
        String operationName = "";
        switch (operator) {
            case '+': 
                operationName = "Addition";
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
        return  operationName;
    }

}
