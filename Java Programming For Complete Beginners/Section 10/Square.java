import java.util.Scanner;

public class Square {

    private int side;

    public Square(int side) {
        // TODO: Initialize side with the passed value
        this.side = side;
    }

    public int calculateArea() {
        // TODO: Calculate and return the area of the square
        if(this.side <= 0){
            return -1;
        }
        return this.side*this.side;
    }

    public int calculatePerimeter() {
        // TODO: Calculate and return the perimeter of the square
        if(this.side <= 0){
            return -1;
        }
        return 4*this.side;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of a square");
        int side = sc.nextInt();
        Square obj =new Square(side);
        int area = obj.calculateArea();
        int perimeter=obj.calculatePerimeter();
        System.out.printf("Perimeter of square of side %d = %d",side,perimeter).println();        
        System.out.printf("Area of square of side %d = %d",side,area).println();
        sc.close();
    }

}
