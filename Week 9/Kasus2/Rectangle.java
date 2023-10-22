/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus2;

/**
 *
 * @author adria
 */
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        super("Rectangle");
        length = l;
        width = w;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}