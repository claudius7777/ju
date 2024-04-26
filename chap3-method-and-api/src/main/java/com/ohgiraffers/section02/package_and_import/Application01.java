package main.java.com.ohgiraffers.section02.package_and_import;

import main.java.com.ohgiraffers.section01.method.Calculator;

import java.util.concurrent.Callable;

//import static main.java.com.ohgiraffers.section02.package_and_import;

public class Application01 {
    public static void main(String[] args) {

        int first =200; // INT 형 변수로 first를 선언하고 200을 넣어 초기화 한다. 동 세커드 300
        int second = 300;

        int max =main.java.com.ohgiraffers.section01.method.Calculator.maxNumberof(first,second); //int형 변수로 max를 선언한다.
        // int max의 값으로는 해당주소 maxNuberof(first,second)를 넣은 함수값을 반환받아 초기화 한다.
        System.out.println(max);//max의 값을 출력한다.
        Calculator cal =new Calculator();
        //카큘레이터 클래스를 cal 변수로 선언한다.즉 메모리에 칼큘레이너를 싹다 올린다.힙영역에
        System.out.println((cal.minNumberof(first,second)));
        //칼의 min Numberof(first,Second)함수값을 반환받아 출력한다.
            //public Object call() throws Exception {


            }
        }







