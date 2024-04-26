package com.ohjiraffers.order.controller;

import com.ohjiraffers.order.dto.OrderDto;
import com.ohjiraffers.order.service.OrderService;

public class OrderController
{
    private OrderService orderService = new OrderService();
    public String order(OrderDto dto)
    {   //컨트롤러 계층에서는 각 기능을 수행하기 위한 필수값의 누락이 있는지 검사한다.
        if(dto.getMenuName().equals(""))
            return "메뉴를 다시 정하렴.";
        if(dto.getQuantity() <=0)
            return "수량을 입력해주세요.";
        //서비스 로직으로 넘겨주야함 뭐를? 메뉴와 수량을

        String result = orderService.order(dto);
        return result;
    }
    public String delete()
    {
        return "삭제하기.";
    }
    public String modify()
    {
        return "수정하기.";
    }
    public String info()
    {
        return "조회하기.";
    }
    public String powerInfo()
    {
        return "상세 조회 하기.";
    }




}


