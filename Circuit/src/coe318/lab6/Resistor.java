/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author Mohamed Khedr
 */
public class Resistor {
    static int rIdcount = 0;
  final  private double value;
final private Node [] nodes;
final private int Id;
 
    public Resistor(double resistance, Node node1, Node node2)
    {
                this.nodes = new Node[2];
        rIdcount++;
     this.Id = rIdcount;

        if (resistance < 0){
        throw new IllegalArgumentException("resistance can't be negative");}
                      else {    value = resistance;
}
              if (node1.equals(node2)){
        throw new IllegalArgumentException("Both ends of a resistor cannot be connected to the same node.");}
              else {    nodes[0] = node1;
    nodes[1] = node2;}
    }
 public Node [] getNodes()
 {
 return nodes;
 }
 @Override
public String toString()
{
return "R" + this.Id +" " + nodes[0] + " " + nodes[1] + " " + value + " " + "\n";

}

}
