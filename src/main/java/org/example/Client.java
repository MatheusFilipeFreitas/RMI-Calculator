package org.example;

import org.example.object.Calculator;

import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
            Calculator c = (Calculator) Naming.lookup("rmi://localhost/CalculatorImpl");
            System.out.println("Summing = " + c.sum(5.0, 5.0));
            System.out.println("Subbing = " + c.sub(5.0, 15.0));
            System.out.println("Dividing = " + c.div(20.0, 10.0));
            System.out.println("Multiplying = " + c.multi(5.0, 3.0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
