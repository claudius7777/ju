package com.ohgiraffers.section02.literal;

public class Application03 {
    public static void main(String[] args) {
        /*
        * 변수 명명 규칙
        * 변수의 이름을 지을 떄 아무렇게나 짓는 것이 아닌 정해진 규칙이 있다.
        * 실무적으로는 굉장히 중요하기 떄문에 반드시 숙지해야 하고,
        * 또한, 규칙에 맞는 올바른 변수명을 짓는 것이 좋은 프로그래밍을 하는 첫 단추이다.
        * */

        /*
        * 변수의 명명 규칙
        * 1. 컴파일 에러를 발생시키는 규칙
        *  1-1. 동일한 범위내에서 동일한 변수명을 가질 수 없다.
        *       int inum;
        *       int inum;


        *  1-2. 예약어는 사용이 불가능하다.
        *  1-3. 변수명은 대/소문자를 구분하다.
        *
         */
        /*  1-4. 변수명은 숫자로 시작할 수 없다.
        *     int 4num;
        *  1-5. 특수한 기호는 '_'와 $만 사용 가능하다.
        *   int num;
        * 2. 컴파일 에러를 발생시키지는 않지만 개발자들끼리의 암묵적인 규칙
        *   2-1.변수명의 길이는  제한이 없다.}
        *      int dfdsfasdfasfadsfsad;
        *   2-2. 변수형의 합성어로 이루어진 첫 단어는 소문자, 두 번째 시작 단어는 대문자로 시작한다.
        *   int maxNum;
        *   2-3. 단어와 단어 사이의 연결을 언더스코어로(_) 하지 않는다.
        *   2-4. 한글로 변수명을 짓는 것이 가능하지만,권장하지 않는다.
        *       int 숫자;
        *   2-5. 변수 안에 저장된 값이 어떤 의미를 가지는지 명확하게 표현하도록 한다.
        *       int point;
        *   2-6. 전형적인 변수 이름이 있다면 가급적으로 사용하도록 한다.
        *   2-7. 명사형으로 작성할 수 있도록 한다.
        *       int increase;
        *   2-8. boolean 형은 의문문으로 가급적 긍정현태로 작성한다.

        */

        String name ="김효주";
        int age = 20;
        char gender = '여';
        System.out.print(name);
        System.out.print(age);
        System.out.print(gender);

            }
        }





