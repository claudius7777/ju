package main.java.com.ohgiraffers.section01.method;

public class Application01 {

    public static void main(String[] args) {
        //public이란 접근제한자이다.(지정된것끼리 들어올수있다.) static은 클래스에 고정된 변수나 메서드이다.void는 리턴값이 없는 것을 말한다.
        /*
        * 메소드
        * 메소드는 어떤 특정 작업을 수행하기 위한 명령분의 집합이라고 할 수 있다.

        * */
        System.out.println("main() 시작됨....");


        Application01 app1=new Application01();
        app1.methodA();
        app1.methodB();
        System.out.println("main() 종료됨....");

    }

    public void methodA() {
        System.out.println("methodA()를 호출함");
        methodB();
        System.out.println("main() 종료됨....");
        return;
    }


    public void methodB() {
        System.out.println("methodB()를 호출함");
        methodC();
        System.out.println("main() 종료됨....");
    }

    public void methodC() {
        System.out.println("methodC()를 호출함");
        System.out.println("main() 종료됨....");
    }



}


