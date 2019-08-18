package ua.zp.brainacad;

/**
  Задача №3 Написать программу, которая выводит информацию о дне неделе.
  Например для понедельника – пятницы выводит сообщение “Это рабочий
  день”, а для субботы и воскресенья выводит “Это выходной!”
 */


public class Task3 {
    public static void main(String[] args) {
        String day = "Суббота";
        switch (day){
            case "Понедельник":
                System.out.println("Это рабочий день");
                break;
            case "Вторник":
                System.out.println("Это рабочий день");
                break;
            case "Среда":
                System.out.println("Это рабочий день");
                break;
            case "Четверг":
                System.out.println("Это рабочий день");
                break;
            case "Пятница":
                System.out.println("Это рабочий день");
                break;
            case "Суббота":
                System.out.println("Это выходной!");
                break;
            case "Воскресенье":
                System.out.println("Это выходной!");
                break;
            default:
                System.out.println("Такого дня недели не существует, либо Вы ввели с маленькой буквы!");
        }
    }
}


