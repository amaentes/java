package dz1;
import java.util.Scanner;

// Реализовать простой калькулятор (+-/*)

public class zadanie3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String expression = sc.nextLine();
        sc.close();
        
        String[] parts = expression.split("\\s+");

        if (parts.length != 3) {
            System.out.println("Некорректное выражение");
            return;
        }
        
        double num1 = Double.parseDouble(parts[0]);
        double num2 = Double.parseDouble(parts[2]);
        char operator = parts[1].charAt(0);
        
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Некорректный оператор");
                return;
        }
        
        System.out.println("Результат: " + result);
        
    }
}
