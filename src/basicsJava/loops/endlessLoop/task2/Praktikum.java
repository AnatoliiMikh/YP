package basicsJava.loops.endlessLoop.task2;

import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Сумма
        int input; // Ввод пользователя

        while (true) {
            input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            sum = sum + input;
        }
        System.out.println("Сумма введённых чисел: " + sum);
    }
}

/*
Условие задачи:
Бесконечный цикл while (true) с прерыванием break применяется для решения достаточно
ограниченного спектра задач. Чаще всего его удобнее заменить на цикл while с условием.
Потренируйтесь это делать. Эта программа с помощью бесконечного цикла суммирует числа,
которые вводит пользователь. Она работает до тех пор, пока не будет введён 0.
Перепишите её, заменив бесконечный цикл на цикл while с условием.

ПОДСКАЗКА:
1. Цикл должен выполняться до тех пор, пока пользователь не введёт 0,
то есть значение переменной input не равно нулю. Это и станет его условием input != 0.
2. Переменной input нужно присваивать значение перед циклом и внутри него,
так как считывать ввод пользователя придётся и там, и там.
 */