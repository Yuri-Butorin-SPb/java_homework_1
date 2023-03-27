package Homework.Homework_1.Ex_5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    // Задано уравнение вида q + w = e, q, w, e >= 0. 
    // Некоторые цифры могут быть заменены знаком вопроса, 
    // например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
    // Предложить хотя бы одно решение или сообщить, что его нет.

    public static void main(String[] args) {

        String equation = "?4 + ?5 = 69";

        equation = equation.replace("?", "0");

        String strArray[] = equation.split(" ");

        int num1 = Integer.parseInt (strArray[0]);
        int num2 = Integer.parseInt (strArray[2]);
        int result = Integer.parseInt (strArray[4]);
        
        int count = 0;
        if(num1 < 10 && num2 < 10){
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    if ((i * 10 + num1) + (j * 10 + num2) == result) {
                        System.out.println((i * 10 + num1) + "+" + (j * 10 + num2) + "=" + result);
                        count += 1;
                    }
                }
            }
        }
        if(num1 >= 10 && num2 < 10){
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    if ((num1 + i) + (j * 10 + num2) == result) {
                        System.out.println((num1 + i) + "+" + (j * 10 + num2) + "=" + result);
                        count += 1;
                    }
                }
            }
        }
        if(num1 < 10 && num2 >= 10){
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    if ((i * 10 + num1) + (num2 + j) == result) {
                        System.out.println((i * 10 + num1) + "+" + (num2 + j) + "=" + result);
                        count += 1;
                    }
                }
            }
        }
        if(num1 >= 10 && num2 >= 10){
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    if ((num1 + i) + (num2 + j) == result) {
                        System.out.println((num1 + i) + "+" + (num2 + j) + "=" + result);
                        count += 1;                        
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("Решения уравнения нет!");
        }
    }
}
