import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        //вводится последовательность чисел длиной n
        Scanner scanner = new Scanner(System.in);
        int currentNumber = scanner.nextInt();
        int globalCounter = 0;
        int previousDigit = 0;
        int currentDigit = 0;
        boolean resultCountingFlag = true;
        while (currentNumber != 0) {
            resultCountingFlag = true;
            //мы забираем последнюю цифру для осущетвления проверки
            previousDigit = currentNumber % 10;
            currentNumber /= 10;
            //не имеет смысла продолжать алгоритм если у нас число состоит из 1 цифры
            if (currentNumber == 0) resultCountingFlag = false;
            //не имеет смысла продолжать алгоритм если у нас старшая цифра разряда меньше цифры младшего разряда
            while (currentNumber != 0 & resultCountingFlag) {
                currentDigit = currentNumber % 10;
                currentNumber /= 10;
                if (currentDigit < previousDigit) {
                    resultCountingFlag = false;
                }
                previousDigit = currentDigit;
            }

            if (resultCountingFlag) globalCounter++;
            if (globalCounter > 3) {
                break;
            }
            currentNumber = scanner.nextInt();
        }
        if (globalCounter == 3) {
            System.out.println("Sequence correct");
        } else {
            System.out.println("FAILED");
        }
    }
}
