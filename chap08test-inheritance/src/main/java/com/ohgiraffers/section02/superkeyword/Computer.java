package main.java.com.ohgiraffers.section02.superkeyword;

public class Computer extends Product {

    // 설명. Computer는 하나의 Product이지만, 모든 Product는 Computer가 아니다.(IS-A)



    private String cpu; //cpu
    private String hdd; //hdd
    private String ram;// ram
    private String operatingSystem; //운영체제

    /* 설명. 기본생성자*/
    public Computer() {

        System.out.println("Computer 클래스의 기본 생성자 호출함...")
    }

    /* 설명. 모든 필드를 초기화하는 생성자 */
    public Computer(String cpu, int hdd, int ram, String operationSystem){

        /* 설명 부모클래스의 기본 생성자 호출 */
        super();

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operationSystem;

        System.out.println("Computer 클래스의 모든 필드를 초기화하는 생성자 호출함..");
    }

    /* 설명. 부모의 필도도 모두 초기화하는 생성자 */
    public Computer(String code, String brand, String name, int price, Date manufacturingDate,
                    String cpu, int hdd, int ram, String operationSystem)

        /* 설명.나머지 필드를 초기화*/
    // this(cpu,hdd,ram,operationSystem;)//에러남

    /*설명.
    * 위처럼 하고 싶지만 this9)로 위체 작성한 생성자를 호출한다는 의미는
    * super9)를 두번 호출하는 것과 같기 때문에 허용되지 않는다.
    * 부모 인스턴스를 두 개 생성할 수 없기 때문에 부모 생성자는 한 번만 호출 가능하다.
    * */

    /*설명. 나머지 필드는 그냥 작성함 */
    this.cpu = cpu;
    this.cpu = hdd;
    this.ram = ram;
    this.operationSystem = operationSystem;

    System.out.println("Computer 클래스의 부모 필드도 초기화 하는 생성자 호출함...");
}
/*설명.
* setter와 getter는 부모 필드의 메소드에 대해서는 자신의 것 처럼 사용가능하다.
* 따로 작성할 필요 없이 부모클래스에 작성한 것을 사용할 수있다.
* 따라서 잓식클래스에 추가된 필드에 대해서만 setter/getter를 작성하면 된다.
* */
public void setCpu(String cpu){ this.cpu = cpu; }

public void setHdd(int hdd) { this.hdd = hdd; }

public void setRam(int ram) { this.ram = ram; }

public void setOperationSystem(String operationSystem) { this.operationSystem = operationSystem;}

public String getCpu() { return cpu; }

public int getHdd() { return hdd; }

public int getRam() { return ram; }

public String getOperationSystem() { return operationSystem; }

//설명. product 클래스에 작성한 getInformation클래스를 오버라이딩 해서 작성한다.

@Override
public String getInformation(){

    /* 설명.
    * 부모클래스에 작성한 getter를 이용해서 부모 필드가 가진 값도 한번에 문자열 합치기 한다.
    * 부모가 가진 메버는 super과 this 둘 다 사용이 가능하다/
    * 하지만 코드의 의미를 명확하게 하기 위해 super을 사용하는 것이 좋다.
    * */
   /* return "Computer["
        +"code=" + super.getCode()
        +",brand=" + super.getBrand()
        +",name=" +super.getName()
        +",price=" + super.getPrice(0
        +",manufacturingDate=" + super.getManufacturingDate()
        +",cpu=" +this .cpu
        +",hdd=" + this.hdd
        +",ram=" + this.ram
        +",operationSystem=" + this.operationSystem
        + "]";

        /*설명.
        *Computer에 있는 getInformation()에서 이미 작성해둔 필드를 문자열로 반환하는 내용이 있다.
        *오버라이딩을 하지만 부모클래스에 작성한 메소드르 호출해서 반환받은 문자열에
        * 현재 클래스의 필드값을 추가로 덧붙여 반환해보자
        * */

    /*설명.
    *super.getInformation() : 정상적으로 부모의 메소드 호출
    * this.getInformation() : 재귀호출 이러나며 stackOverflow발생
    * getInformation()      : this. 이 자동추가되어 재귀 호출 일어남
    * 따라서 이런경우 super.을 명시적으로 사용해야 한다.
    *
     */
    return super.getInformation()
            + "Compputer ["
            + "cpu=" + this.cpu
            + ",hdd=" + this.hdd
            + ",ram=" + this.ram
            +",operationSystem=" + this.getOperationSystem
            +"]";
        }




