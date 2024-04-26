package com.ohgiraffers.section02.encapsulation.problem1;

public class Application02 {

    public static void main(String[] args) {
        Book[]book = new Book[3]; // Book[] 사용자가 만든 클래스의 묶음 Book

        book[0].bookname = "서시";
        book[0].author = "윤동주";
        book[0].number = 1;

        book[1].bookname = "빨간머리 앤";
        book[1].author = "몽고메리";
        book[1].number = 2;

        book[2].bookname = "삼국지";
        book[2].author = "진수";
        book[2].number = 3;

    }


}
