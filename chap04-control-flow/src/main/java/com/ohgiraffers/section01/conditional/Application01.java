package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("수를 입력하세요: ");
        int x = in.nextInt();
        System.out.println("수를 입력하세요: ");
        int y = in.nextInt();
        System.out.println("연산기호를 입력하세요.ex) +, -, *, / ");
        char ch = in.next().charAt(0);

        if (ch == '+') {
            System.out.println("=" + (x + y));
        } else if (ch == '-') {
            System.out.println("=" + (x - y));
        } else if (ch == '*') {
            System.out.println("=" + (x * y));
        } else if (ch == '/') {
            System.out.println("=" + (x / y));
        } else {
            System.out.println("잘못입력 되었습니다.");
        }
    }

    /*
     *계산기 만들기
     * 두 수와 연산기호를 입력받아
     * 연산기호에 맞는 연산을 수행하는 프로그램을 만들어주세요
     * */
    // 1.calculator 메서드를 만든다.calculator=계산기
    public double calculator() { // 접근제어자 반환 몸체
        //입력받을 수 있는 기능을 추가한다.
        Scanner sc = new Scanner(System.in);
        // 2.두 수를 입력받는다.
        int first = sc.nextInt();
        // 3. 두번째 수를  입력받는다.
        int second = sc.nextInt();
        // 3. 연산 기호를 입력받는다.
        char operator = sc.nextLine().charAt(0);
        // 4.연산기호를 확인한다.
        double result;
        if (operator == '+') {
            result = first + second;
        } else if (operator == '-') {
            result = first - second;
            //5.연산을 진행한다.
        } else if (operator == '*') {
            result = first * second;
            //5.연산을 진행한다.
        } else if (operator == '/') {
            //5.연산을 진행한다.
            result = first / second;
        }
        {
            return 0.0;

        }
    }

    // 한번에 연산식 입력받기
    public String call() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] target = input.split(" ");
        int result=0;
        if (target[1] == "+") {
            result = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);
        }
        return "" + result;

    }
}
























        // 4.연산기호를 확인한다.
    //5.연산을 진행한다.
    //6.반환한다.

//int a에 정수로 수를 입력 받아 보세요. 입력문 a int



//int a=in.nextInt();// int는 자료형 변수명 a
// 변수 int를 a로 변수명 지정하고 변수a에  정수로 입력받게 초기화

