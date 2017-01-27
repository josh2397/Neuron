package com.example.joshuamitchell.neuron;

/**
 * Created by Joshua Mitchell on 6/10/2016.
 */

import java.util.ArrayList;

public abstract class Layer {
    private ArrayList<Neuron> listOfNeurons = new ArrayList<Neuron>(); //ArrayList variable of objects of the Neuron class
    public int numberOfNeuronsInLayer;

    public ArrayList<Neuron> getListOfNeurons(){
        //TODO - return the list of neurons by layer
        for(int index = 0; index <= numberOfNeuronsInLayer; index++){
            listOfNeurons.add(new Neuron());
        }
        return listOfNeurons;
    }

    public void setListOfNeurons(ArrayList<Neuron> listOfNeurons){
        //TODO - Set the listOfNeurons function with an ArrayList variable of objects of the Neuron class

    }

    public int getNumberOfNeuronsInLayer(){
        //TODO - return the number of neurons by layer

        return numberOfNeuronsInLayer;
    }

    public void setNumberOfNeuronsInLayer(int numberOfNeuronsInLayer){
        //TODO - Set the number of neurons in a layer
        this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;
    }
}

