package com.example.joshuamitchell.neuron;

/**
 * Created by Joshua Mitchell on 6/10/2016.
 */

import java.util.ArrayList;

public class HiddenLayer extends Layer {

    public ArrayList<HiddenLayer> initLayer(HiddenLayer hiddenLayer, ArrayList<HiddenLayer> listOfHiddenLayer, InputLayer inputLayer, OutputLayer outputLayer){
        //TODO - Initialize the hidden layer(s) with pseudo random real numbers


        super.setNumberOfNeuronsInLayer(2);
        super.getListOfNeurons();

        listOfHiddenLayer.add(new HiddenLayer());

        return listOfHiddenLayer;



    }

    public void printLayer(ArrayList<HiddenLayer> listOfHiddenLayer){
        //TODO - Print the weights of the layer(s)
        System.out.println("### HIDDEN LAYER ###");
        System.out.println("Hidden Layer: #1");
        for (int index = 0; index <= 2; index++){
            System.out.println("Neuron #" + (index+1));
            System.out.println("Input Weights: "); //+ listOfHiddenLayer.get(index));
        }

    }
}

