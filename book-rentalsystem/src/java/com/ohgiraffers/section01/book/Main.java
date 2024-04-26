package java.com.ohgiraffers.section01.book;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("자바입문서",1000);
        library.addBook("퍼스트 자바",1000);


        //도서대여
        library.rentBook("자바입문서");
        library.rentBook("퍼스트 자바");
        library.rentBook("자바 참 쉽죠");//존재하지 않는 도서

        //도서반납
        library.returnBook("자바입문서");
        library.returnBook("퍼스트 자바");
        library.returnBook("자바 참 쉽죠");//존재하지 않는 도서
    }
}
