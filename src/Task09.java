import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        //вводится последовательность чисел длиной n
        Scanner scanner = new Scanner(System.in);
        //проверяется размер входящей последовательности - сделаем в будущем
        int currentNumber = scanner.nextInt();
        int copyOfXValue;
        int countEven;
        int countOdd;
        //считаем числа подходящие
        int resultCounter = 0;
        while (currentNumber != 0) {
            countEven = 0;
            countOdd = 0;
            copyOfXValue = currentNumber;
            //для каждого числа проверяется, какое количество цифр в него входит
            int counter = 0;
            while (currentNumber != 0) {
                currentNumber = currentNumber / 10;
                counter++;
            }
            //если количество не 3 и не 5, мы прекращаем выполенение
            if (counter == 5 | counter == 3) {
                //необходимо проверить чётность\нечётность всех цифр числа
                while (copyOfXValue != 0) {
                    if (copyOfXValue % 10 % 2 == 0) {
                        countEven++;
                    } else {
                        countOdd++;
                    }
                    copyOfXValue /= 10;
                }
                if (counter == countEven | counter == countOdd) {
                    resultCounter++;
                }
            }
            currentNumber = scanner.nextInt();
            if(resultCounter > 2){
                break;
            }
        }
        if (resultCounter != 2) {
            System.out.println("FAILED");
        } else {
            System.out.println("Sequence is correct");
        }
    }
}
