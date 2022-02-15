package com.AdelGrishin;

import java.awt.*;

public class Rectangle extends Shape{
    Point top_left;
    Point bottom_right;


    Rectangle(int x1, int y1, int x2, int y2, boolean background) {
        super(2, background);
        this.top_left = new Point(x1, y1);
        this.bottom_right = new Point(x2, y2);

    }

    int getX1()
    {
        return top_left.Get_x();
    }

    int getY1()
    {
        return top_left.Get_y();
    }

    int getX2()
    {
        return bottom_right.Get_x();
    }

    int getY2()
    {
        return bottom_right.Get_y();
    }

}



