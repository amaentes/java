package dz1;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введите число n: ");
        int n = sc.nextInt();
        int triangularNumber = 0;
        int factorial = 1;
        
        // Вычисление n-го треугольного числа
        for (int i = 1; i <= n; i++) {
            triangularNumber += i;
        }
        
        // Вычисление факториала числа n
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        System.out.println("n-ое треугольное число: " + triangularNumber);
        System.out.println("n!: " + factorial);
        sc.close();
    }
}
