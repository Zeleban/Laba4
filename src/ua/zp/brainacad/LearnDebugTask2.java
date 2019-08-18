package ua.zp.brainacad;

/**Задача №2
 Написать программу, которая выводит на экран (с новой строки) числа от 0 до 10
 и возле каждого пишет четное это число или нечетное.
 Пример
 1 -> нечетное
 2 -> четное
 и т д.
 */
public class LearnDebugTask2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i%2 == 0 && i > 0) {
            System.out.println(i + " ->Четное");
            }
            if (i%2 != 0 && i > 0){
                System.out.println(i + " ->Нечетное");
                }
            if (i == 0) {
                System.out.println("0 есть 0");
            }
            }

        }
    }

