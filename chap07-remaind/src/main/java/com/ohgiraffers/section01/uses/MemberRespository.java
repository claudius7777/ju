package com.ohgiraffers.section01.uses; //MemberRepository는 Member객체의 배열을
//관리하며 회원정보를 저장하고 조회하는 기능을 제공

public class MemberRepository {

    private final static Member[] members;
    private static int count;

    static{
        members = new Member[10];
    }

    public static boolean store(Member[] newMembers){//store 메서드로 회원정보를 저장하고
        for(int i= 0; i < newMembers.length; i++){
            members[count++] = newMembers[i];
        }
        return true;
    }
    public static Member[] findAllMembers() {
        return members;
    }//findAllMembers 메서드로 저장된 모든
    //회원정보를 조회할 수 있습니다.


}
