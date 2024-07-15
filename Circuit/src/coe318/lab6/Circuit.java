/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;
import java.util.ArrayList;

/**
 *
 * @author Mohamed Khedr
 */
public class Circuit {
    
    ArrayList <Resistor>  resis = new ArrayList <Resistor> ();

private static Circuit instance = null;
public static Circuit getInstance() {
if (instance == null) { instance = new Circuit();
}
return instance;
}
private Circuit() {} //Yes, the constructor is PRIVATE!

public void add(Resistor r)
{ resis.add(r);
}
        @Override
  public String  toString(){
      String st = "";
      
      for (Resistor r : resis)
      {
          st = st + r + "\n";
      }
  return st;
  }

}