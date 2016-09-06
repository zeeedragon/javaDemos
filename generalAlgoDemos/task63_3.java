package generalAlgoDemos;

import java.util.Scanner;

//1 6 3 3 8 7 7 7 7 7 12 5 5 5 3

public class task63_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println();
        int[] arr = new int[n];

        int counter = 1;

        //reading the array
        for (int i = 0; i < n; i++) {

            arr[i] = in.nextInt();
        }


        //for (int item : arr) {
        //    System.out.print(item + " ");
        //}
        //System.out.println();


        //checking if current number is same as next number, and else if current number is different than the number before
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && arr[i] == arr[i + 1]) {
                counter++;
            } else {
                if (counter == 1) {
                    System.out.print(" " + arr[i] + " ");
                } else {
                    System.out.print("(" + arr[i] + " " + counter + ")");
                    counter = 1;
                }

            }
        }
    }
}
