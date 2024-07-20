// Defining a Point class to represent a point in 2-dimensional space

import java.util.Scanner;

public class Point {
    
    // x-coordinate of the point
    private int x;

    // y-coordinate of the point
    private int y;

    // Constructor for the Point class
    public Point(int x, int y) {
        this.x = x;  // Assigning x-coordinate of the point
        this.y = y;  // Assigning y-coordinate of the point
    }

    // Method to get the x-coordinate of the point
    public int getX() {
        return x;
    }

    // Method to get the y-coordinate of the point
    public int getY() {
        return y;
    }

    // TODO: Implement the method to move the point by dx and dy in x and y direction respectively
    public void move(int dx, int dy) {
        // Your code here
        this.x += dx;
        this.y += dy;
    }

    // TODO: Implement the method to calculate the distance from this point to another point
    public double distanceTo(Point other) {
        double p1 = (other.x - this.x)*(other.x - this.x);
        double p2 = (other.y - this.y)*(other.y - this.y);
        p1 = p1+p2;
        double ans = Math.sqrt(p1);
        return ans;
        // Your code here
    }

    public static void main(String[] args){
        System.out.println("Enter the cooridnates of a point in 2D");
        Scanner sc = new Scanner(System.in);
        int x1= sc.nextInt();
        int y1= sc.nextInt();
        Point obj1= new Point(x1,y1);
        Point obj2= new Point(x1,y1);
        System.out.println("Enter the displacement of point in 2D");
        int dx= sc.nextInt();
        int dy= sc.nextInt();
        obj2.move(dx, dy);
        System.out.println("2D coordinate of first point : ("+obj1.getX()+","+obj1.getY()+")");

        System.out.println("2D coordinate of first point after displacemet : ("+obj1.getX()+","+obj1.getY()+")");

        System.out.println("Distance between both points is "+obj1.distanceTo(obj2));
        sc.close();
    }
}

