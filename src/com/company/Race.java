package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Race {

    private AllDucks allDucks = new AllDucks();
    private ArrayList<Queue<Integer>> arrayList = allDucks.generateDucks();
    private int timeStep = 1;
    private Queue<Integer> tempQueue = new LinkedList<>();



public ArrayList<Queue<Integer>> resize(int arraySize){

int sizeOfTimestep = arraySize*arrayList.size();

    if (sizeOfTimestep!=1) {

        System.out.println("This is how timestep " + timeStep + " looks like: "  );


    for (int i = 0; i < arrayList.size(); i++) {

        System.out.print(arrayList.get(i).toString() + ", ");

        System.out.println();

    }


    /**remove random queue from 1-10*/
        //gets random number thats equal to the indexes of the array
        Random random = new Random();
        int rdmNumber = random.nextInt(arrayList.size());

        //removes the random index number from the array(the random queue)
        arrayList.remove(rdmNumber);


        /**remove 1 duck from each queue*/
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).remove();
        }


        /**get a new random queue and transfer that duck to another random queue*/

        int rdmNumber2 = random.nextInt(arrayList.size());
        int rdmNumber3 = random.nextInt(arrayList.size());


        if(arrayList.size() !=1) {
            while(rdmNumber2==rdmNumber3) {
                rdmNumber3 = random.nextInt(arrayList.size());
            }

        }

//        while (rdmNumber2==rdmNumber3) {
//            rdmNumber2 = random.nextInt(arrayList.size());
//        }

        //makes sure the two random numbers cant be the same

        Integer rdmDuck = arrayList.get(rdmNumber2).peek();
//tempQueue.add(rdmDuck);
        //takes the new random index in the array and adds that duck there

        arrayList.get(rdmNumber3).add(rdmDuck);
        arrayList.get(rdmNumber2).remove();

    //changes values
    arraySize = arraySize - 1;

    timeStep++;


    return resize(arraySize);


}
else {
        System.out.println("And finally the winner duck: ");
        System.out.println("Number: "+ arrayList.get(0).peek() + "!");
        return arrayList;
    }

}


}
