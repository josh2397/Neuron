package com.example.joshuamitchell.neuron;

/**
 * Created by Joshua Mitchell on 6/10/2016.
 */


public class OutputLayer extends Layer{

    public void initLayer(OutputLayer outputlayer){
        //TODO - initialize the output layer with pseudo random real numbers

        super.setNumberOfNeuronsInLayer(0);
        super.getListOfNeurons();



    }

    public void printLayer(OutputLayer outputLayer){
        //TODO - Print the weights of the layer
        System.out.println("### OUTPUT LAYER ###");
        for (int index = 1; index <= 1; index++)
        {
            System.out.println("Neuron #" + index + ":");
            System.out.println("OutPut Weights:");
            System.out.println();

        }

    }
}

