package dz4;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class zadanie8 {
    public static void main(String[] args) {
        Deque<Integer> num1 = new LinkedList<>();
        num1.add(3);
        num1.add(2);
        num1.add(1);
        Deque<Integer> num2 = new LinkedList<>();
        num2.add(5);
        num2.add(4);
        num2.add(3);
        LinkedList<Integer> prodList = multiply(new LinkedList<>(num1), new LinkedList<>(num2));
        LinkedList<Integer> sumList = add(new LinkedList<>(num1), new LinkedList<>(num2));
        System.out.println(num1); // [3, 2, 1]
        System.out.println(num2); // [5, 4, 3]
        System.out.println(prodList); // [4, 2, 4, 3, 5]
        System.out.println(sumList); // [4, 6, 8]
    }

    private static LinkedList<Integer> multiply(Deque<Integer> num1, Deque<Integer> num2) {
        int proiz = toInt(num1) * toInt(num2);
        return toList(proiz);
    }

    private static LinkedList<Integer> add(Deque<Integer> num1, Deque<Integer> num2) {
        Deque<Integer> num1Copy = new LinkedList<>(num1);
        Deque<Integer> num2Copy = new LinkedList<>(num2);
        int sum = toInt(num1Copy) + toInt(num2Copy);
        return toList(sum);
    }

    private static int toInt(Deque<Integer> deque) {
        int num = 0;
        int digit = 1;

        while (!deque.isEmpty()) {
            num += deque.removeLast() * digit;
            digit *= 10;
        }
        return num;
    }

    private static LinkedList<Integer> toList(int num) {
        LinkedList<Integer> list = new LinkedList<>();
        if (num == 0) {
            list.add(0);
        } else if (num < 0) {
            list.add(-1);
            num = -num;
        }
        while (num > 0) {
            list.addFirst(num % 10);
            num /= 10;
        }
        Collections.reverse(list);
        return list;
    }
}