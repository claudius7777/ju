package main.java.com.ohgiraffers.section03;

public class SubClass extends SuperClass {
    /*
     *아래의 private 메소드는 자식에게 접근할 수 없는 메소드로 재정의가 불가능하다.
     * private void privateMethod(){}
     * final 메서드는 변경할 수 없다는 것을 의미하며 이로인해 저정의가 불가능하다.
     * private final, void finalMethod(){}
     */
    @Override
    public void method(int num) {
        super.method(num);
    }

    /*
     *@Override 부모보다 접근범위를 좁게 만들 수 없다.
     * protected void method(int num) {
     *   super.method(num);
     * }
     *
     * @Overrride 메서드의 시그니처가 다른 경우 오버라이드 불가능
     * puvlic void method(int num, int num2) {
     *   super.method(num);
     * }
     *
     * @Override 반환타입이 다른 경우 오버라이딩 ㅣ불가능
     * public String method(int num) {
     *   return "";
     * }
     *
     *
     * @Override 부모보다 더 넓은 범위의 예외를 처리할 수 없음
     * puvlic void exceptionMethod(0 throws Exception {
     *       super.exceptionMethod();
     * }
     */


    @Override // rumtimeException의 자식 클래스로 예외의 범위가 더욱 좁아서 가능하다.
    public void exceptionMethod() throws NullPointerException
        super.

    exceprionMethod();
}
@Override
protected void protectedMethod() { super.protocteMethod(); }

}


