package com.company;

public class ColorableCircleTest {
    public static void main(String[] args){
        Circle[] circles = new Circle[4];
        circles[0] = new ColorableCircle();
        circles[1] = new Circle();
        circles[2] = new Circle(2);
        circles[3] = new ColorableCircle(3);

        for(Circle circle :  circles){
            System.out.println(circle.getArea());
            if(circle instanceof ColorableCircle){
                ((ColorableCircle) circle).howToColor();
            }
        }
    }
}
