package softuni.priorityQueueDemo;

//sets the order of the queue - realizes Comparator
// (Comparator is the bearer of the order)

import java.util.Comparator;

public class ComparePatients implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2) {
        if (p1.getTemp() < p1.getTemp()) {
            return 1; //if they are ordered by acs
        }
        if (p1.getTemp() > p2.getTemp()) {
            return -1; //if they are ordered by desc
        }
        return 0; //this means none of the above went through
    }
}
