package softuni.exceptionsDemos;

//array with random numbers
//until input is different than 0 we read the array elements
//and we need to print the corresponding element


import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayExceptionsDemo {

    //throw governs possibility to handle the exceptions elsewhere
    public static void main(String[] args) throws FileNotFoundException {
        Random gen = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = gen.nextInt(101);
            System.out.print(arr[i] + "; ");
        }
        System.out.println();
        try {
            Scanner in = new Scanner(System.in);
            int hit = in.nextInt();
            while (hit != -1) {
                System.out.println(arr[hit]);
                hit = in.nextInt();
            }
            in.close();
        } catch (InputMismatchException exc) {
            System.out.println("Wrong input");
        } catch (IndexOutOfBoundsException exc) {
            System.out.println("Index out of bounds");
        }
    }
}
