package chap_04;

public class _01_If {
    public static void main(String[] args) {
        //조건문 If
        int hour = 10; //오전 10시
        if(hour > 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        //실행문이 한 줄일 경우 중괄호 생략 가능

        System.out.println("커피 주문 완료");


        //오후 2시 이전 , 모닝 커피 마시지 않은 경우?
        hour = 10;
        boolean morningCoffee = false;
//        if(hour < 14 && morningCoffee == false){
        if(hour < 14 && !morningCoffee){
            System.out.println("아이스 아메리카토 + 1");
        }
        System.out.println("커피 주문 완");
    }
}
