/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author Mohamed Khedr
 */
public class Node {
    private static int rcount = 0;
   private final int Id;
  public Node (){
   
      this.Id = rcount;
         rcount++;
  }
  public int getId()
  {
  return this.Id;}
 // @Override
  public boolean equals(Node n)
  {
 return this.Id == n.getId();
  }
    @Override
    public String toString()
    {
        return "n" + this.Id;
    }
}
