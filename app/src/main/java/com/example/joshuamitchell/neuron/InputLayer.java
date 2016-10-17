package com.example.joshuamitchell.neuron;

/**
 * Created by Joshua Mitchell on 6/10/2016.
 */


public class InputLayer extends Layer {

    public void initLayer(InputLayer inputLayer){
        //TODO - Initialize the input layer with pseudo random real numbers
        //InputLayer inputLayer1 = new InputLayer();
        super.setNumberOfNeuronsInLayer(1);
        super.getListOfNeurons();

//        for (int index = 1; index<= super.getNumberOfNeuronsInLayer(); index++ )
//        {
//            Neuron.initNeuron
//        }

    }

    public void printLayer(InputLayer inputLayer){
        //TODO - Print the input weights of the layer
        System.out.println("### INPUT LAYER ###");
        for (int index = 0; index <= 1; index++)
        {
            System.out.println("Neuron #" + (index+1) + ":");
            System.out.println(super.getListOfNeurons());
        }

    }
}

