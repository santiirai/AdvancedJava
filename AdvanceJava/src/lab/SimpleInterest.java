/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SimpleInterest extends Remote {
    double calculateSI(double p, double t, double r) throws RemoteException;
}
