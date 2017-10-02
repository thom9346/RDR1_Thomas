package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class AllDucks {

     ArrayList<Queue<Integer>> generateDucks(){

        int numberedDuck = 0;

        Queue<Integer> myQueues = null;
        ArrayList<Queue<Integer>> myArray = new ArrayList<>();


        for (int i = 0; i < 10 ; i++) {
            myArray.add(myQueues = new LinkedList<>());

            while (myArray.get(i).size() != 10) {

                numberedDuck++;
                myQueues.add(numberedDuck);

            }
        }

        return myArray;
    }


}
