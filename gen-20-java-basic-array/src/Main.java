
import array.ArrayOperation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //tugas array
        System.out.println("Input panjang array 1 dimensi:");
        Scanner in = new Scanner(System.in);
        int p1 = in.nextInt();
        int[] arr1 = new int[p1];
        System.out.println("Isi array:");
        for (int i = 0; i < p1; i++) {
            arr1[i] = in.nextInt();
        }

        System.out.println("Array yang diinput:");
        System.out.print("[");
        for (int isi : arr1) {
            System.out.print(isi + " ");
        }
        System.out.println("]");
        System.out.println();
        System.out.println("Total array 1 dimensi:");
        System.out.println(ArrayOperation.arraySum(arr1));
        System.out.println("Array 1 dimensi reverse:");
        System.out.print("[");
        int[] arrReversed = ArrayOperation.arrayReverse(arr1);
        for (int x : arrReversed) {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println("]");


        int[][] arr2 = {{1, 2, 3, 4, 5}, {3, 4, 5}, {3, 4, 5, 1}, {7, 6, 5, 4, 3, 2}, {4, 3, 2, 6, 7}};
        System.out.println("Isi array 2 dimensi:");
        for (int[] x : arr2
        ) {
            System.out.print("[");
            for (int y : x
            ) {
                System.out.print(y + " ");

            }
            System.out.println("]");

        }

        System.out.println();
        System.out.println("Total array 2 dimensi masing-masing:");

        int[] arr2dsum = ArrayOperation.arraySum2D(arr2);
        for (int x : arr2dsum) {
            System.out.print(x);
            System.out.print(";");
        }

        System.out.println();
        System.out.println();
        int[][] arr2drev = ArrayOperation.arrayReverse2D(arr2);
        for (int[] x : arr2drev) {
            System.out.print("[");
            for (int y : x) {
                System.out.print(y);
                System.out.print(" ");
            }
            System.out.println("]");
        }
    }
}