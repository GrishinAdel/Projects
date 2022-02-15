package com.AdelGrishin;

public class Polygon extends Shape{
    Point point_1;
    Point point_2;
    Point point_3;
    Point point_4;
    Point point_5;


    Polygon(int x1, int y1, int x2, int y2,int x3, int y3, int x4, int y4, int x5, int y5, boolean background) {
        super(4, background);
        this.point_1 = new Point(x1, y1);
        this.point_2 = new Point(x2, y2);
        this.point_3 = new Point(x3, y3);
        this.point_4 = new Point(x4, y4);
        this.point_5 = new Point(x5, y5);

    }

    int[] get_all_x () {
        int[] array_x = new int[] {getX1(),getX2(),getX3(),getX4(),getX5()};
        return array_x;
    }

    int[] get_all_y () {
        int[] array_y = new int[] {getY1(),getY2(),getY3(),getY4(),getY5()};
        return array_y;
    }

    int getX1()
    {
        return point_1.Get_x();
    }

    int getY1()
    {
        return point_1.Get_y();
    }

    int getX2()
    {
        return point_2.Get_x();
    }

    int getY2()
    {
        return point_2.Get_y();
    }

    int getX3()
    {
        return point_3.Get_x();
    }

    int getY3()
    {
        return point_3.Get_y();
    }

    int getX4()
    {
        return point_4.Get_x();
    }

    int getY4()
    {
        return point_4.Get_y();
    }
    int getX5()
    {
        return point_5.Get_x();
    }

    int getY5()
    {
        return point_5.Get_y();
    }
}

