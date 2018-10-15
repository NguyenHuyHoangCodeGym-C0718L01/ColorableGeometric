package com.company;

public class ColorableSquareTest {
    public static void main(String[] args){
        Square[] squares = new Square[4];
        squares[0] = new Square();
        squares[1] = new ColorableSquare();
        squares[2] = new ColorableSquare(2);
        squares[3] = new ColorableSquare(4, "white", true);

        for(Square square : squares){
            System.out.println(square.getArea());
            if(square instanceof ColorableSquare){
                ((ColorableSquare) square).howToColor();
            }
        }

    }
}
