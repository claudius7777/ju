package com.ohgiraffers.section02.users;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        /*
        * 시스템 요구사항
        * 1. 여러 명의 회원 정보를 받아 한 번에 여러 회원 정보를 등록
        * 2. 전체 회원 조회 시 여러명의 회원 정보를 반환
        * */

    // 사용자 정보를 입력받기위함
        Scanner sc = new Scanner(System.in);

        MemberService memberService =new MemberService();

        while(true){
            System.out.println("회원관리 프로그램: ");
            System.out.println("1.회원 등록: ");
            System.out.println("2.화원 전체 조회: ");
            System.out.println("9.프로그램 종료: ");
            System.out.print("메뉴 선택: ");
            int no = sc.nextInt();


        }

    public void showAllMembers(){
            MemberFinder finder =new Member
        }
    }


}
