package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster
{

    String name;

    int hp;

    // monster의 hp가 0보다 큰 값만 입력될 수 있도록 하여 버그를 박고자함

 //   public void setHp(int hp){//setHP 시작
 //     if(hp > 0){

 //         this.hp = hp;//디스 예약어

 //     } else{
  //        System.out.println("몬스터의 체력은 0보다 작을 수 없습니다.");
 //     }

//    }//setHP종료
 //   public int getHp(){
//        return this.hp;
 //   }

}
