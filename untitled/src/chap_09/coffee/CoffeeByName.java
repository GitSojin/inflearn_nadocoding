package chap_09.coffee;

public class CoffeeByName {
    public Object name;     // Object 이기 때문에 Integer, Double, String, BlackBox ... 가능
    /*
    * 자바의 Object 클래스는 모든 객체의 최상위 부모 클래스이기 때문에 모든 객체 자료형을 받을 수 있다.
    * 기본 자료형은 객체가 아니기 때문에 직접적으로 Object 클래스에 저장할 수 없다.
    * 기본 자료형을 Object 에 넣고자 할 때는 해당 기본 자료형을 감싸는 Wrapper 클래스를 사용해야 한다.
    */
    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " + name);
    }
}
