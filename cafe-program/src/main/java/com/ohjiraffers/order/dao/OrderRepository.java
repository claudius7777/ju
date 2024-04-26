package com.ohjiraffers.order.dao;

import com.ohjiraffers.order.dto.OrderDto;

import java.util.ArrayList;

public class OrderRepository
{
    ArrayList orders = new ArrayList();


    public String order(OrderDto orderDto)
    {
        int oldnum = orders.size();
        orders.add(orderDto);
        if(oldnum>=orders.size())
            return "등록실패";
        return "등록성공";
    }




}
