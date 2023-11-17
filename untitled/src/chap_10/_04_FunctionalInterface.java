package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        converter.convert(1);
        System.out.println("--------------");


        // 람다식 사용을 통헤 변수처럼 메서드 호출하면서 전달
        convertUSD((USD)->{
            System.out.println(USD + "달러는 " + (USD*1400) + "원임");
        },2);
        System.out.println("--------------");

        // 함수형 인터페이스
        // 함수형 인터페이스를 사용하려면 인터페이스에 단 하나의 추상 메서드가 존재해야 한다.
        // 인터페이스의 동작과 코드가 1:1로 연결되기 때문에 두 개 이상이면 안 된다.
        // 만약 두 개를 정의했다면 어떤 메서드와 람다식이 연결되는지 알 수 없기 때문에
        // 오류 발생할 수 있다.
        // 오류 발생 없애기 위해 위에 @FunctionalInterface 작성해줌으로써
        // 함수형 인터페이스 쓸거야 하고 컴파일러에게 알려줄 수 있다.
        // 두 개의 추상 메서드 정의하면 오류가 발생한다.
        Convertible convertible = (USD)->System.out.println(USD + "달러 -> " + (USD*1400) + "원");
        convertUSD(convertible,3);
        System.out.println("--------------");

        // 전달값이 하나도 없다면 어떻게 처리할까?
        // 위에서는 (USD) 값을 받아서 처리 했었는데, 만약 없다면 어떻게 할까?
        // 그냥 괄호 열고 닫고 해주면 된다.
        ConvertibleWithNoParams c1 = () -> System.out.println("1달러 = 1400원");
        c1.convert();
        System.out.println("--------------");

        // 전달값이 두 개인 경우
        ConvertibleWithTwoParams c2 = (D,W) -> {
            System.out.println(D + "달러 = " + W*D + "원");
        };
        c2.convert(10,1400);
        System.out.println("--------------");

        // 반환값이 있는 경우
        ConvertibleWithReturn c3 = (d,w) -> d*w;
        int result = c3.convert(20,1400);
        System.out.println("20달러 = " + result + "원" );
    }

    public static void convertUSD(Convertible converter, int USD){
        converter.convert(USD);
    }
}
