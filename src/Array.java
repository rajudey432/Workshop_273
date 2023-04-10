import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element of array : ");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the element of search : ");
        int search = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == search) {
                count++;
                System.out.println(search + "does not occur in the array.");
            } else {
                System.out.println(search + "occurs" + " time in the array. ");
            }
        }
    }
}




