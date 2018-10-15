package com.company;

public class ColorableSquare extends Square implements IColorable{

    ColorableSquare(){}

    ColorableSquare(double side){super(side);}

    ColorableSquare(double side, String color, boolean filled){
        super(side, color, filled);
    }

    @Override
    public void howToColor() {
        System.out.println("Print color on 4 sides");
    }
}
