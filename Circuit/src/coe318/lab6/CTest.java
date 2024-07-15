/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author Mohamed Khedr
 */
public class CTest {
    public static void main(String[] args)
    {
        Circuit c = Circuit.getInstance();
        Node[] nodes=new Node[10];
       
        for(int i = 0 ; i<10 ; i++)
        {
           nodes[i] = new Node();
        } 
        Resistor[] rs =new Resistor[9];
        double v = 100;
         for(int j = 0 ; j<9 ; j++)
        {
        v+=200;
        rs[j] = new Resistor(v,nodes[j],nodes[j+1]);

        }
        for(Resistor resistor:rs)
        {
            c.add(resistor);
        }
        System.out.println(c);
      
    }
}
