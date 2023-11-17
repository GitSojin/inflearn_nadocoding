package chap_10;

public class _01_AnonymousClass1 {  // (A)
    public static void main(String[] args) {
        // 익명 클래스
        // 이름이 없는 클래스
        // 지금까지 클래스를 최상단위치(A)에 만들어오거나, 이 클래스와 똑같은 위치(B)에 만들어왔다.
        // 클래스도 다른 클래스 내부에 정의할 수 있다 -> 내부클래스 (Inner Class)
        // 내부 클래스라고 크게 다른 점은 없지만, 그 중 특별한 것이 익명 클래스

        Coffee c1 = new Coffee();
        c1.order("아메리카노");
        System.out.println("------------");

        Coffee c2 = new Coffee();
        c2.order("라떼");
        System.out.println("------------");

        // 굉장히 친한 친구 방문
        Coffee specialCoffee = new Coffee(){
            // specialCoffee 만을 위해서 order 라는 동작을 재정의
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("(귓속말) 딸기 케이크는 서비스다.");
            }

            @Override
            public void returnTray() {
                // super.returnTray();
                // 원래 내용 없애고싶으면 그냥 위에 부분 지워주면 됨
                System.out.println("(귓속말) 자리에 두면 내가 치울게.");
            }
        };
        specialCoffee.order("바닐라라떼");
        specialCoffee.returnTray();
    }
}
// 여기에 클래스 만들기도 했음 (B)

class Coffee {
    public void order(String coffee){
        System.out.println("주문하신 " + coffee + "나왔습니다.");
    }

    public void returnTray(){
        System.out.println("커피 반납이 완료되었습니다.");
    }
}