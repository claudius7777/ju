package java.com.ohgiraffers.section01.book;

import java.util.HashMap;
import java.util.Map;

public class Library {//Library 클래스는 도서 렌탈을 관리하는 클래스입니다.
    private Map<String Book> books;
    public Library() {
        books = new HashMap<>();
    }
    public void addBook(String title,int rentalFee) {
        books.put(title, new Book(title,rentalFee));
    }
    public void rentBook(String title){
        Book book = books.get(title);
        if(book != null && !book.isRented()) {
            book.rent();
            System.out.println(title + "이(가) 대여되었습니다.대여비용은" + book.getRentalFee());
        } else{
            System.out.println("죄송합니다" + title + "은(는) 현재 대여중입니다.");
        }
    }

    public void returnBook(String title){
        Book book = books.get(title);
        if(book != null && !book.isRented()) {
            book.returnBook();
            System.out.println(title + "이(가) 반납되었습니다.");
        }else{
            System.out.println("죄송합니다." + title + "은(는) 대여중입니다");
        }
    }
}

