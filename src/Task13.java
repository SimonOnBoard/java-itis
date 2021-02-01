import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int previousNumber;
        int currentNumber;
        int nextNumber;
        Scanner scanner = new Scanner(System.in);
        previousNumber = scanner.nextInt();
        currentNumber = scanner.nextInt();
        nextNumber = scanner.nextInt();
        int globalCounter = 0;
        boolean correctResult = false;
        while (nextNumber != 0) {
            if (currentNumber > previousNumber & currentNumber > nextNumber) {
                if (currentNumber % 2 == 0) {
                    globalCounter++;
                }
            }
            previousNumber = currentNumber;
            currentNumber = nextNumber;
            nextNumber = scanner.nextInt();
            if(globalCounter > 2){
                break;
            }
        }
        if (globalCounter == 2) {
            System.out.println("Sequence is correct");
        } else {
            System.out.println("FAILED");
        }
    }
}
