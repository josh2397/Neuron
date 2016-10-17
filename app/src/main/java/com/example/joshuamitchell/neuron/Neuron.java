package com.example.joshuamitchell.neuron;

/**
 * Created by Joshua Mitchell on 6/10/2016.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Neuron {
    private ArrayList<Double> listOfWeightIn;
    private ArrayList<Double> listOfWeightOut;// = new ArrayList<Double>(Arrays.asList());

    public static Double initNeuron(){
        //TODO - Initialize listOfWeightIn and listOfWeightOut function with a pseudo random real number
        ArrayList<Double> listOfWeightIn = new ArrayList<Double>(Arrays.<Double>asList());
        ArrayList<Double> listOfWeightOut = new ArrayList<Double>(Arrays.<Double>asList());
        Random randomDouble = new Random();
//        for (int i = 0; i <= 1; i++){
//        listOfWeightIn.add(randomDouble.nextDouble());
//        }
        double ranDouble = randomDouble.nextDouble();
        //listOfWeightIn = ranDouble
        return ranDouble;

    }

    public void setListOfWightIn(ArrayList<Double> listOfWeightIn){
        //TODO - Set the listOfWeightIn function with a list of real numbers list
        this.listOfWeightIn = listOfWeightIn;
    }

    public void setListOfWeightOut(ArrayList<Double> listOfWeightOut){
        //TODO - Set the listOfWeightOut function with a list of real numbers list
        this.listOfWeightOut = listOfWeightOut;
    }

    public ArrayList<Double> getListOfWeightIn(){
        //TODO - Return the list of real numbers stored in the listOfWeightIn variable.
        return listOfWeightIn;
    }

    public ArrayList<Double> getListOfWeightOut(){
        //TODO - return the list of real numbers stored in the listOfWeightOut variable
        return listOfWeightOut;
    }
}

