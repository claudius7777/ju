package com.ohgiraffers.section01.uses;

public class MemberRegister {//@register왜만들지?=등록하다

    public void regist(Member[] members){
        System.out.println("회원을 등록합니다.");

        for (int i = 0; i < members.length; i++){//lenth는 길이
            System.out.println(members[i].getName() + "님을 회원 등록에 성공하엿습니다.");

            if(MemberRespository.store(members)){
                System.out.println("총" + members.length + "명의 회원 등록에 성공했습니다.");
            }

        }
    }
}
