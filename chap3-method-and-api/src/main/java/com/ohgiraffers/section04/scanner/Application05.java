package main.java.com.ohgiraffers.section04.scanner;//패키지라는 경로

import java.util.Scanner; //포함한 java패키지에 uril이라는 경로에 Scanner라는 클래스

public class Application05 { //접근제어자는 퍼블릭으로 아무나 쓸수 있으며 클래스라는 앱플리캐션05로
    public static void main(String[] args) {
        Application05 app1 = new Application05();
        String info = app1.intputInfo();
        System.out.println(info);
    }


   public String intputInfo(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("당신의 이름은 무엇인가요?: ");
       String name = scanner.nextLine();
       System.out.println("당신의 키는 몇인가요?: ");
       double height = scanner.nextDouble();
       System.out.println("당신의 나이는 몇살인가요?: ");
       int age = scanner.nextInt();

       System.out.println("당신의 성별은 무엇인가요?: ");
       char gender = scanner.next().charAt(0);


       return name+age+gender+height;


   }
}


