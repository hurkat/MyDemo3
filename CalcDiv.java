public class CalcDiv {
    int divide(int a, int b) {
        try {
            int result = a / b;
            return result;
        } catch(ArithmeticException e) {
            System.out.println("Divide by zero error occurred");
        }
    }
}
