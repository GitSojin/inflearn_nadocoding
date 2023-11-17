package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        System.out.println(b1.serialNumber);
/*
    생성자
    객체가 만들어질 때 자동으로 호출되는 메소드라고 보면 된다.
    어떤 동작을 명시해야 하는 등 초기화 작업 할 수 있다.
    보통 변수명 다음에 적어준다.
    클래스명과 똑같이 적어준다.
    반환형이 따로 없다.
    오버로딩처럼 여러 개를 만들 수 있다.
*/
        BlackBox b2 = new BlackBox();
        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);
        System.out.println(b2.serialNumber);
    }
}
