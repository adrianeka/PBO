/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus2;

import java.text.DecimalFormat;

/**
 *
 * @author adria
 */
public class PaintThings {
    public static void main (String[] args){
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        
        Rectangle deck = new Rectangle(20, 35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);
        
        double deckAmt, ballAmt, tankAmt;
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);
        
        
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\n Number of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
