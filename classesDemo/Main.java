package classesDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        readStudent(arr, in);
        printStudent(arr);
        //System.out.println(findStudent(1001, arr));
        int numToFind = in.nextInt();
        int result = findStudent(numToFind, arr);
        if (result == -1) {
            System.out.println("Eror");
        } else {
            int status = arr.get(result).pass();
            switch (status) {
                case -1: {
                    System.out.println("No");
                    break;
                }
                case 0: {
                    System.out.println("OK " + arr.get(result).getYear());
                }
                default: {
                    System.out.println("No, " + status + " exams left");
                }
            }
        }
        ArrayList<Student> found = arr;
        printStudent(found);
        in.close();
    }

    public static void readStudent(ArrayList<Student> a, Scanner in) {
        int n = in.nextInt();
        //this is empty line to clean the buffer;
        String m = in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            Student st = new Student(name);
            a.add(st);
        }
    }

    public static void printStudent(ArrayList<Student> a) {
        for (Student currentStudent : a) {
            System.out.printf("%s:%d, %d kurs, %s, %.2f%n", currentStudent.getName(),
                    currentStudent.getFnum(),
                    currentStudent.getYear(),
                    Arrays.toString(currentStudent.getMarks()),
                    currentStudent.avg());
        }
    }

    public static int findStudent(int fnum, ArrayList<Student> a) {
        int n = a.size();
        int i = 0;
        while (i < n && a.get(i).getFnum() != fnum) {
            i++;
        }
        return i < n ? i : -1;
    }
}
