package com.company;

public class Maths {
    float pi = 22/7;
    float powerOfTwo(int number){
        return number^2;
    }
      float multiply(float numberOne, float numberTwo){
        return numberOne * numberTwo;
      }
      float divide(float numberOne, float numberTwo){
        return numberOne / numberTwo;
      }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }
}