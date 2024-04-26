package com.ohjiraffers.order.dto;

public class OrderDto
{
    private String menuName;
    private int price;
    private int quantity;


    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int menuPrice) {
        this.price = menuPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity,int price) {
        this.quantity = quantity;
        this.price = quantity * price;
    }


    @Override
    public String toString() {
        return "OrderDto{" +
                "menuName='" + menuName + '\'' +
                ", Price=" + price +
                ", quantity=" + quantity +
                '}';
    }



}
