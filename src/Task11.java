import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //переменная отвечающая за систему считсления от 2 до 9
        int k = scanner.nextInt();
        //число, которое мы будем переводить из k ичной системы счисления в десятичную
        int n = scanner.nextInt();
        int copyN = n;
        boolean flag = true;
        while (copyN != 0 && flag) {
            if (copyN % 10 >= k) {
                flag = false;
            }
            copyN /= 10;
        }
        int resultNumber = 0;
        int multiplier = 1;
        int lastDigit;
        while (n != 0 && flag) {
            lastDigit = n % 10;
            n /= 10;
            resultNumber += lastDigit * multiplier;
            multiplier *= k;
        }
        if(flag) {
            System.out.println("The result is: " + resultNumber);
        }else {
            System.out.println("Incorrect number");
        }
    }
}
