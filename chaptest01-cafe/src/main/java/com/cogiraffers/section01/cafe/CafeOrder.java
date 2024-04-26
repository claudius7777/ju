package com.cogiraffers.section01.cafe;

import java.util.Scanner;

public class CafeOrder
{

    public static void main(String[] args)
    {
        //1.메뉴와 가격 정보를 배열로 관리
        String[] menuItems = {"아메리카노","카페라떼","카푸치노","에스프레소"};
        int[] menuPrices = {4000,4500,4500,3500};
        Scanner scanner = new Scanner(System.in);

        //2.메뉴 목록 출력
        System.out.println("==== Cafe Menu =====");
        for(int i = 0; i < menuItems.length; i++)
        {
            System.out.println((i + 1) + "." + menuItems[i] + "-" + menuPrices[i] + "원");
        } //@@i +1은 왜하는거야?? 배열인덱스는 0부터 시작하므로 1부터 시작하게끔 i+1을 씁니다. 메뉴번호를 받기위함입니다.
        System.out.println("============");


        //3.사용자로부터 메뉴 번호 입력받기
        System.out.print("메뉴를 선택해주세요(1-" + menuItems.length + "):");
        int menuIndex = scanner.nextInt() -1; //배열 인덱스를 위해 1을 뺴줌
        //@@배열인덱스를 위해 1을 왜뺴??사용자가 보여지는 메뉴번호와 실제 배열이 1인덱스만큼 차이가 있습니다.

        //4.사용자로부터 메뉴 수량 입력받기
        System.out.print("수량을 입력해 주세요;");
        int quantity = scanner.nextInt();

        //5.총가격계산
        int totalPrice = calculatePrice(menuPrices[menuIndex],quantity);
        //@@ 이부분은 해석이 필요해!!

        //6.총가격출력
        System.out.println("총 가격은" + totalPrice + "원 입니다");
        scanner.close();
    }
        //7.가격계산 메서드
        public static int calculatePrice(int price, int quantity)
    {

        //8.총가격계산
        return price * quantity;
    }
}
