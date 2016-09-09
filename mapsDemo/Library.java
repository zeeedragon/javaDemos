package softuni.mapsDemo;

//info about books
//catalogue #, name, price
//methods for adding book, search by #, delete book, change of price;
//will contain class book

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Book {
    private String title;
    private double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setPrice(double price) {
        this.price = price;
    }

    String getTitle() {
        return title;
    }

    double getPrice() {
        return price;
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        HashMap<Integer, Book> map = new HashMap<>();

        do {
            System.out.println("1.Add");
            System.out.println("2.Search");
            System.out.println("3.Remove");
            System.out.println("4.Update price");
            System.out.println("5.Print list");
            System.out.println("6.Terminate");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    addBook(map, in);
                    break;
                case 2:
                    findBook(map, in);
                    break;
                case 3:
                    removeBook(map, in);
                    break;
                case 4:
                    updatePrice(map, in);
                    break;
                case 5:
                    printBook(map);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Inavalid input");
                    break;
            }

        } while (choice != 6);
    }

    public static void addBook(HashMap<Integer, Book> map, Scanner in) {
        System.out.println("Num ->");
        Integer num = in.nextInt();
        //from type Integer as it's used as key in map
        in.nextLine();
        System.out.println("Title ->");
        String title = in.nextLine();
        System.out.println("Price ->");
        double price = in.nextDouble();
        Book temp = new Book(title, price);
        map.put(num, temp);
    }

    public static void printBook(HashMap<Integer, Book> map) {
        Iterator<Map.Entry<Integer, Book>> itr = map.entrySet().iterator();
        //Map is a set of entries and iterator goes over each entry
        //map.entrySet returns a Set of the entries over which we iterate
        //entrySet can use foreach

        while (itr.hasNext()) {
            Map.Entry<Integer, Book> temp = itr.next();
            Integer key = temp.getKey();
            Book bookValue = temp.getValue();
            System.out.println(key + " -> \"" + bookValue.getTitle() + "\", " + bookValue.getPrice());
        }
    }

    public static void findBook(HashMap<Integer, Book> map, Scanner in) {
        //searching using Map keys, hence Integer
        Integer seekNum = in.nextInt();
        Book value = map.get(seekNum);
        if (value != null) {
            System.out.println("-> \"" + value.getTitle() + "\" " + value.getPrice());
        } else {
            System.out.println("No book found");
        }
    }

    public static void removeBook(HashMap<Integer, Book> map, Scanner in) {
        Integer seekNum = in.nextInt();
        System.out.println(map.remove(seekNum) != null ? "Book deleted" : "No book found");
    }

    public static void updatePrice(HashMap<Integer, Book> map, Scanner in) {
        //optional to use map.replace
        Integer num = in.nextInt();
        Book value = map.get(num);
        if (value != null) {
            System.out.print("Old price: " + value.getPrice() + ", New price: ");
            double newPrice = in.nextDouble();
            value.setPrice(newPrice);
            map.put(num, value);
        } else {
            System.out.println("No book found");
        }
    }
}
