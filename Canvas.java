package com.AdelGrishin;

import javax.swing.JFrame;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Canvas extends JPanel {
    private static final long serialVersionUID = 1L;

    @Override
    public void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);

            setBackground(Color.BLACK); // Фон консоли

            Color newColor1 = new Color(255, 0, 255);
            Color newColor2 = new Color(0, 0, 255);
            Color newColor3 = new Color(0, 255, 255);

            for (int i = 0; i < Main.count; i++) {
                graphics.setColor(Color.GREEN);
                if (Main.figures.get(i).getType() == 0) { // точка
                    graphics.fillOval(Main.figures.get(i).Get_x(), Main.figures.get(i).Get_y(), 1,1);
                }
                else if (Main.figures.get(i).getType() == 1) { // линия
                    graphics.drawLine(Main.figures.get(i).getX1(), Main.figures.get(i).getY1(),Main.figures.get(i).getX2(),Main.figures.get(i).getY2());
                } else if (Main.figures.get(i).getType() == 2) { // прямоугольник
                    if (Main.figures.get(i).get_Background() == true) {
                        graphics.setColor(newColor1);
                        graphics.fillRect(Main.figures.get(i).getX1(), Main.figures.get(i).getY1(),
                                (Main.figures.get(i).getX2()) - (Main.figures.get(i).getX1()), (Main.figures.get(i).getY2()) - (Main.figures.get(i).getY1()));
                    } else graphics.drawRect(Main.figures.get(i).getX1(), Main.figures.get(i).getY1(),
                                Main.figures.get(i).getX2()-Main.figures.get(i).getX1(),Main.figures.get(i).getY2()-Main.figures.get(i).getY1());
                } else if (Main.figures.get(i).getType() == 3) { // эллипс
                    if (Main.figures.get(i).get_Background() == true) { graphics.setColor(newColor2);
                        graphics.fillOval(Main.figures.get(i).getX1(),Main.figures.get(i).getY1(),
                                Main.figures.get(i).getX2()-Main.figures.get(i).getX1(),Main.figures.get(i).getY2()-Main.figures.get(i).getY1());
                    }
                    else { graphics.drawOval(Main.figures.get(i).getX1(),Main.figures.get(i).getY1(),
                                Main.figures.get(i).getX2()-Main.figures.get(i).getX1(),Main.figures.get(i).getY2()-Main.figures.get(i).getY1());
                    }
                } else if (Main.figures.get(i).getType() == 4) { // многоугольник
                    if (Main.figures.get(i).get_Background() == false) graphics.drawPolygon(Main.figures.get(i).get_all_x(),Main.figures.get(i).get_all_y(),5);
                    else { graphics.setColor(newColor3);
                        graphics.fillPolygon(Main.figures.get(i).get_all_x(),Main.figures.get(i).get_all_y(),5);
                    }
                } else {}
            }

    }
}
