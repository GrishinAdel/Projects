package com.AdelGrishin;

import javax.swing.*;

public class Shape extends JComponent {
    private final int figure_type;
    private boolean background_type;

    Shape(int type) {
        this.figure_type = type;
    }

    int getX1()
    {
        return 0;
    }

    int getY1()
    {
        return 0;
    }

    int getX2()
    {
        return 0;
    }

    int getY2()
    {
        return 0;
    }

    int Get_x(){
        return 0;
    }

    int Get_y() {
        return 0;
    }

    Shape(int type, boolean background) {
        this.figure_type = type;
        this.background_type = background;
    }

    boolean get_Background() {
        return background_type;
    }

    int getType()
    {
        return figure_type;
    }

    int[] get_all_x () {
        int[] array_x = new int[] {};
        return array_x;
    }

    int[] get_all_y () {
        int[] array_y = new int[] {};
        return array_y;
    }
}


