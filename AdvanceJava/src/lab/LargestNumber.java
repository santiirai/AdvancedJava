/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LargestNumber extends Remote {
    int findLargest(int a, int b, int c) throws RemoteException;
}
