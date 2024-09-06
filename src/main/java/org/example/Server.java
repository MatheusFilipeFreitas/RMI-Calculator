package org.example;

import org.example.object.Calculator;
import org.example.object.CalculatorImpl;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    String HOST_URL = "rmi://localhost/CalculatorImpl";

    public Server() {
        try {
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Calculator c = new CalculatorImpl();
            Naming.bind(HOST_URL, c);
            System.out.println("Server ready");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new Server();
    }
}
