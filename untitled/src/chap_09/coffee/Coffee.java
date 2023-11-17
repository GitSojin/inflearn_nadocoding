package chap_09.coffee;

public class Coffee <T>{
    public T name;      // 이게 어떤 타입인지 아직 모름

    public Coffee(T name) {
        this.name = name;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " + name);
    }
}
