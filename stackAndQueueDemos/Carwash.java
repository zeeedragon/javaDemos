package stackAndQueueDemos;

//generating random number 0-700
//if 0-50 - car
//51-699 - no car
//time for wash per car 70
//this model should work for 300 time units
//print at what time a car has entered the queue and how many cars are waiting

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

public class Carwash {
    public static void main(String[] args) {
        Random generate = new Random();
        LinkedBlockingQueue<Integer> cars = new LinkedBlockingQueue<>();
        int wash = 0; //timer for completing a single wash
        for (int time = 0; time <= 300; time++) {
            //car comes to the line and we have to log the time of entering the queue
            if (generate.nextInt(700) <= 50) {
                cars.add(time); //logging the time of arrival in queue
            }

            if (wash == 0) { //this means no car is waiting for wash
                if (!cars.isEmpty()) {
                    System.out.println("arrived at " + cars.remove() + " - " + "entered a wash at " + time);
                    wash = 70;
                }
            } else { //if the carwash is not empty - decrement counter
                wash--;
            }
        }
        System.out.println(cars.size() + " waiting");
    }
}
