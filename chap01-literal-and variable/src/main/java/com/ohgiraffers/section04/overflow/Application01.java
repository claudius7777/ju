package com.ohgiraffers.section04.overflow;

public class Application01 {

    public static void main(String[] args) {

        // 자료형 별 값의 최대 범위를 벗어나는 경우 발생한 carry를 버립처리 하고 sing bit릏 반전시켜 최소값으로 순환시킴

        byte num1 = 127;
        System.out.println("byte num : " + num1);
        num1++;
        System.out.println("byte num : " + num1);


        int firstNum = 1000000;         //100만
        int secondNum = 700000;
        int multi = firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + multi);
        //2,147,483,647

        long longMulti = firstNum + secondNum;
        System.out.println("firstnum * secondNum = " + longMulti);

        long result = (long) firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + result);



    }
}
