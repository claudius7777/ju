package com.ohjiraffers.order.service;

import com.ohjiraffers.order.dao.OrderRepository;
import com.ohjiraffers.order.dto.OrderDto;


public class OrderService
{
    private OrderRepository orderRepository = new OrderRepository();
    //서비스 계층
    //비즈니스 로직 수행 및 데이터 베이스의 대한 리소스를 관리한다.
    public String order(OrderDto orderDto)
    {
        if(!orderDto.getMenuName().equals("아메리카노"))
            return "주문 실패";
        if(orderDto.getPrice() <= 0)
            return "땅파서 장사하냐?";
        String result = orderRepository.order(orderDto);

        return result;

    }

}
