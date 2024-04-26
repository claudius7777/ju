package main.java.com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {
        /*
         * myinfo함수를 만들고
         * 이름: 문자열
         * 나이: 정수
         * 성별: 문자
         * 전화번호: '-'을 포함한 전화번호
         *
         * 위 4개의 자료형을 매개변수로 받아 하나의 문자열로 더하고 main에서 출력해주세요
         * */
// 1,myinfo 함수만들기
        //2. 매개변수(string,name,inet age,char gerder,String phone)
        //3.매개변수 더하기 String result =name +age_ gender +phone
        //4.return result


        Application4 app = new Application4();
        System.out.println(app.myInfo("이상우",20,'남',"010-3293-8180"));
    }
        public String myInfo(String name,int age,char gender,String number)
        {
        String result = name + age + gender + number;
        return result;

    }
}
