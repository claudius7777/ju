package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

    }

    public String call() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] target = input.split(" ");
        int result=0;
        if (target[1].equals("+")) {
            result = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);
        }
        if (target[1].equals("-")) {
            result = Integer.parseInt(target[0]) - Integer.parseInt(target[2]);
        }
        if (target[1].equals("*")) {
            result = Integer.parseInt(target[0]) * Integer.parseInt(target[2]);
        }
        if (target[1].equals("/")) {
            result = Integer.parseInt(target[0]) / Integer.parseInt(target[2]);
        }
        return "" + result;

    }
}
