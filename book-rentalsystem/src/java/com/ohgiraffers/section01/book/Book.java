package java.com.ohgiraffers.section01.book;
//book 클래스는 도서정보를 담는 클래스입니다.도서대여비용은 1000원으로 통일했습니다.
public class Book {
     private String title;
     private boolean isRented;
     private int rentalFee;//대여비용


     public Book(String title,int rentalFee){
         this.title =title;
         this.isRented = false;
         this.rentalFee = rentalFee;
     }
    public String getTitle(){
         return title;
    }

    public boolean isRented(){
         return isRented;

    }

    public int getRentalFee(){
         return rentalFee;
    }
    public void rent() {
         isRented = true;
    }
    public void returnBook() {
         isRented = false;
    }
}
