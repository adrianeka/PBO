/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Exerecise2;

/**
 *
 * @author adria
 */
public class Circle extends Shape{ 

    // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    
     // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
    }

    /** Constructs a Circle instance with the given radius and default color
     * @param r */
    public Circle(double r) { // 2nd constructor
        radius = r;
    }
    
    public Circle(double r, String color, boolean filled) {
        super(color, filled);
        radius = r;
    }

    /** Returns the radius
     * @return  */
 
    public double getRadius() {
        return radius;
    } 
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Returns the area of this Circle instance
     * @return  */
    public double getArea() {
        return radius*radius*Math.PI;
    }
    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
            
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
