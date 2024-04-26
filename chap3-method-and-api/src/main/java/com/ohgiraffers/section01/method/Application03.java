package main.java.com.ohgiraffers.section01.method;

public class Application03 {
    public static void main(String[] args) {
    int x =10; // 매개변수x는 10
    int y = 20; // 매개변수y는 20

    Application03 app3= new Application03(); // Application03에 변수선언
    int result= app3.plus(x,y); //int에 result라는 매개변수이름을 지정하고 result는 app3.plus(x,y)와 같습니다.
    System.out.println(result); // result를 출력합니다.

        int result1= app3.minus(x,y); //매개변수 result1은
        System.out.println(result1);

        int result2= app3.multi(x,y);
        System.out.println(result2);

        int result3= app3.divi(x,y);
        System.out.println(result3);

        int result4= app3.rest(x,y);
        System.out.println(result4);
    }



    // 두 수를 더하기 함수
    // 접근제어자 반환타입 (int,long..)함수명(매개변수){}
    public int plus(int x, int y){
        int result = x + y;
        return result;

    }

    public int minus(int x, int y) {
        int result = x - y;
        return result;
    }

    public int multi(int x, int y) {
        int result = x * y;
        return result;
    }
    public int divi(int x, int y) {
        int result = x / y;
        return result;
    }
    public int rest(int x, int y) {
        int result = x % y;
        return result;
    }

    /*
    * myinfo함수를 만들고
    * 이름: 문자열
    * 나이: 정수
    * 성별: 문자
    * 전화번호: '-'을 포함한 전화번호
    *
    * 위 4개의 자료형을 매개변수로 받아 하나의 문자열로 더하고 main에서 출력해주세요
    * */



    //System.out.println(result);

   // public int plus(int n, int a, int g, int h){
       // int result = n + a + g + h;
       // return result;


}

