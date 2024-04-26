package com.ohjiraffers;

import com.ohjiraffers.order.controller.OrderController;
import com.ohjiraffers.order.dto.OrderDto;

import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        OrderDto dto = new OrderDto();
        OrderController orderC = new OrderController();
        Scanner sc = new Scanner(System.in);
        boolean order= true;
        String result = "";

        while(order)
        {
            System.out.println("1.주문 등록");
            System.out.println("2.주문 삭제");
            System.out.println("3.주문 수정");
            System.out.println("4.주문 상세조회");
            System.out.println("5.주문 전체조회");
            System.out.print("어떤 메뉴를 동작하시겠냐");
            int input = sc.nextInt();
            sc.nextLine();

            OrderDTO orderDTO = new OrderDTO();
            switch(input)
            {
                case 1:
                    System.out.print("주문할 메뉴 를 입력하렴. ");
                    dto.setMenuName(sc.nextLine());
                    sc.nextLine();
                    System.out.print("몇개 먹을래");
                    int quantity=sc.nextInt();
                    System.out.print("얼마냐");
                    int price=sc.nextInt();
                    dto.setQuantity(quantity,price);
                    result = orderC.order(dto);
                    break;
                case 2:
                    orderC.delete();
                    break;
                case 3:
                    orderC.modify();
                    break;
                case 4:
                    orderC.info();
                    break;
                case 5:
                    orderC.powerInfo();
                    break;
                default:
                    System.out.println("입력을 확인하렴");
                    break;

            }
            System.out.println(result);

            System.out.println("주문을 종료 할래?");
            order = sc.nextBoolean();


        }

    }


}
