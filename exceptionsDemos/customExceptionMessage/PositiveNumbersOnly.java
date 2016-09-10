package softuni.exceptionsDemos.customExceptionMessage;

//enter numbers;
//throw exception if negative number

import java.util.Scanner;

public class PositiveNumbersOnly {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int num = 0;
        do {
            try {
                num = in.nextInt();
                if (num < 0) {
                    throw new NegativeInputException(num);
                }
            } catch (NegativeInputException exc) {
                System.out.println(exc.getMessage());
            }
        } while (num != 0);
        in.close();
    }
}
