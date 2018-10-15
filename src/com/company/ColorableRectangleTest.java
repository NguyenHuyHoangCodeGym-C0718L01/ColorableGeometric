package com.company;

public class ColorableRectangleTest {
    public static void main(String[] args){
        Rectangle[] rectangles = new Rectangle[4];
        rectangles[0] = new ColorableRectangle();
        rectangles[1] = new ColorableRectangle(2,3);
        rectangles[2] = new Rectangle();
        rectangles[3] = new Rectangle(5,4);

        for(Rectangle rectangle : rectangles){
            System.out.println(rectangle.getArea());
            if(rectangle instanceof ColorableRectangle){
                ((ColorableRectangle) rectangle).howToColor();
            }
        }
    }
}
