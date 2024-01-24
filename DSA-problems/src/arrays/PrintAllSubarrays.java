package arrays;

import java.util.Scanner;
import java.util.Set;

public class PrintAllSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        //Print all the subarrays
        for (int st = 0; st < N; st++) {
            for (int en = st; en < N; en++) {
                for (int i = st; i <= en; i++)
                    System.out.print(arr[i] + " ");
                System.out.println();
            }
        }
    }
}
