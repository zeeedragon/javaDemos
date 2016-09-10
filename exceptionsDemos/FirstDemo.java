package softuni.exceptionsDemos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
        } catch (ArithmeticException exc) {
            System.out.println(exc.getMessage());
            System.err.println("Divide by zero attempt");
        } catch (InputMismatchException exc) {
            System.err.println("Wrong input");
        } finally {
            in.close();
        }

    }
}
