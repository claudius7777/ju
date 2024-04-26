package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {


    }

    public String inputInfo() {

        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 이름을 입력해주세요 : ");
        String name = sc.nextLine();

        System.out.println("당신의 키를 입력해주세요 : ");
        double key = sc.nextDouble();


        System.out.println("당신의 성별을 입력해주세요 : ");
        char gender = sc.next().charAt(0);

        System.out.println("당신의 나이를 입력해주세요 : ");
        int age = sc.nextInt();
        String result = " 이름:"+name + "키:"+key +"성별:"+gender+"나이:"+age;
        return result;
    }
}

/*
*inputInfo 메서드를 만들고
* 사용자의 이름 키 성별 나이를 입력받아 main에서 출력해주세요
* 1.inputInfo 함수를 만든다.
* 접근제어자  반환타입 String 메서드명(){}
* 2.사용자에게 값을 입력받는다.
* Scannar sc = new Scanner();
* 3.키 나이 성별 이름 입력받아 문자열로 합친다.
*   더블 키;
*   정수 나이;
*   문자 성별;
*   문자열 이름;
* 4.문자열로 반환한다.
*   return
* */