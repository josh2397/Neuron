package com.example.joshuamitchell.neuron;

/**
 * Created by Joshua Mitchell on 6/10/2016.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Neuron {
    private ArrayList<Double> listOfWeightIn;
    private ArrayList<Double> listOfWeightOut;

    public Double initNeuron(){


        Random randomDouble = new Random();
        return randomDouble.nextDouble();

    }

    public void setListOfWeightIn(ArrayList<Double> listOfWeightIn){

        this.listOfWeightIn = listOfWeightIn;
    }

    public void setListOfWeightOut(ArrayList<Double> listOfWeightOut){

        this.listOfWeightOut = listOfWeightOut;
    }

    public ArrayList<Double> getListOfWeightIn(){

        return listOfWeightIn;
    }

    public ArrayList<Double> getListOfWeightOut(){

        return listOfWeightOut;
    }
}

