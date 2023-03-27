package Homework.Homework_1.Ex_2;
import java.util.Scanner;

public class main {
    // Вычислить n! (произведение чисел от 1 до n)
    public static void main(String[] args) {
        
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number + "!" + " = " + feb(number)); 
    }
    static int feb(int n){
        int result = 1;
        for (int i = n; i > 0; i--) {
            result = result * n;
            n--;
        }
        return(result);
    }

}
