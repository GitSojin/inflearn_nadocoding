package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser <T extends User>{
    // 어떤 형태의 타입을 써도 상관 없지만, User 를 상속하는 T만 사용 가능하다.
    // User 클래스 또는 User 를 상속하는 VIPUser 만 받을 수 있다.
    // 모든 값을 다 받지 않고 특정한 값들을 받고자 할 때 사용 가능하다.
    public T user;
    public CoffeeByUser(T user){
        this.user = user;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }

}
