import java.util.Scanner;

public class FindMinValueInArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap gia tri cho mang tai vi tri arr[" + i + "]");
            arr[i] = scanner.nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Gia tri nho nhat cua mang la: " + min);
    }

}
