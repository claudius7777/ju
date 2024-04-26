package com.ohgiraffers.section02.demensinal;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int [][] go = new int[31][31];
// 자료형 자료명 = 행 열 개수;
       int n = sc.nextInt();//30,30
       for (int a = 0; a < n; a++) {
           int x = sc.nextInt();
           int y = sc.nextInt();
           go[x-1][y-1] = 1;

       }
       for (int i = 0; i < 30; i++) {
           for (int j = 0; j < 30; j++) {
               System.out.print(go[i][j] + " ");
           }
System.out.println();

       }
    }
}
