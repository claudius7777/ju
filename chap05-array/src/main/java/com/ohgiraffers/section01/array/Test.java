package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int[]score = new int[11];//배열변수명 지정
        for (int j=0; j< 11; j++)
        {//0

            score[j] = j;

            sum= sum + score[j];

            System.out.println(score[j]+sum);

        }
            //0으로 시작해서 5보다 크면 멈춘다.





    }


    public static void avg()
    {
        //과목 5개 점수 입력받기
        Scanner sc = new Scanner(System.in);//사용자로부터 입력받을 수 있도록 도와 주는 것.클래스를 쓰기 위해 호출한다.
        int []score = new int[5];//배열의 선언
        int result =0;//변수정의와 초기화
        for(int i=0;i<score.length;i++)//score의 길이 만큼 반복문 실행
        {
            score[i]=sc.nextInt();
            result += score[i];
        }

        double avg = result / score.length;

        String[] subject = {"수학","영어","국어","과학","사회"};
        for(int i=0;i < score.length; i++)
            {
            System.out.println(subject[i] + " : " + score[i] + " ");

            }

        System.out.println("평균점수 : "+ avg);


    }

    /*
     * A학생의 평균 점수를 구하는 프로그램을 만들어 주세요.
     * 시험의 과목은 5개로 점수는 정수 단위입니다.
     * 5개 과목의 점수를 입력받고 평균을 구하여 화면에 출력합니다.
     * 예) A학생의 수학 : 90점, 영어 : 80점; 국어 :100점, 과학 :79점, 사회 :80점이며 평균은 x 입니다.
     *
     * */




//A학생의 평균구하는 프로그램 (평균=합계/과목수)
    //입력(과목5개점수입력받기) :A학생,수학,영어,국어,과학,사회
//연산:총점,평균
    //출력: A학생,수학,영어,국어,과학,사회,총점,평균

    //이름변수
    //성적변수
    //총점변수

    //메모리할당

    //입력구현
    //이름입력받기
    //성적입력받기
    //score 0,1,2,3,4 합을 score4에 대입
    //총점나누기 과목수 5 해서 평균산출
    //출력
}
