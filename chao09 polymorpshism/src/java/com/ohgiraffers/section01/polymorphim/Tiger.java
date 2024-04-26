package java.com.ohgiraffers.section01.polymorphim;

public class Tiger extends Animal {

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 뜯습니다.");

    }

    @Override
    public void run() {
        System.out.println("호랑이가 달리지 않습니다.");
    }

    @Override
    public void sleep() {
        System.out.println("호랑이가 울부짖습니다.");
    }

    public static void bite(){
        System.out.println("호랑이가 물어뜯습니다.");
    }
}
