package com.company;

public class ColorableRectangle extends Rectangle implements IColorable {

    ColorableRectangle(){}

    ColorableRectangle(double width, double length){
        super(width, length);
    }

    @Override
    public void howToColor() {
        System.out.println("Color print on 4 side of rectangle");
    }
}
