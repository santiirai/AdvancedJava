/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import javax.swing.JFrame;

//WAP to create a frame
public class JFrameExample extends JFrame{
   JFrameExample(){
       setTitle("Example");//creates title
       setSize(400, 400);//size: width x height
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//decide what to do while closing
       setVisible(true);//makes frame visible
   } 
   public static void main(String[] args){
       JFrameExample e = new JFrameExample();
}

}
