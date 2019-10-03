
package whats.the.area;

/**
 *
 * Name: Stefano Candiani
 * Project Name: What's the area lab
 * Period: 7
 *  
 */

import java.util.Scanner;

public class WhatsTheArea {

private static Scanner in = new Scanner(System.in);
//    throughout all methods
    
    public static void main(String[] args) {
        int surfaceArea = 0;
        surfaceArea += triangle();
        surfaceArea += triangle();
        surfaceArea += square();
        surfaceArea -= square();
        surfaceArea += parallelogram();
        surfaceArea += circle();
        surfaceArea += circle();
        surfaceArea += circle();
        System.out.println("The surface Area of Michael's truck is = " + surfaceArea);
        
        
    }
    
    public static int triangle(){
    System.out.println("\nThe area of a triangle is: 1/2 *base *height ");
    System.out.print("base = ");
    int base = in.nextInt();
    System.out.print("height = ");
    int height = in.nextInt();
    int areaTr = (int)(0.5 * (base * height));
    System.out.println("The area of this shape is " +areaTr);
    return areaTr;
    }
    
    public static int square(){
        System.out.println("\n The area of a square is: length^2");
        System.out.print("Length = ");
        int length = in.nextInt();
        int areaSq = length*length;
        System.out.print("The area of this shape is : " + areaSq);
        return areaSq;
    }
    
    public static int parallelogram(){
        System.out.println("\n The area of a parallelogram is: Base * Height");
        System.out.print("Base = ");
        int basePa = in.nextInt();
        System.out.print("Height = ");
        int heightPa = in.nextInt();
        int areaPa = basePa * heightPa;
        System.out.println("The area of this Shape is: " +areaPa);
        return areaPa;
    }
    
    public static double circle(){
        System.out.println("\n The area of a circle is: pi * radius^2");
        System.out.print("Radius = ");
        double radius = in.nextDouble();
        double areaCl = (3.14 * (radius*radius));
        System.out.println("The area of this shape is " +areaCl);
        return areaCl;
             
    }
    
}
