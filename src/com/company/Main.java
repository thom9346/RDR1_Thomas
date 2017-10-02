package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    /**
     * Dette program virker ikke 100% korrekt, men har brugt over 10 timer på det, og kan ikke få løst det. Synes det er værd at sende alligevel,
     * så du kan se der faktisk er blevet brugt tid på det.
     */
    public static void main(String[] args) {



  Race race = new Race();
  race.resize(10);

//
//
//
//
//
//
//
//        int generation = 1;
//        int numberedDuck = 0;
//
//        Random rng = new Random();
//        Queue<Duck> myQueues = null;
//        ArrayList<Queue<Duck>> myArray = new ArrayList<>();
//
//
//        AllDucks allDucks = new AllDucks();
//
//       ArrayList<Queue<Duck>> ducks = allDucks.generateDucks();
//
//
//        RemoveDucks removeDucks = new RemoveDucks();
//
////
////
//      //  System.out.println(removeDucks.resizeDucks(ducks,10,10));
//
////        for (int i = 0; i < ducks.size(); i++) {
////
////            int currentSize = ducks.get(i).size();
////
////            System.out.print("in queue " + i + " there are the ducks: ");
////            for (int j = 0; j < currentSize; j++) {
////
////                System.out.print(ducks.get(i).poll().getNumberDuck() + ", ");
////            }
////            System.out.println();
////        }
//
//
////        for (int i = 0; i < 10 ; i++) {
////            myArray.add(myQueues = new LinkedList<>());
////            while (myArray.get(i).size() != 10) {
////
////                numberedDuck++;
////                myQueues.add(new Duck(numberedDuck));
////
////            }
////        }
////
////        int timestep = 1;
////        int sizeOfTimeStep = myArray.size() * myQueues.size();
////
////
////        while (timestep != 9) {
////            System.out.println("We are at gen: " + generation + ',' + " We have this many ducks left " + sizeOfTimeStep);
////            ArrayList<Duck> tempHolder = new ArrayList<>();
////            timestep++;
////            sizeOfTimeStep = (myArray.size() - 1) * (myQueues.size() - 1);
////
////
////            for (int i = 0; i < sizeOfTimeStep ; i++) {
////
////                int myIndex = rng.nextInt(myArray.size());
////                tempHolder.add(i, myArray.get(myIndex).poll());
////
////            }
////
////            for (int i = 0; i < tempHolder.size(); i++) {
////                System.out.println(tempHolder);
////            }
////            System.out.println(myArray.size() + " " + myQueues.size());
////            System.out.println(tempHolder.size());
////
////
////            for (int i = 0; i < myArray.size() ; i++) {
////                myArray.get(i).clear();
////            }
////
////            //inserts all queues randomly in the array (in a random index)
////            for (int i = 0; i < sizeOfTimeStep; i++) {
////                myArray.get(rng.nextInt(myArray.size())).add(tempHolder.get(i));
////            }
////
////            generation++;
////        }

    }
}
