package softuni.priorityQueueDemo;

//doctors office
//patients enter with number and temp
//temp between 36-42
//we generate new patient show up and we generate patient being served
//0 - 100 - service
//101 - 699 - show up of a new patient
//upon new patient arrival we print num, temp, and the queue
//upon service - print num and temp

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

public class DoctorsOffice {
    public static void main(String[] args) {
        Random rand = new Random();

        //object from class that realizes the method and we pass that object to the constructor
        Comparator<Patient> comp = new ComparePatients();
        PriorityQueue<Patient> queue = new PriorityQueue<Patient>(10, comp); //here we pass the object so we can use the comparison method we have created for patients
        int number = 1;
        for (int i = 0; i < 10; i++) {
            int currentTime = rand.nextInt(700);
            if (currentTime > 100) {
                addPatient(number, queue);
                number++;
            } else {
                removePatient(queue);
            }
        }
    }

    public static void addPatient(int number, PriorityQueue<Patient> q) {
        Random randGen = new Random();
        //double temp = tempGen.nextDouble() + tempGen.nextInt(6) + 36;
        //generates int between 360 and 420 -> 420 - 360 = 60 -> needs to be 61 in the Random call
        int tempInt = 360 + randGen.nextInt(61);
        double temp = (double) tempInt / 10;
        Patient pat = new Patient(number, temp);
        q.add(pat);
        System.out.println("in -> " + number + " - " + temp);
        printQ(q);
    }

    public static void removePatient(PriorityQueue<Patient> q) {
        if (!q.isEmpty()) {
            Patient currentPatient = q.remove();
            //if(currentPatient != null)
            System.out.println("out -> " + currentPatient.getNum() + " - " + currentPatient.getTemp());
            printQ(q);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public static void printQ(PriorityQueue<Patient> q) {
        Iterator<Patient> itr = q.iterator();
        while (itr.hasNext()) {
            Patient currentPatient = itr.next();
            System.out.print(currentPatient.getNum() + " - " + currentPatient.getTemp() + ";");
        }
        System.out.println();
    }
}
