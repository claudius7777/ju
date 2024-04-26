package com.ohgiraffers.section02.looping;

public class B_while
{
    public void testSimpleWhileStatement() {
        /*
         *[while문표현식]
         * 조건을 만족하는 경우 수행할 구문
         * }
         * */

        int i = 1;
        int j = 2;

        while (i <= 9) {

            // 반복해야 하는 대상의 길이를 알 수 없을때 사용한다.
            System.out.println(j + "*" + i + "=" + (j * i));
            i++;
        }
    }


//구구단
//2*1=2
        //while쿤을 이용해야 구구단을 만들기
        public void whileGugudan ()
        {
            //1. 초기식 작성
            int i = 2;
            //2.while문의 조건식
            while (i <= 9)
            {//while시작
                int j = 2;
                //3.중첩 while 조건식
                while (j <= 9)
                {
                    //4.i*j연산
                    //5.출력
                    System.out.println(i + "*" + j + "=" + (i * j));
                    //6.중첩while 증감식
                    j++;
                }

                //7.while 증감식
                i++;
            }// 종료

            //8.중첩 while의 조건변수 초기화

        }



}
