package Homework.Homework_3.ex_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        // Задан целочисленный список ArrayList.
        // Найти минимальное, максимальное и среднее арифметическое из этого списка.
        // Collections.max()
        System.out.println("Введите количество чисел: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("Начальный список: " + list);

        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        double result = sum / list.size();
        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + result);
    }
}
