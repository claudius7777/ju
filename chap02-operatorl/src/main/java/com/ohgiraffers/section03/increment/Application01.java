package com.ohgiraffers.section03.increment;

public class Application01 {
    public static void main(String[] args) {
        /*
        *증감연산자
        * 피연산자의 앞 or 뒤에  사용이 가능하다.
        * '++' : 1의 증가를 의미한다.
        * '--' : 1의 감소를 의미한다.
        * ++x or x++
        * 변수명 앞에 ++가 붙을 경우 계산식 전에 +1을 더한다.
        * 변수명 뒤에 ++가 붙을 경우 계산식 후에 +1을 더한다.
        *
         */
        int num = 0;//int형으로 변수명num을 선언한다.그리고 변수명num을 0으로 초기화 한다.
        int x = 10 + (++num); //int형으로 x로 선언하고 x를 10 + (++num)으로 초기화 한다.
        System.out.println(x);
        System.out.println(num);

        num =0;
        x = 10 + num++;
        System.out.println(x);
        System.out.println(num);



    }
}
