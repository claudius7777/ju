package com.ohgiraffers.section01.uses;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        MemberService memberService = new MemberService();

        while(true){ //@@뜻이 뭐야? 어떨 때 써?
            System.out.println("회원 관리 시스템");
            System.out.println("1 회원등록");
            System.out.println("2 회원 전제 조회");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 :");
            int no = sc.nextInt();
            switch(no){
                case 1 : memberService.signupMembers();
                     break;
                case 2 : memberService.showAllMembers();
                    break;
                case 9 : System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                System.out.println("잘못된 번호를 입력하셨습니다.");
                break;
            }
        }
    }
}
