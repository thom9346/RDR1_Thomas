package com.company;

import java.util.*;

public class Race {

    private AllDucks allDucks = new AllDucks();
    private int arraySize = 10; //note: arraySize = how many timesteps you wish to have.
    private ArrayList<Queue<Integer>> arrayList = allDucks.generateDucks(arraySize);
    private int timeStep = 1;




public ArrayList<Queue<Integer>> resize(){


    boolean emptyArray = false;
    int arrayIndex = 0;


    /** Prints out current ducks*/
int sizeOfTimestep = arraySize*arrayList.size();

    if (sizeOfTimestep!=1) {

        System.out.println("This is how timestep " + timeStep + " looks like: "  );


    for (int i = 0; i < arrayList.size(); i++) {

        System.out.print(arrayList.get(i).toString() + ", ");

        System.out.println();

    }


        //gets random number thats equal to the indexes of the array
        Random random = new Random();
        int rdmNumber = random.nextInt(arrayList.size());


        /**remove 1 duck from each queue*/
        for (int i = 0; i < arrayList.size(); i++) {

            if (!arrayList.get(i).isEmpty()) {
                arrayList.get(i).remove();
            }

        }


        /**get a new random queue and transfer that duck to another random queue*/

        int rdmNumber2 = random.nextInt(arrayList.size());
        int rdmNumber3 = random.nextInt(arrayList.size());


        if(arrayList.size() !=1) {
            while(rdmNumber2==rdmNumber3) {
                rdmNumber3 = random.nextInt(arrayList.size());
            }

        }


        Integer rdmDuck = arrayList.get(rdmNumber2).peek();
        Integer otherRdmDuck = arrayList.get(rdmNumber3).peek();



        //takes the random queue from two different queues and basically swaps them
        arrayList.get(rdmNumber3).add(rdmDuck);
        arrayList.get(rdmNumber2).add(otherRdmDuck);

        if (!arrayList.get(rdmNumber2).isEmpty()) {
            arrayList.get(rdmNumber3).remove();
            arrayList.get(rdmNumber2).remove();
        }


        /**remove random queue from 1-10*/
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).isEmpty()) {
                emptyArray = true;
                arrayIndex = i;
            }
        }


        if (emptyArray){
            arrayList.remove(arrayIndex);
        }
        else
            arrayList.remove(rdmNumber);



    //changes values
    arraySize = arraySize - 1;

    timeStep++;




    return resize();


}
else {

        System.out.println("And finally the winner duck(Timestep " + timeStep + "):");
        System.out.println("Number: "+ arrayList.toString() + "!");
        return arrayList;
    }

}


}
