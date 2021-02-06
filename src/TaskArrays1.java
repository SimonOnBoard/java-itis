import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskArrays1 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        // это относится к задаче 1.1
        int[] arr;
        {
            int n = getInt();
            arr = getRandomArrayForSecondTask(n);
//            for (int i = 0; i < arr.length; i++) {
//                System.out.println(arr[i]);
//            }
            for (int i : arr) {
                System.out.println(i);
            }
            System.out.println("_____________________________________");
        }
//        // это относится к задаче 1.2
//        {
//            int b[] = copyOfArray(arr);
//            //в нашем случае предикат это условие if(length = 3) у конкретного числа
//            addReverseNumberByPredicate(b);
//            printArrayAndFirstDifferentElement(arr, b);
//        }
        // это отсносится к задаче 1.3
//        {
//            int k = getInt();
//            int l = getInt();
//            int matrix[][] = readMatrix(k, l);
//            //организовать КРАСИВЫЙ вывод матрицы не испольлзуя Arrays.toString()
//            printMatrix(matrix);
//            System.out.println(getSumFromMainDiagonal(matrix));
//        }
        //это относится к задаче 1.4
        {
            int k = getInt();
            insertKElementsIntoArray(arr, k);
        }
    }

    public static void insertKElementsIntoArray(int[] arratToCopy, int k){
        if(arratToCopy.length < k + 1){
            System.exit(255);
        }
        int[] resultArray = new int[arratToCopy.length + k];
        for (int i = 0; i < k; i++){
            resultArray[i] = arratToCopy[i];
        }
        int counter = 1;
        //можно ли это сделать более красиво не используя дополнительную переменную
        for (int i = k; i < k + k; i++){
            resultArray[i] = counter++;
        }
        for (int i = k + k; i < resultArray.length; i++){
            resultArray[i] = arratToCopy[k++];
        }
        System.out.println(Arrays.toString(resultArray));
    }

    public static int getSumFromMainDiagonal(int[][] matrix) {
        int sum = 0;
        // TODO: 06.02.2021 - для квадратной матрицы итерироваться только по главной диагонали считая сумму( не использовать второй внутренний цикл)
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(i == j){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    private static void printMatrix(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++){
//            for (int j = 0; j < matrix[i].length; j++){
//
//            }
//        }
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static int[][] readMatrix(int k, int l) {
        int resultMatrix[][] = new int[k][l];
        for (int i = 0; i < k; i++){
            for (int j = 0 ; j < l; j++){
                resultMatrix[i][j] = getInt();
            }
        }
        return resultMatrix;
    }

    public static void printArrayAndFirstDifferentElement(int[] arr, int[] b) {
        int position = -1;
        //Arrays.toSting()
        boolean notFound = true;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("First array element: " + arr[i] + ", second array element: " + b[i]);
            if (notFound && arr[i] != b[i]) {
                position = i;
                notFound = false;
            }
        }
        if (position != -1) {
            System.out.println("The first different element is " + b[position] + " on position " + position);
        } else {
            System.out.println("No different elements");
        }
    }

    public static void addReverseNumberByPredicate(int[] b) {
        int temp;
        for (int i = 0; i < b.length; i++) {
            if (b[i] >= 100 && b[i] <= 999) {
                temp = getReverseNumber(b[i]);
                System.out.println("The reverse number for " + b[i] + " is " + temp);
                b[i] += temp;
            }
        }
    }

    public static int getReverseNumber(int i) {
        int result = 0;
        while (i != 0) {
            result += i % 10;
            result *= 10;
            i /= 10;
        }
        result /= 10;
        return result;
    }

    public static int getInt() {
        return scanner.nextInt();
    }

    public static int[] getRandomArrayForNNumbers(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i * random.nextInt();
        }
        return result;
    }

    public static int[] getRandomArrayForSecondTask(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                result[i] += random.nextInt(10);
                result[i] *= 10;
            }
            result[i] /= 10;
        }
        return result;
    }

    public static int[] copyOfArray(int[] arrToCopy) {
        int[] result = new int[arrToCopy.length];
        //Arrays.copy()
        for (int i = 0; i < result.length; i++) {
            result[i] = arrToCopy[i];
        }
        return result;
    }
}
