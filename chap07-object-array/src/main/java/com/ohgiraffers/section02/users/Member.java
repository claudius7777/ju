package com.ohgiraffers.section02.users;

public class Member

{

    private int num;

    private String id;

    private String age;

    private int age;

    private char gender;

    public Member(int num, String id, String pwd,String name, int age, char gender) {
        this.num = num;
        this.id = id;
        this.age = age;

        this.gender = gender;

    }

    public Member() {

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

