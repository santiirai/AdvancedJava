/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

//import java.rmi.registry.LocateRegistry;
//import java.rmi.registry.Registry;
//
//public class Client {
//    public static void main(String[] args) {
//        try {
//            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
//            SimpleInterest si = (SimpleInterest) registry.lookup("SIService");
//
//            double principal = 75000.00;
//            double time = 7;
//            double rate = 6.2;
//
//            double result = si.calculateSI(principal, time, rate);
//            System.out.println("Simple Interest = " + result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1089);
            LargestNumber ln = (LargestNumber) registry.lookup("LargestService");

            int a = 10;
            int b = 25;
            int c = 15;

            int result = ln.findLargest(a, b, c);
            System.out.println("a = 10\nb = 25\nc = 15");
            System.out.println("Largest number = " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

