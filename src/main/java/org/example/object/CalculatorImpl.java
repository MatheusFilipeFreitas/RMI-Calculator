package org.example.object;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {

    public CalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public double sum(double a, double b) throws RemoteException {
        return a+b;
    }

    public double multi(double a, double b) throws RemoteException {
        return a*b;
    }

    public double div(double a, double b) throws RemoteException {
        if(b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a/b;
    }

    public double sub(double a, double b) throws RemoteException {
        System.out.println(a + " " + b);
        if(a < b) {
            System.out.println("Error");
            throw new ArithmeticException("Second parameter cannot be menor than the first parameter");
        }
        return a-b;
    }
}
