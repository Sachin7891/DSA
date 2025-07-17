// // import java.util.Scanner;
// // public class arr1 {
// //     public static void main(String[] args) {
// //             Scanner scanner = new Scanner(System.in);
// //          int size1 = scanner.nextInt();

// //         int[] arr2 = new int[size1];

// //         System.out.println("Enter the elements of the array:");
// //         for (int i = 0; i < size1; i++) {
// //             System.out.print("Enter element " + (i + 1) + ": ");
// //             arr2[i] = scanner.nextInt();
// //         }
// //           int size = scanner.nextInt();

// //         int[] arr3 = new int[size];

// //         System.out.println("Enter the elements of the array:");
// //         for (int i = 0; i < size; i++) {
// //             System.out.print("Enter element " + (i + 1) + ": ");
// //             arr3[i] = scanner.nextInt();
// //         }
// //          int[] sum = new int[arr2.length];

// //          for(int i = 0 ; i<arr2.length ; i++){
// //             sum[i]=arr2[i] + arr3[i];

// //          }
        
// //          for(int val : sum){
// //             System.out.print(val + " ");}
         
// //     }
// // }
//  import java.util.Scanner;

// public class arr1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input size of first array
//         System.out.print("Enter the size of the arrays: ");
//         int size = scanner.nextInt();

//         // Declare both arrays of same size
//         int[] arr2 = new int[size];
//         int[] arr3 = new int[size];
//         int[] sum = new int[size];

//         // Input elements of first array
//         System.out.println("Enter the elements of the first array:");
//         for (int i = 0; i < size; i++) {
//             System.out.print("Enter element " + (i + 1) + ": ");
//             arr2[i] = scanner.nextInt();
//         }

//         // Input elements of second array
//         System.out.println("Enter the elements of the second array:");
//         for (int i = 0; i < size; i++) {
//             System.out.print("Enter element " + (i + 1) + ": ");
//             arr3[i] = scanner.nextInt();
//         }

//         // Sum of both arrays
//         for (int i = 0; i < size; i++) {
//             sum[i] = arr2[i] + arr3[i];
//         }

//         // Display the sum array
//         System.out.println("Sum of the two arrays:");
//         for (int val : sum) {
//             System.out.print(val + " ");
//         }
//     }
// }
import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] arr2 = new int[size1];

        // Input elements of the first array
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr2[i] = scanner.nextInt();
        }

        // Input size of the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] arr3 = new int[size2];

        // Input elements of the second array
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr3[i] = scanner.nextInt();
        }

        // Find the size for sum array (minimum of both sizes to avoid index error)
        int minSize = Math.min(size1, size2);
        int[] sum = new int[minSize];

        // Sum of corresponding elements
        for (int i = 0; i < minSize; i++) {
            sum[i] = arr2[i] + arr3[i];
        }

        // Display the sum array
        System.out.println("Sum of the two arrays:");
        for (int val : sum) {
            System.out.print(val + " ");
        }

        scanner.close();
    }
}
