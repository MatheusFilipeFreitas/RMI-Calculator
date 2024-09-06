package org.example.object;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    double sum(double a, double b) throws RemoteException;
    double sub(double a, double b) throws RemoteException;
    double div(double a, double b) throws RemoteException;
    double multi(double a, double b) throws RemoteException;
}
