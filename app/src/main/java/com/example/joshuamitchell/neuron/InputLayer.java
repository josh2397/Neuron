package com.example.joshuamitchell.neuron;

/**
 * Created by Joshua Mitchell on 6/10/2016.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class InputLayer extends Layer {

    public InputLayer initLayer(InputLayer inputLayer){
        //TODO - Initialize the input layer with pseudo random real numbers

        ArrayList<Double> listOfWeightInTemp = new ArrayList<Double>();
        ArrayList<Neuron> listOfNeurons = new ArrayList<Neuron>();

        for (int i = 0; i < inputLayer.getNumberOfNeuronsInLayer(); i++){
            Neuron neuron = new Neuron();

            listOfWeightInTemp.add(neuron.initNeuron());

            neuron.setListOfWeightIn(listOfWeightInTemp);
            listOfNeurons.add(neuron);
            listOfWeightInTemp = new ArrayList<Double>();
        }

        inputLayer.setListOfNeurons(listOfNeurons);

        return inputLayer;
    }

    public void printLayer(InputLayer inputLayer){
        //TODO - Print the input weights of the layer
        System.out.println("### INPUT LAYER ###");
        int n = 1;
        for (Neuron neuron : inputLayer.getListOfNeurons())
        {
            System.out.println("Neuron #" + n + ":");
            System.out.println("Input Weights: ");
            System.out.println(Arrays.deepToString(neuron.getListOfWeightIn().toArray()));
        }

    }
}

