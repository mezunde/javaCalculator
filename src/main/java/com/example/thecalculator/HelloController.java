package com.example.thecalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private TextField textField;
    @FXML
    private Text savedNumber;
    private String firstNumber = "";
    private String currentNumber = "";

    private String calculationType;


    @FXML
    public void subtract(ActionEvent event){
        calculationSetup("-");
    }
    @FXML
    public void add(ActionEvent event){
        calculationSetup("+");
    }
    @FXML
    public void divide(ActionEvent event){
        calculationSetup("/");
    }
    @FXML
    public void multiply(ActionEvent event){
        calculationSetup("*");
    }
    @FXML
    public void percent(ActionEvent event){
        calculationSetup("%");
    }

    @FXML
    public void calculate(ActionEvent event){
        int intFirstNumber = Integer.parseInt(firstNumber);
        int secondNumber = Integer.parseInt(currentNumber);

        switch (calculationType){
            case "+": {
                int result = intFirstNumber + secondNumber;
                savedNumber.setText(intFirstNumber + "+" + secondNumber);
                textField.setText(String.valueOf(result));
                break;
            }
            case "-": {
                if(intFirstNumber<secondNumber){
                    int result = secondNumber - intFirstNumber;
                    savedNumber.setText(intFirstNumber + "-" + secondNumber);
                    textField.setText("-" + String.valueOf(result));
                    break;
                }else {
                    int result = intFirstNumber - secondNumber;
                    savedNumber.setText(intFirstNumber + "-" + secondNumber);
                    textField.setText(String.valueOf(result));
                    break;
                }
            }
            case "/": {
                double result = intFirstNumber / (double)secondNumber;
                savedNumber.setText(intFirstNumber + "/" + secondNumber);
                textField.setText(String.valueOf(result));
                break;
            }
            case "*": {
                int result = intFirstNumber * secondNumber;
                savedNumber.setText(intFirstNumber + "*" + secondNumber);
                textField.setText(String.valueOf(result));
                break;
            }
        }
    }
    public void calculationSetup(String calculationType){
        this.calculationType = calculationType;
        firstNumber = currentNumber;
        currentNumber ="";
        savedNumber.setText(firstNumber + "" + calculationType);
    }
    @FXML
    void clearTextField(){
        currentNumber = "";
        textField.setText("");
        savedNumber.setText("");
    }
    @FXML
    public void buttonOne(ActionEvent event) {
        addDigit("1");
    }

    @FXML
    public void buttonTwo(ActionEvent event) {
        addDigit("2");
    }

    @FXML
    public void buttonThree(ActionEvent event) {
        addDigit("3");
    }

    @FXML
    public void buttonFour(ActionEvent event) {
        addDigit("4");
    }

    @FXML
    public void buttonFive(ActionEvent event) {
        addDigit("5");
    }

    @FXML
    public void buttonSix(ActionEvent event) {
        addDigit("6");
    }

    @FXML
    public void buttonSeven(ActionEvent event) {
        addDigit("7");
    }

    @FXML
    public void buttonEight(ActionEvent event) {
        addDigit("8");
    }

    @FXML
    public void buttonNine(ActionEvent event) {
        addDigit("9");
    }

    @FXML
    public void buttonZero(ActionEvent event) {
        if (!currentNumber.equals("")) {
            addDigit("0");
        }
    }

    public void updateTextField() {
        textField.setText(currentNumber);
    }
    public void addDigit(String number) {
        currentNumber += number;
        updateTextField();
    }
}
