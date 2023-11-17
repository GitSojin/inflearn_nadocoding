package chap_09.coffee;

public class CoffeeByNumber {
    public int waitingNumber;   // 대기 번호 저장 변수

    // 대기 번호 값을 받는 생성자
    public CoffeeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " + waitingNumber);
    }
}
