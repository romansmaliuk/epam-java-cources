package com.epam.university.java.core.task001;

public class Task001Impl implements Task001 {
    @Override
    public double addition(String firstNumber, String secondNumber) {
        try {
            if (firstNumber != null && secondNumber != null) {
                return Double.parseDouble(firstNumber.strip()) + Double.parseDouble(secondNumber.strip());
            } else {
                throw new IllegalArgumentException();
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
    }

    @Override
    public double subtraction(String firstNumber, String secondNumber) {
        try{
            if (firstNumber != null && secondNumber != null){
                return Double.parseDouble(firstNumber.strip()) - Double.parseDouble(secondNumber.strip());
            }else{
                throw new IllegalArgumentException();
            }
        }catch (NumberFormatException e){
            throw new NumberFormatException();
        }
    }

    @Override
    public double multiplication(String firstNumber, String secondNumber) {
        try{
            if (firstNumber != null && secondNumber != null){
                return Double.parseDouble(firstNumber.strip()) * Double.parseDouble(secondNumber.strip());
            }else{
                throw new IllegalArgumentException();
            }
        }catch (NumberFormatException e){
            throw new NumberFormatException();
        }
    }

    @Override
    public double division(String firstNumber, String secondNumber) {
        try{
            if (firstNumber != null && secondNumber != null){
                return Double.parseDouble(firstNumber.strip()) / Double.parseDouble(secondNumber.strip());
            }else{
                throw new IllegalArgumentException();
            }
        }catch (NumberFormatException e){
            throw new NumberFormatException();
        }
    }
}
