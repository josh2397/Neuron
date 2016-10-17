package com.example.joshuamitchell.neuron;

/**
 * Created by Joshua Mitchell on 6/10/2016.
 */

import android.widget.TextView;

import java.util.ArrayList;

public class NeuralNet {
    private InputLayer inputLayer = new InputLayer();
    private HiddenLayer hiddenLayer = new HiddenLayer();
    private ArrayList<HiddenLayer> listOfHiddenLayer = new ArrayList<HiddenLayer>();
    private OutputLayer outputLayer = new OutputLayer();;
    private int numberOfHiddenLayers;

    TextView textView;

    public void initNet(){
        //TODO - Initialize the neural net as a whole. Layers are built, and each list of the weights of neurons is built randomly

        numberOfHiddenLayers = 1;

        //InputLayer inputLayer = new InputLayer();
        inputLayer.initLayer(inputLayer);

        for (int index = 1; index <= numberOfHiddenLayers; index++){

            HiddenLayer hiddenLayer = new HiddenLayer();
            hiddenLayer.initLayer(hiddenLayer, listOfHiddenLayer, inputLayer, outputLayer);
        }

        //OutputLayer outputLayer = new OutputLayer();
        outputLayer.initLayer(outputLayer);

    }

    public void printNet(){
        //TODO - Print the neural net as a whole. Each input and output weight of each layer is shown
        //textView = (TextView) (findViewById(R.id.buttonOutput));

        inputLayer.printLayer(inputLayer);
        hiddenLayer.printLayer(listOfHiddenLayer);
        outputLayer.printLayer(outputLayer);
    }
}

