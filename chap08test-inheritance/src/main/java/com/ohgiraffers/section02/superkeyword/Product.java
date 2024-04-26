package main.java.com.ohgiraffers.section02.superkeyword;

public class Product {
    private String code;
    private String brand;
    private String name;
    private int price;
    private Date manufacturingDate;

    /*설명 기본생성자*/
    public Product() { System.out.println("Product 클래스를 기본생성자로 호출함");}

    /*설명. 모든 필드를 초기화하는 생성자 */
    public product(String code, String brand, String name, int price, Date manufacturingDate){

     /* 설명.
     * 아무 클래스도 상속받지 않았는데 super()가 호출된다.
     * java.lang.object 클래스의 생성자를 호출하는 것이다.
     * 모든 클래스는 Object 클래스의 후손이기 때문이다.
     *
     */
     super();

     this.code = code;
     this.brand = brand;
     this.name = name;
     this.price = price;
     this.manufacturingDate = manufacturingDate;

     System.out.println("Product 클래스의 매개변수 있는 생성자 호출함...");

    }
    /* 설명. setter/getter */
    public void setCode(String code) { this.code = code; }

    public void SetBrand(String brand) { this.brand = brand; }

    public void setName(String name) { this.name =name; }

    public void setPrice(int pricce) { this.price = price; }

    public void setManufacturingDate(Date manufacturingDate) { this.manufacturingDate = manufacturingDate; }

    public String getCode() { return code; }

    public String getBrand() { return brand; }

    public String getName() { return name; }

    public int getprice() { return price; }

    public Date getManufacturingDate() { return manufacturingDate; }

    /* 설명. 모든 필드 값을 문자열로 반환하는 메소드 */
    public String getInformation() {
        return "Product [code=" + code + ", brand=" + brand + ", name=" + name +",price=" + price +",munufacturingDate=" + manufacturingDate +"]";


    }

}
