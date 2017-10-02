package com.company;

import java.util.*;

public class RemoveDucks {

    private int timestep = 1;

    public Queue<Duck> resizeDucks(ArrayList<Queue<Duck>> duckArray, int arraySize, int queueSize){

        /**
         * First we start by having 10arrays*10queues
         * Then 9*9, 8*8,7*7,6*6
         */

        Queue<Duck> duckQ = new LinkedList<>();


        Random random = new Random();

        //this starts with 100(10*10), next time the size should be 81(9*9), then 64(8*8) and so on...
        int sizeOfTimestep = arraySize * queueSize;

        if(sizeOfTimestep!=1) {




            int randomNumber = random.nextInt(arraySize);

            int randomIndex = random.nextInt(arraySize);

            Queue<Duck> rdmDuckQueue = duckArray.get(randomNumber);



            Duck currentDuck = rdmDuckQueue.remove();

            //adds rdm duck to rdm queue
           duckArray.get(randomIndex).add(currentDuck);

           //above travels one rdm duck from a rdm queue to anoter rdm queue
            ArrayList<Queue<Duck>> tempArray = new ArrayList<>();
            Queue<Duck> tempQueue = new LinkedList<>();


            System.out.println("Here's all the ducks left from timestep " + timestep + ": (size:" + sizeOfTimestep + ")");



            for (int i = 0; i < arraySize; i++) {

                //int currentSize = ducks.get(i).size();
                tempArray.add(duckArray.get(i));

                System.out.print("in queue " + i + " there are the ducks: ");
                for (int j = 0; j < queueSize; j++) {

                    System.out.print(duckArray.get(i).toString() + ", " + i);

                }
                System.out.println();

            }
//                int currentRdmArray = random.nextInt(arraySize);
//
//                duckQ.add(duckArray.get(currentRdmArray).element());
//
//
//
//                //adds random array to the temp array
//
//                System.out.print(duckQ.remove().getNumberDuck() + ", ");

//
//                int currentRdmArray = random.nextInt(arraySize);
//
//                Duck thisDuck = duckArray.get(currentRdmArray).element();
//                duckQ.add(thisDuck);
//
////                duckArray.get(currentRdmArray).remove();
//
//                //duckQ.add(duckArray.get(currentRdmArray).element());
//
//                //adds random array to the temp array
//
//                System.out.print(duckQ.remove().getNumberDuck() + ", ");
//
//               duckArray.get(currentRdmArray).remove();
//
//
//            }
//
//            System.out.println(duckQ.size());

            //following makes one duck go from one random queu to another random queu(or the same, if you're unlucky)

//
//                //picks out a random queues index
//                int randomQueue = random.nextInt(queueSize);
//
//
//                //adds the random queue to the temparray.
////                tempArray.add(duckArray.get(randomQueue));
//
//                //gets a new random index
//                int randomInsertionQueue = random.nextInt(queueSize);
//
//                //ensures that it doesnt take from the same random number as before and puts it in the same queue
//                while(randomQueue==randomInsertionQueue){
//                    int newRandom = random.nextInt(queueSize);
//                    randomInsertionQueue = newRandom;
//                }
//
//
//                //adds the specific duck to specific index (index, duck)
//                duckArray.add(randomInsertionQueue, duckArray.get(randomQueue));
//
//
//
//                //removes the last(first inserted) duck from the duckarray
//                duckArray.get(randomQueue).remove();



            arraySize = arraySize -1;
            queueSize = queueSize -1;
            timestep++;

            return resizeDucks(duckArray,arraySize,queueSize);
        }

        else
            System.out.println();
            return duckQ;



            }

        }



