package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // Wrapper 클래스
        // int, double, float, char 기본 자료형을 객체 형태로 만들어 사용할 수 있도록 해주는 역할
        Integer i = 123;
        Double d = 1.0;
        Character c = 'A';

        System.out.println(i.intValue());
        System.out.println(d.intValue());   // 실수를 int 로 형 변환
        System.out.println(c.charValue());

        System.out.println("-----------------");
        String s = i.toString();
        System.out.println(s);  //문자열 형태의 s 출력
    }
}
