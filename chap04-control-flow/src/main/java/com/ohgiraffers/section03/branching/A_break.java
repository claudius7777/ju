package com.ohgiraffers.section03.branching;

public class A_break {

    /*
    * break문 실행 흐름을 확인하기 위한 용도의 기능을 제공 분기문(break) 기본 흐름에 대해 확인
    *
    * */
    public void testSimpleBreakStatement()
    {
        int i = 2;//inti로 지정
        test://상위의while의이름붙여줌
        while(true)//while은 참일때 실행
        {
            if(i>=10)
            {
                break test;//이름지정되있는 데를 종료하겠다.
            }
            int x = 0;
            while(x<=9)
            {
                if(x>=5)//if는 참일때
                {
                    break;//분기종료 맨위 test종료
                }
                    if(x ==0)
                    {
                        x++;
                        continue;//밑에 는 뺴고 위로 -<i*0은 안나온다.
                    }


                System.out.println(i + " * " + x +" = " + i*x);
                x++;
            }
            i++;
        }
  }
}
