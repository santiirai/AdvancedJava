/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class LargestNumberImpl extends UnicastRemoteObject implements LargestNumber {

    protected LargestNumberImpl() throws RemoteException {
        super();
    }

    @Override
    public int findLargest(int a, int b, int c) throws RemoteException {
        return Math.max(a, Math.max(b, c));
    }
}

