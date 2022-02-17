package org.example;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(doTask1(15, 4));
        doTask2(-1541);
        System.out.println(doTask3(-25));
        doTask4("For web and enterprise development", 3);

    }

    public static boolean doTask1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }

    public static void doTask2(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отприцательное");
        }
    }

    public static boolean doTask3(int x) {
        if (x <= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void doTask4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }

}
