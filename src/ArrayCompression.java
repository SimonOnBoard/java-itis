import java.util.Arrays;
import java.util.Scanner;

public class ArrayCompression {
    static Scanner scanner = new Scanner(System.in);
    static int removedPositions = 0;

    public static void main(String[] args) {
        int a = getInt();
        int b = getInt();
        //размер массива
        int n = getInt();
        int[] array = getArray(n);
        removeNumbersFromArray(array, a, b);
        fillEmptyPositionsWithZero(array);
        System.out.println(Arrays.toString(array));
    }

    private static void fillEmptyPositionsWithZero(int[] array) {
        for (int i = array.length - removedPositions; i < array.length; i++){
            array[i] = 0;
        }
    }

    private static void removeNumbersFromArray(int[] array, int a, int b) {
        int i = 0;
        while (i != array.length - 1) {
            while (intervalContainsNumber(a, b, array[i])) {
                removedPositions++;
                shiftLeft(array, i);
                if(i == array.length - removedPositions){
                    break;
                }
            }
            i++;
        }
    }

    private static void shiftLeft(int[] array, int i) {
        for (int j = i; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
    }

    private static boolean intervalContainsNumber(int a, int b, int i) {
        return a <= i && b >= i;
    }

    private static int[] getArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = getInt();
        }
        return result;
    }

    private static int getInt() {
        return scanner.nextInt();
    }
}
