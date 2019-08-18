package ua.zp.brainacad;

/**
 Задание №5
 Написать программу, которая выводит на экран каждое 3-е i-ое значение цикла.
 */
public class Task5 {
    public static void main(String[] args) {
            for (int i = 1; i < 100; i++) {
                if (i%3 ==0){
                    System.out.println(i);
                }
            }
    }
}

