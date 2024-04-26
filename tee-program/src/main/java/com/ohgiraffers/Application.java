package com.ohgiraffers;

public class Application {

    public static void main(Sting[] args){//main 메서드 시작
        // 주문관리 시스템의 메인 애플리케이션
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        //Scanner 객체 sc를 사용하여 사용자로부터 입력을 받습니다.
        OrderController orderController = new OrderController();//OrderController 객체 생성
       // OrderController 객체 orderController를 생성하여 주문관련 로직을 처리합니다.
        boolean order = true;// 주문 반복 여부를 결정하는 변수
        String result = ""; // 주문 결과를 저장하는 변수

        while(order){ //주문 반복을 위한 while 루프 시작
            //while 루프를 통해 사용자가 원하는 주문관련 기능을 선택할 수 있습니다.
            System.out.println("1. 주문 등록");
            System.out.println("2. 주문 삭제");
            System.out.println("3. 주문 수정");
            System.out.println("4. 주문 상세조회");
            System.out.println("5. 주문 전체조회");
            System.out.println("어떤 메뉴를 동작하시겠나요?");
            int input = sc.nextInt();// 사용자의 메뉴 선택을 입력받음
            sc.nextLine();// 입력버퍼를 비움
            OrderDTO orderDTO = new OrderDTO();//Order DTO객체 생성
            // 선택된 메뉴에 따라 적절한 작업을 수행하기 위해OrderDTO 객체를 생성합니다.
//(현재코드에는 해당 객체의 속성 추기화가 누락되어 있습니다.
            //다음코드부분은 주문등록,삭제,수정,상세조회,전체조회등의 기능을 구현할것예상
            

        }
    }
}
