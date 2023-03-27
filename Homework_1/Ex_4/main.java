package Homework.Homework_1.Ex_4;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args){
    // Реализовать простой калькулятор 
    // (введите первое число, введите второе число, введите требуемую операцию, ответ)
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Введите первое число: ");
    float a = scanner.nextFloat();
    

    System.out.print("Введите действие (+, -, *, /): ");
    String operator = scanner.next();

    System.out.print("Введите второе число: ");
    float b = scanner.nextFloat();
    
    calc(a, operator, b);

    }
    
    static void calc (float a, String oper, float b){
        if (oper.equals("+")) {
            plus(a,b);
        }
        if (oper.equals("-")) {
            minus(a,b);
        }
        if (oper.equals("*")) {
            multiplication(a,b);
        }
        if (oper.equals("/")) {
            division(a,b);
        }
        else{
            System.out.println("Ошибка ввода!");
    }

    }
    
    
    static void plus(float a, float b){
        System.out.println(a+b);
    }
    static void minus(float a, float b){
        System.out.println(a-b);
    }
    static void multiplication(float a, float b){
        System.out.println(a*b);
    }
    static void division(float a, float b){
        if (b == 0) {
            System.out.println("На 0 делить нельзя!");
        }
        System.out.println(a/b);
    }

}
