package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("김럭키");
        c2.ready();

        System.out.println("---------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();
        /*
         * 이 코드에서 CoffeeByName 클래스의 생성자는 Object 타입의 매개변수를 받고 있다.
         * 그래서 34는 int 타입의 기본 자료형이지만, 자동으로 Integer 클래스로 Boxing 되어서
         * Object 로 변환된다. ( AutoBoxing )
         * Java 에서는 기본 자료형과 그에 대응하는 Wrapper 클래스 간에 자동으로 변환을 수행할 수 있다.
         * 따라서 int 타입의 값이 Object 로 사용될 때 자동으로 Integer 로 변환되어 저장되고,
         * 컴파일러에서 자동으로 이러한 변환이 이루어지기 때문에 오류가 발생하지 않는다.
         * 즉, CoffeeByName 클래스의 생성자는 어떤 타입의 객체도 받을 수 있도록 선언되어 있기 때문에
         * 34가 Integer 로 AutoBoxing 되어 Object 로 전달되어도 문제가 없다.
         */

        CoffeeByName c4 = new CoffeeByName("장나무");
        c4.ready();

        /*
         * 그런데, 여기에는 한 가지 문제가 있다.
         * c3에는 정수가, c4에는 문자열이 들어갔다.
         * 우리가 커피 주문한 사람의 정보인 name 을 형 변환 없이 바로 가져오게 되면 오류가 발생하게 된다.
         */
        // int c3Name = c3.name;        오류 발생
        int c3Name = (int) c3.name;
        System.out.println(c3Name);
        String c4Name = (String) c4.name;
        System.out.println(c4Name);
        // 위와 같이 형변환을 해서 값을 잘 가져올 수 있지만,
        // 만약 개발자가 실수로 값을 아래와 같이 잘못 가져오게 되면
        // c4Name = (String) c3.name;
        // 코드를 실행하기 전까지는 코드를 잘못 작성했는지 알 수가 없다. ( 코드 실행 시 오류 발생 )
        // 이런 문제 해결을 위해 제네릭 클래스를 사용할 수 있다.

        System.out.println("---------------");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();

        Coffee<String> c6 = new Coffee<>("김소진");
        // String 으로 정의했기 때문에 문자열 외의 자료형을 ( ) 내부에 입력할 경우
        // 코드를 실행하기 전부터 오류가 발생한다.
        String c6Name = c6.name;
        // 형변환 없이 바로 이름 넣을 수 있다.
        System.out.println(c6.name);
        c6.ready();

        System.out.println("---------------");
        CoffeeByUser<User> c7 = new CoffeeByUser<User>(new User("소진"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("럭키"));
        c8.ready();


        // 때로는 T 값을 하나가 아닌 여러 개를 받고자 할 때,
        System.out.println("---------------");

        orderCoffee("진");
        orderCoffee(823915, "아샷추");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        // 값을 두개 이상 넣고자 할 때는 두 개 이상 넣어주면 된다.
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}
