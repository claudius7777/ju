package com.ohgiraffers.section01.uses;

public class Member {

    private int num;//메서드가 정의된 class나 멤버변수 내부가능,private캡슐화 class안 접근제어자public선언한 get,set으로만 접근가능하다.
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;

    public Member(int num, String id, String pwd, String name, int age, char gender){
        this.num = num;
        this.id =id;
        this.pwd =pwd;
        this.name = name;
        this.age =age;
        this.gender = gender;

    }

    public int getNum() { return num; }//int 반환값있음 멤버변수값을 반환

    public void setNum(int num) {this.num = num;}//set 멤버변수값을 설정함 void 메서드 반환값이 없는 특별한 반환타입 출력만됨

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getPwd() { return pwd; }

    public void setPwd(String pwd) { this.pwd = pwd;}

    public String getName() { return name; }

    public void setName(String name) {this.name = name;}

    public int getAge(){return age;}

    public void setAge(int age) {this.age = age;}

    public char getGender() { return gender;}

    public void setGender(char gender){this.gender = gender;}


    @Override
    public String toString(){
        return "Member{" +
                "num=" + num +
                ", id='" + id +'\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name +'\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}

