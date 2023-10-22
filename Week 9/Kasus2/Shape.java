/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus2;

/**
 *
 * @author adria
 */
abstract class Shape {
    protected String shapeName;
    
    public Shape(String name){
        shapeName = name;
    }
    
    public abstract double area();
    
    @Override
    public String toString()
   {
      return "Name: " + shapeName + "\n";
   }
}
