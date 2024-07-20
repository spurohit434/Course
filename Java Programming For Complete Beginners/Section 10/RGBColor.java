
// RGBColor class representing a color using Red Green Blue (RGB) model.

import java.util.Scanner;

public class RGBColor {
    
    // The Red, Green, Blue color values range from 0 to 255.
    private int red;
    private int green;
    private int blue;

    // Constructor for RGBColor class which initializes the color with provided red, green and blue values.
    public RGBColor(int red, int green, int blue) {
        // write your code here
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    // Getter method to get the red value of the color.
    public int getRed() {
        // write your code here
        return this.red;
    }

    // Getter method to get the green value of the color.
    public int getGreen() {
        // write your code here
        return this.green;
        
    }

    // Getter method to get the blue value of the color.
    public int getBlue() {
        // write your code here
        return this.blue;
    }

    // Method to invert the color. The inversion is done by subtracting each color component from 255.
    public void invert() {
        // write your code here
        this.red = 255-this.red;
        this.green = 255-this.green;
        this.blue = 255-this.blue;
    }

    public static void main(String[] args){
        int red,green,blue;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a RGB color values");
        red=sc.nextInt();
        green=sc.nextInt();
        blue=sc.nextInt();

        RGBColor obj = new RGBColor(red, green, blue);

        System.out.printf("RBG value of input color is (%d,%d,%d)",obj.red,obj.green,obj.blue).println();
        obj.invert();
        System.out.printf("RBG value of inverted color is (%d,%d,%d)",obj.red,obj.green,obj.blue).println();


        sc.close();
    }
}
