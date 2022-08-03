package kr.or.ksmart.A;

public class AA2 {

    public static void main(String[] args) {
        //회원관리클래스(user) 통해서 객체 생성 (3명의 회원관리 )

        // 클래스 datatype(ex.User) 으로 객체참조변수 (ex.u01)를 생성하고
        // 생성자 메서드 (ex.new User()) 를 통해 객체를 생성하고 생성된 객체의 주소를 객체 참조변수에 할당한다.
        User u01 = new User();  // User 클래스를 통해 참조변수 u01을 선언 & 생성자 메서드(클래스와 이름 동일해야함)를 통해 객체가 생성되고 주소가 할당됨
        Goods g01 = new Goods();
        Order o01 = new Order();

        System.out.println(u01 + "<-----u01 주소값");
        System.out.println(g01 + "<--g01 주소값 ");
        System.out.println(o01 + "<--o01 주소값");

//        --------
//        user 정보
        user_print(u01);
        u01.uid = "id001";  // 객체참조변수(u01)을 이용하여 생성된 객체 안의 변수에 값을 대입한다.
        u01.uphone = "001-0001";
        u01.us = '남';
        u01.uage = 20;
        u01.ulevel = "구매자";
        user_print(u01);
//        객체참조변수(u01) 를 user_print메서드의 입력값으로 하여 객체 참조변수 안에 있는
//        생성된 객체의 주소값을 메서드의 입려값으로 한다.

//        --------
//        goods 정보
        goods_print(g01);
        g01.pcode = "p001";
        g01.uid = u01.uid;
        g01.pname = "노트북";
        g01.pnormal = 2000000;
        g01.pdisc = 1500000;
        g01.pdetail = "SW 개발용";
        goods_print(g01);

//        ---------
//        order 정보
        order_print(o01);
        o01.ocode = "o001";
        o01.pcode = g01.pcode;
        o01.uid = u01.uid;
        o01.ocount = 10;
        o01.oprice = g01.pnormal;
        o01.ototal = o01.ocount * o01.oprice;
        o01.oaddress = "도곡동";

//        ----------




    }

//     주문관리 메서드 선언
    public static void order_print(Order geto) {
        System.out.println("-- 주문관리 시작 --");
        System.out.println("주문코드 " + geto.ocode);
        System.out.println("상품코드:" + geto.pcode);
        System.out.println("구매자아이디: " + geto.uid);
        System.out.println("구매수량:" + geto.ocount);
        System.out.println("구매단가:" + geto.oprice);
        System.out.println("결제예정금액:" + geto.ototal);
        System.out.println("받는주소:" + geto.oaddress);
        System.out.println("--주문관리 End--");
    }

//    상품조회 메서드 선언

    public static void goods_print(Goods getg) {
        System.out.println("-- 상품 정보 시작 --");
        System.out.println("상품코드: " + getg.pcode);
        System.out.println("판매자아이디:" + getg.uid);
        System.out.println("상품명:" + getg.pname);
        System.out.println("정상가:" + getg.pnormal);
        System.out.println("할인가:" + getg.pdisc);
        System.out.println("상세설명:" + getg.pdetail);
        System.out.println("-- 상품정보 End --");
    }

//      회원 조회 메서드 선언
//                      User getu = u01;   // 참조변수(u01)는 주소값을 가짐
//    User getu = kr.or.ksmart.A.User@1db9742
    public static void user_print(User getu) {
//        parameter(매개변수) geto의 data type 을 생성된 객체와 '같은 클래스'로 하고 생성된 객체의 주소값을 매개변수 getu에 대입한다
        System.out.println("-----회원정보 시작 -----");
        System.out.println("아이디: " + getu.uid);
//        paramener를 이용하여 생성된 객체안의 uid안에 있는 값을 불러온다.
        System.out.println("비번: " + getu.upw);
        System.out.println("전화번호: " + getu.uphone);
        System.out.println("성별: " + getu.us);
        System.out.println("나이: " + getu.uage);
        System.out.println("권한: " + getu.ulevel);
        System.out.println("-----회원정보 End-----");
    }

}

//     회원 조회 메서드 선언

