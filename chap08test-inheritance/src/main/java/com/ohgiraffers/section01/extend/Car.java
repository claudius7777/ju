package main.java.com.ohgiraffers.section01.extend;

public class Car {

    private boolean runningStatus;

    public Car(){ System.out.println("Car클래스의 기본생성자 호출됨");}

    public void soundHorn(){
        if(isRuning()) {
            System.out.println("빵! 빵!");
        }else{
            System.out.println("주행중이 아닌 상태에서는 경적을 올릴 수 없습니다.");
        }
    }

    // private boolean isRunning(){
    protected boolean isRuning(){ return runningStatus; }

    public void stop(){
        runningStatus =false;
        System.out.println("자동차가 멈춥니다.");
    }

    public void run(){
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }
}

