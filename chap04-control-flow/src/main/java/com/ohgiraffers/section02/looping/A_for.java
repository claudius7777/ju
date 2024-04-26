package com.ohgiraffers.section02.looping;

public class A_for {
    public void testSimpleForStatement() {
        /*
         * [for문 표현식]
         * for(초기식;조건식;증감식){
         *   // 조건식이 참인 경우 실행할 구문 == 반복할 구문
         * }
         * */
        for (int i = 0; i <= 10; ++i) {
            System.out.println("천원단위" + i);
            for (int x = 0; x == 10; ++x) {
                System.out.println("만원 단위: " + x);
            }
            // 구구단을 만들어 주세요!
        }
    }

    public void gugudan() {
        for (int i = 2; i <= 2; ++i) {
            for (int j = 1; j <= 9; ++j)
                System.out.println(i + "*" + j + "=" + i * j);
        }


// i를 지정한 배수로 바꿔주세요.


    }

    public void gugudandan() {
        int i = 4;
        for (int j = i; j <= 9; ++j) {
            if (j % i == 0)
                for (int y = 2; y <= 9; ++y)
                    System.out.println(j + "*" + y + "=" + j * y);
        }


    }


    public void gugudandi() {

        for (int i = 2; i <= 9; i++) {
            for (int x = 0; x <= 9; x += i)
                if (x != 0) {

                    System.out.println(i + "*" + x + "=" + i * x);
                }
        }
    }


}









//구구단을 만들어주세요!
//i=2
//2*4,6,8

//10명의 이름과 나이를 입력 받아 화면에 출력하기
//예)이름000 나이 20
