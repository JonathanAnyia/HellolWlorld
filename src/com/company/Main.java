package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
 //      instantiation
      Physics physicsInstance = new Physics();

//    User Choice Input Reading
      System.out.println("Please input a number:\n 1 for kinetic energy\n 2 for potential energy\n 3 for momentum\n 4 for acceleration\n 5 for density");
      Scanner operationInput = new Scanner(System.in);
      byte operationSelector = operationInput.nextByte();
    }
}
