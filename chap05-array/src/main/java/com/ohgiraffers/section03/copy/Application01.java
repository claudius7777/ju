
/*
package com.ohgiraffers.section03.copy;

public class Application01
{

    public static void main(String[] args)
    {
        //얕은 복사
        String[] goldSideName ={"강제석","송재희","황정환"};
        String names =goldSideName;
        System.out.println(goldSideName);
        System.out.println(names);

        goldSideName[0] = "김효주";

        System.out.println(goldSideName[0]);
        System.out.println(names[0]);


        //-------------
        goldSideName = new String[]{"강제석","송재희","황정환"}; // 변수명을 새롭게 할당하는 것이 불편 임시재사용
        for(int i=0;i<goldSideName.length;i++)
        {
            String name=goldSideName[i];
            System.out.println(goldSideName[i]);

        }
        // for each
        int i =0;
        for(String name : goldSideName)
        {
            name[i] = name;
            i++;
        }
        goldSideName[0]="이상우";
        System.out.println(goldSideName[0]);
        System.out.println(names[0]);

        for(String name : names)
        {
            System.out.println(name);

        }
            System.out.println(name);





    }
}


 */