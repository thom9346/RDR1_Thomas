package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class AllDucks {

     ArrayList<Queue<Integer>> generateDucks(int amountOfDucks){

        int numberedDuck = 0;

        Queue<Integer> myQueues = null;
        ArrayList<Queue<Integer>> myArray = new ArrayList<>();


        for (int i = 0; i < amountOfDucks ; i++) {
            myArray.add(myQueues = new LinkedList<>());

            while (myArray.get(i).size() != amountOfDucks) {

                numberedDuck++;
                myQueues.add(numberedDuck);

            }
        }

        return myArray;
    }


}
