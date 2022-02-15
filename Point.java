package com.AdelGrishin;

import java.util.Scanner;

public class Point extends Shape{
    private int x;
    private int y;

    Point(int x, int y) {
        super(0, false);
        this.x = x;
        this.y = y;
    }

    int Get_x(){
        return x;
    }

    int Get_y() {
        return y;
    }
}
