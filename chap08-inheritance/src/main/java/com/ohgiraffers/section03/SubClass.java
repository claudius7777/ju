package com.ohgiraffers.section03;

public class SubClass extends SuperClass {
    // 아래의 private 메소드는 자식에서 접근할 수 없는 메소드로 재정의가 불가능 하다.
    // private void privateMethod(){}
    //    fanal 메서드는 변경할 수 없다는 것을 의미하며 이로인해 재정의가 불가능하다.
    //    private final void finalMethod(){}


    @Override
    public void method(int num) {
        super.method(num);
    }


//    @Override 부모보다 접근 범위를 좁게 만들 수없다.
  //  protected void method(int num) {
    //    super.method(num);
    //}
//@Override 메서드의 시그니처가 다른 경우 오버라이드 불가능
//public void method(int num,int num2) {
//    super.method(num);
// }


//    @Override 반환타입이 다른 경우 오버라이딩 불가능
//    public String  method(int num) {
//        return "";
//    }


//    @Override 부모보다 더 넓은 범위의 예외를 처리할 수 없음
//    public void excetionMethod() throws Exception {
//        super.excetionMethod();
//    }


    @Override// runtimeException의 자식 클래스로 예외의 범위가 더욱 좁아서 가능하다.
    public void excetionMethod() throws NullPointerException {
        super.excetionMethod();
    }

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }
}


@Override