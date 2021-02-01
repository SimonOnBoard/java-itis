import java.util.Scanner;

public class JavaLastForToday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if (k % 3 == 1) {
            k += 2;
        } else if (k % 3 == 2) {
            k += 1;
        }
        int n = scanner.nextInt();

        for (int i = k; i < n; i += 3){
            System.out.println(i);
        }
//        for (int i = k; i < n; i++){
//            if(i % 3 == 0){
//                System.out.println(i);
//            }
//        }
    }
}
