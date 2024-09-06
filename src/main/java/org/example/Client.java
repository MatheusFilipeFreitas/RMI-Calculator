package org.example;

import org.example.object.Calculator;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
            Calculator c = (Calculator) Naming.lookup("rmi://localhost/CalculatorImpl");
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("\n=== Menu de Operações ===");
                System.out.println("1. Soma");
                System.out.println("2. Subtração");
                System.out.println("3. Divisão");
                System.out.println("4. Multiplicação");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");

                int opcao = scanner.nextInt();
                double a, b;
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o primeiro número: ");
                        a = scanner.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        b = scanner.nextDouble();
                        System.out.println("Resultado da soma: " + c.sum(a, b));
                        break;

                    case 2:
                        System.out.print("Digite o primeiro número: ");
                        a = scanner.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        b = scanner.nextDouble();
                        try {
                            System.out.println("Resultado da subtração: " + c.sub(a, b));
                        } catch (RemoteException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;

                    case 3:
                        System.out.print("Digite o primeiro número: ");
                        a = scanner.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        b = scanner.nextDouble();
                        try {
                            System.out.println("Resultado da divisão: " + c.div(a, b));
                        } catch (RemoteException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;

                    case 4:
                        System.out.print("Digite o primeiro número: ");
                        a = scanner.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        b = scanner.nextDouble();
                        System.out.println("Resultado da multiplicação: " + c.multi(a, b));
                        break;

                    case 5:
                        running = false;
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida, tente novamente.");
                        break;
                }
            }

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
