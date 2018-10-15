package com.company;

public class ColorableCircle extends Circle implements IColorable{
    ColorableCircle(){}

    ColorableCircle(double radius){super(radius);}

    ColorableCircle(double radius, String color, boolean filled){
        super(radius, color, filled);
    }

    @Override
    public void howToColor() {
        System.out.println("Print color on 3 sides");
    }
}
