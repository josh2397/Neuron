package com.example.joshuamitchell.neuron;

/**
 * Created by Joshua Mitchell on 6/10/2016.
 */

import android.widget.TextView;

import java.util.ArrayList;

public class NeuralNet {
    private InputLayer inputLayer;
    private HiddenLayer hiddenLayer;
    private ArrayList<HiddenLayer> listOfHiddenLayer;
    private OutputLayer outputLayer;
    private int numberOfHiddenLayers;

    TextView textView;

    public void initNet(){

        inputLayer = new InputLayer();
        inputLayer.setNumberOfNeuronsInLayer(2);

        numberOfHiddenLayers = 2;
        listOfHiddenLayer = new ArrayList<HiddenLayer>();
        for (int i = 1; i <= numberOfHiddenLayers; i++){

            hiddenLayer = new HiddenLayer();
            hiddenLayer.setNumberOfNeuronsInLayer(3);
            listOfHiddenLayer.add(hiddenLayer);
        }

        outputLayer = new OutputLayer();
        outputLayer.setNumberOfNeuronsInLayer(1);

        inputLayer = inputLayer.initLayer(inputLayer);

        listOfHiddenLayer = hiddenLayer.initLayer(hiddenLayer, listOfHiddenLayer, inputLayer, outputLayer);

        outputLayer = outputLayer.initLayer(outputLayer);

    }

    public void printNet(){
        //TODO - Print the neural net as a whole. Each input and output weight of each layer is shown
        //textView = (TextView) (findViewById(R.id.buttonOutput));

        inputLayer.printLayer(inputLayer);
        hiddenLayer.printLayer(listOfHiddenLayer);
        outputLayer.printLayer(outputLayer);
    }
}

