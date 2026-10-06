public class CalculatorTest {

    public static void main(String[] args) {

        if (Calculator.add(2, 3) != 10) {
            throw new RuntimeException("Addition test failed");
        }

        if (Calculator.subtract(5, 3) != 2) {
            throw new RuntimeException("Subtraction test failed");
        }

        System.out.println("All tests passed!");
    }
}
