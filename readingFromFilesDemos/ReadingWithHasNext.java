package softuni.readingFromFilesDemos;

//reads till whitespace symbol - space, tab, enter
//print each word on new line and total count of words using .hasNext()
//this reads file until meets whitespace and counts the words

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadingWithHasNext {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner consoleIn = new Scanner(System.in);
        System.out.println("Name of in-file:");
        String fileIn = consoleIn.nextLine();
        System.out.println("Name of out-file:");
        String fileOut = consoleIn.nextLine();

        Scanner in = null;
        PrintWriter out = null;

        try {
            File inputFile = new File(fileIn);
            in = new Scanner(inputFile);
            out = new PrintWriter(fileOut);
            int count = 0;

            int caps = 0;
            int small = 0;
            int digits = 0;
            int delims = 0;

            // set delimiters - splitting on what symbol
            // in.useDelimiter("[ ,.;]+");
            // set delimiters with defining all that consists
            // of letters and symbols as a word,
            // we are splitting based on sequences of allowed symbols
            // in.useDelimiter("[^A-Za-z0-9]+");
            // reading character by character = use delimiter ("")
            // between each empty string
            in.useDelimiter("");
            while (in.hasNext()) {
                String word = in.next();
                //this gets us the first char of each word
                char c = word.charAt(0);

                if (Character.isDigit(c)) {
                    digits++;
                } else if (Character.isLowerCase(c)) {
                    small++;
                } else if (Character.isUpperCase(c)) {
                    caps++;
                } else {
                    delims++;
                }
                //count+=1;
                //out.println(word);
            }
            //out.println(count);
            out.println("digits: " + digits);
            out.println("smalls: " + small);
            out.println("caps: " + caps);
            out.println("delimiters:" + delims);
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
