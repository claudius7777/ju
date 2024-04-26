package com.ohgiraffers.section02.superkeyword;


    public class Application {

        public static void main(String[] args) {

            /* 수업목표. super와 super()에 해대 이해할 수 있다. */
            /* 필기.
             *  super : 자식클래스를 이용해서 객체를 생성할 때 부모 생성자를 호출하여 부모 클래스의 인스턴스도
             *          함께 생성하게 된다. 이 때 생성한 부모의 인스턴스 주소를 보관하는 레퍼런스 변수로
             *          자식 클래스 내의 모든 생성자와 메소드 내에서 선언하지 않고도 사용할 수 있는 레퍼런스 변수이다.
             *  super() : 부모 생성자를 호출하는 구문으로 인자와 매개변수의 타입, 갯수, 순서가 일치하는
             *            부모의 생성자를 호출하게 된다. this()가 해당 클래스 내의 다른 생성자를 호출하는
             *            구문이라면, super()는 부모클래스가 가지는 private 생성자를 제외한 나머지 생성자를
             *            호출할 수 있도록 한 구문이다.
             * */

            /* 설명. Product 기본 생성자로 인스턴스 생성 후 정보 출력 */
            Product product1 = new Product();
            System.out.println(product1.getInformation());      //기본값으로 초기화됨

            /* 설명. Product의 모든 필드를 초기화하는 생성자로 인스턴스 생성 후 정보 출력 */
            Product product2 = new Product("S-01234", "삼성", "갤럭시Z폴드2", 2398000, new java.util.Date());
            System.out.println(product2.getInformation());

            /* 설명. Computer 기본생성자로 인스턴스 생성 후 정보 출력 */
            Computer computer1 = new Computer();
            System.out.println(computer1.getInformation());

            /* 설명. Computer 모든 필드를 초기화하는 생성자로 인스턴스 생성 후 정보 출력 */
            Computer computer2 = new Computer("퀼컴 스냅드래곤", 512, 12, "안드로이드");
            System.out.println(computer2.getInformation());

            /* 설명. Computer 부모필드도 함께 초기화하는 생성자로 인스턴스 생성 후 정보 출력 */
            Computer computer3 =
                    new Computer("S-01234", "삼성", "갤럭시Z폴드2", 2398000, new java.util.Date()
                            , "퀼컴 스냅드래곤", 512, 12, "안드로이드");
            System.out.println(computer3.getInformation());
        }
    }

