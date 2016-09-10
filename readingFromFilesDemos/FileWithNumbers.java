package softuni.readingFromFilesDemos;

//reading from file with nums and returning their sum

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWithNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner consoleIn = new Scanner(System.in);
        System.out.println("Name of in-file:");
        String fileIn = consoleIn.nextLine();
        System.out.println("Name of out-file:");
        String fileOut = consoleIn.nextLine();
        Scanner in = null;
        PrintWriter out = null;
        try {
            // input preparation = new of object of type File
            File inputFile = new File(fileIn);
            in = new Scanner(inputFile);
            // PrintWriter class we use it to write in file
            out = new PrintWriter(fileOut);
            double sum = 0;
            while (in.hasNextDouble()) {
                double d = in.nextDouble();
                sum += d;
                // writing in output file
                // %10 - this is the amount of signs to spread the number in -
                // padding
                out.printf("%10.2f%n", d);
            }
            // also print the sum
            out.printf("%10.2f%n", sum);
        } catch (FileNotFoundException exc) {
            System.err.println(exc.getMessage());
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
            consoleIn.close();
        }
    }
}
