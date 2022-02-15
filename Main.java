package com.AdelGrishin;

import javax.swing.JFrame;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class Main extends JFrame {

    public static final int SAMPLE_CANVAS_WIDTH = 700; // ширина приложения
    public static final int SAMPLE_CANVAS_HEIGHT = 500;  // высота приложения

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = 0;
        while (number != 6) {
            number = Start();
            switch (number) {
                case 1:
                    Сhoice_next();
                    break;
                case 2:
                    Info_Array();
                    Delete_el();
                    break;
                case 3:
                    Clear_Array();
                    break;
                case 4:
                    Info_Array();
                    break;
                case 5:
                    Show();
                    break;
                case 6:
                    Clear_Array();
                    System.out.println("Программа завершила свою работу!");
                    System.exit(0);
                default:
                    break;
                }
           }
    }

    private Canvas sampleCanvas = new Canvas();

    public Main() {
            sampleCanvas.setPreferredSize(new Dimension(SAMPLE_CANVAS_WIDTH, SAMPLE_CANVAS_HEIGHT));
            Container containerPane = getContentPane();
            containerPane.add(sampleCanvas);

            pack(); // раскрывает консоль

            setTitle("Application_Grishin_Adel"); // название консоли

            setVisible(true); // запускает консоль
        }

        static int Start() {
            Scanner in = new Scanner(System.in);
            String num = "null";
            boolean check = false;
            while (!num.matches("[-+]?\\d+") && check != true) {
            if (num.matches("[-+]?\\d+")) {
                if (Integer.parseInt(num) <= 6 && Integer.parseInt(num) >= 1) check = true;
            }
                System.out.println();
                System.out.println("Выберите желаемую функцию:");
                System.out.println("1) Добавить объект");
                System.out.println("2) Удалить объект");
                System.out.println("3) Очистить список");
                System.out.println("4) Вывод информации об объектах находящихся в списке");
                System.out.println("5) Показать объекты");
                System.out.println("6) Закончить работу программы");
                System.out.println();

                num = in.next();

            }
            return Integer.parseInt(num);
        }

        public static void Сhoice_next() {
            Scanner in = new Scanner(System.in);
            System.out.println("Какую фигуру желаете добавить?");
            System.out.println("1) Точку");
            System.out.println("2) Отрезок");
            System.out.println("3) Прямоугольник");
            System.out.println("4) Эллипс");
            System.out.println("5) Многоугольник");

            String choice = in.next();

            if (choice.equals("3") || choice.equals("4") || choice.equals("5")) {
                String choice_inside = "0";
                while (!choice_inside.equals("1") && !choice_inside.equals("2")) {
                    System.out.println("C заливкой?");
                    System.out.println("1) Да");
                    System.out.println("2) Нет");
                    choice_inside = in.next();
                }
                boolean color;
                if (choice_inside.equals("1")) color = true;
                else color = false;
                ADD((Integer.parseInt(choice))-1, color);
            } else if (choice.equals("1") || choice.equals("2")) {
                ADD((Integer.parseInt(choice))-1, false);
            }
            else Сhoice_next();
        }

    static ArrayList<Shape> figures = new ArrayList<>(0);

    static int count = 0;

    static void ADD(int figure, boolean background) {
        Scanner in = new Scanner(System.in);
        if (figure==0) {
            String X1 = "value";
            while (!(X1.matches("[-+]?\\d+"))) {
                System.out.println("Введите значение X: ");
                X1 = in.next();
            }
            String Y1 = "value";
            while (!(Y1.matches("[-+]?\\d+"))) {
                System.out.println("Введите значение Y: ");
                Y1 = in.next();
            }
                figures.add(count, new Point(Integer.parseInt(X1),Integer.parseInt(Y1)));
        } else  if (figure==1) {
            String X1 = "value";
            while (!X1.matches("[-+]?\\d+")) {
                System.out.println("Введите значение X1: ");
                X1 = in.next();
            }
            String Y1 = "value";
            while (!Y1.matches("[-+]?\\d+")) {
                System.out.println("Введите значение Y1: ");
                Y1 = in.next();
            }

            String X2 = "value";
            while (!X2.matches("[-+]?\\d+")) {
                System.out.println("Введите значение X2: ");
                X2 = in.next();
            }
            String Y2 = "value";
            while (!Y2.matches("[-+]?\\d+")) {
                System.out.println("Введите значение Y2: ");
                Y2 = in.next();
            }

            figures.add(count, new Line(Integer.parseInt(X1),Integer.parseInt(Y1), Integer.parseInt(X2),Integer.parseInt(Y2)));
        } else  if (figure==2) {
            String X1 = "value";
            while (!(X1.matches("[-+]?\\d+"))) {
                System.out.println("Введите значение X1: ");
                X1 = in.next();
            }
            String Y1 = "value";
            while (!Y1.matches("[-+]?\\d+")) {
                System.out.println("Введите значение Y1: ");
                Y1 = in.next();
            }

            String X2 = "value";
            while (!X2.matches("[-+]?\\d+")) {
                System.out.println("Введите значение X2: ");
                X2 = in.next();
            }
            String Y2 = "value";
            while (!Y2.matches("[-+]?\\d+")) {
                System.out.println("Введите значение Y2: ");
                Y2 = in.next();
            }
            figures.add(count, new Rectangle(Integer.parseInt(X1),Integer.parseInt(Y1), Integer.parseInt(X2),Integer.parseInt(Y2), background));
        } else  if (figure==3) {
            String X1 = "value";
            while (!X1.matches("[-+]?\\d+")) {
                System.out.println("Введите значение X1: ");
                X1 = in.next();
            }
            String Y1 = "value";
            while (!Y1.matches("[-+]?\\d+")) {
                System.out.println("Введите значение Y1: ");
                Y1 = in.next();
            }

            String X2 = "value";
            while (!X2.matches("[-+]?\\d+")) {
                System.out.println("Введите значение X2: ");
                X2 = in.next();
            }
            String Y2 = "value";
            while (!Y2.matches("[-+]?\\d+")) {
                System.out.println("Введите значение Y2: ");
                Y2 = in.next();
            }
            figures.add(count, new Ellipse(Integer.parseInt(X1),Integer.parseInt(Y1), Integer.parseInt(X2),Integer.parseInt(Y2), background));
        } else  if (figure==4) {
            String X1 = "value";
            while (!X1.matches("[-+]?\\d+")) {
                System.out.println("Введите значение X1: ");
                X1 = in.next();
            }
            String Y1 = "value";
            while (!Y1.matches("[-+]?\\d+")) {
                System.out.println("Введите значение Y1: ");
                Y1 = in.next();
            }

            String X2 = "value";
            while (!X2.matches("[-+]?\\d+")) {
                System.out.println("Введите значение X2: ");
                X2 = in.next();
            }
            String Y2 = "value";
            while (!Y2.matches("[-+]?\\d+")) {
                System.out.println("Введите значение Y2: ");
                Y2 = in.next();
            }
            String X3 = "value";
            while (!X3.matches("[-+]?\\d+")) {
                System.out.println("Введите значение X3: ");
                X3 = in.next();
            }
            String Y3 = "value";
            while (!Y3.matches("[-+]?\\d+")) {
                System.out.println("Введите значение Y3: ");
                Y3 = in.next();
            }

            String X4 = "value";
            while (!X4.matches("[-+]?\\d+")) {
                System.out.println("Введите значение X4: ");
                X4 = in.next();
            }
            String Y4 = "value";
            while (!Y4.matches("[-+]?\\d+")) {
                System.out.println("Введите значение Y4: ");
                Y4 = in.next();
            }
            String X5 = "value";
            while (!X5.matches("[-+]?\\d+")) {
                System.out.println("Введите значение X5: ");
                X5 = in.next();
            }
            String Y5 = "value";
            while (!Y5.matches("[-+]?\\d+")) {
                System.out.println("Введите значение Y5: ");
                Y5 = in.next();
            }
            figures.add(count, new Polygon
                    (Integer.parseInt(X1),Integer.parseInt(Y1),
                    Integer.parseInt(X2), Integer.parseInt(Y2),
                    Integer.parseInt(X3),Integer.parseInt(Y3),
                    Integer.parseInt(X4),Integer.parseInt(Y4),
                    Integer.parseInt(X5),Integer.parseInt(Y5), background));
        }
        count++;
        System.out.println("Объект успешно создан!");
    }

    static void Delete_el() {
        if (count!=0) {
            Scanner in = new Scanner(System.in);
            System.out.println();
            System.out.println("Укажите номер объекта, который желаете удалить: ");
            String num = in.next();
            int number = 0;
            if (num.matches("[-+]?\\d+")) {
                number = Integer.parseInt(num);
                if (number > count || number < 1) {
                    Delete_el();
                }
            } else {
                Delete_el();
            }
            number--;
            figures.remove(number);
            count--;
            System.out.println("Элемент успешно удалён!");
        }
    }

    static void Clear_Array() {
        figures.clear();
        count = 0;
        System.out.println("Список очистился!");
    }

    static void Info_Array() {
        if (count == 0) {System.out.println("Спиcок пуст");}
        else {
        System.out.println("Спиcок объектов: ");
        for (int i = 0; i<count; i++) {

            if (Main.figures.get(i).getType() == 0) { // точка
                System.out.println(i+1 + ". Точка");
            }
            else if (Main.figures.get(i).getType() == 1) { // линия
                System.out.println(i+1 + ". Линия");
            } else if (Main.figures.get(i).getType() == 2) { // прямоугольник
                System.out.println(i+1 + ". Прямоугольник");
            } else if (Main.figures.get(i).getType() == 3) { // эллипс
                System.out.println(i+1 + ". Эллипс");
            } else if (Main.figures.get(i).getType() == 4) { // многоугольник
                System.out.println(i+1 + ". Многоугольник");
            }

            }
        }
    }

    static void Show () {
        Scanner in = new Scanner(System.in);
        new Main();
        String next = "END";
        System.out.println("Введите любой символ, чтобы выйти в меню: ");
        next = in.next();

    }

    }




