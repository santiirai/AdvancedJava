/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class SimpleInterestImpl extends UnicastRemoteObject implements SimpleInterest {

    protected SimpleInterestImpl() throws RemoteException {
        super();
    }

    @Override
    public double calculateSI(double p, double t, double r) throws RemoteException {
        return (p * t * r) / 100;
    }
}

