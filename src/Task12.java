import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int previousNumber;
        int currentNumber;
        int nextNumber;
        Scanner scanner = new Scanner(System.in);
        previousNumber = scanner.nextInt();
        currentNumber = scanner.nextInt();
        nextNumber = scanner.nextInt();
        int resultMaxValue = 0;
        boolean correctResult = false;
        while (nextNumber != 0) {
            if (currentNumber > previousNumber & currentNumber > nextNumber) {
                if (currentNumber % 2 == 0) {
                    correctResult = true;
                    resultMaxValue = currentNumber;
                }
            }
            if (correctResult) break;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
            nextNumber = scanner.nextInt();
        }
        if (correctResult) {
            System.out.println("Out local max is: " + resultMaxValue);
        } else {
            System.out.println("FAILED");
        }
    }
}
