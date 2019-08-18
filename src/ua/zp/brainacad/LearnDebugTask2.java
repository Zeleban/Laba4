package ua.zp.brainacad;

/**Задача №2 Вивести на екран числа от 0 до 10,
 * если число четное- написать рядом с ним "четное";
 * если число нечетное, написать рядом с ним "нечетное"
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

