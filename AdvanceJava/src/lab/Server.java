/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

//import java.rmi.registry.LocateRegistry;
//import java.rmi.registry.Registry;
//
//public class Server {
//    public static void main(String[] args) {
//        try {
//            SimpleInterestImpl obj = new SimpleInterestImpl();
//            Registry registry = LocateRegistry.createRegistry(1099);
//            registry.rebind("SIService", obj);
//            System.out.println("Server is running...");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            LargestNumberImpl obj = new LargestNumberImpl();
            Registry registry = LocateRegistry.createRegistry(1089);
            registry.rebind("LargestService", obj);
            System.out.println("Server started...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
