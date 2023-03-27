package Homework.Homework_1.Ex_3;

public class main {

    public static void main(String[] args) {
        // Вывести все простые числа от 1 до 1000
        // (числа, которые делятся только на 1 и на себя без остатка)
        numbers();
    }

    static void numbers(){
        for (int i = 2; i <= 1000; i++) {
            Boolean temp = true;
            for (int j = 2; i > j; j++) {
                if (i % j == 0) {
                    temp = false;
                    break;
                }
                else{
                    temp = true;
                }
            }
            if (temp == true) {
                System.out.printf("% d", i);
            }
        }
    }
}
