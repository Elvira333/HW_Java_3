import java.util.Arrays;
import java.util.Scanner;

public class sort {
        private static Scanner sc;

        public static void main(String args[]) {
            sc = new Scanner(System.in);

            System.out.print("How many items would you like to sort? ");
            int n = sc.nextInt();

            int arr[] = new int[n];

            System.out.print("Enter the numbers separated by a space: ");

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();


            System.out.println("Unsorted array:");
            System.out.println(Arrays.toString(arr));

            heap(arr);

            System.out.println("Pyramid sorting is performed:");
            System.out.println(Arrays.toString(arr));
        }

        static void heapify(int a[], int n, int i) {
            int max, child;
            child = 2 * i + 1;
            max = i;
            if (child < n)
                if (a[child] > a[max])
                    max = child;
            if (child + 1 < n)
                if (a[child + 1] > a[max])
                    max = child + 1;
            if (max != i) {
                int temp = a[i];
                a[i] = a[max];
                a[max] = temp;
                heapify(a, n, max);
            }
        }

        static void buildheap(int a[]) {
            for (int i = a.length / 2 - 1; i >= 0; i--)
                heapify(a, a.length, i);
        }

        static void heap(int a[]) {
            buildheap(a);
            for (int i = a.length - 1; i >= 1; i--) {
                int temp = a[0];
                a[0] = a[i];
                a[i] = temp;
                heapify(a, i, 0);
            }
        }
}














