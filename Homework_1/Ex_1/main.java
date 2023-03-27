package Homework.Homework_1.Ex_1;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n)
        
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Треугольное число равно: " + triangularТumber(number));
    }

    static int triangularТumber (int n){
        return(n * (n+1)/2);
    }
}
