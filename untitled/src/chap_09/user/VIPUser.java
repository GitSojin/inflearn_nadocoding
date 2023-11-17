package chap_09.user;

public class VIPUser extends User{

    public VIPUser(String name) {
        super("특별한 " + name);
        // super 키워드는 자바에서 부모 클래스의 멤버를 참조하는 데 사용된다.
        // super 를 사용하여 부모 클래스의 생성자, 멤버 변수, 또는 메서드에 접근할 수 있다.
        // super("특별한 " + name); 은 'User' 클래스의 생성자를 호출하면서
        // "특별한"과 함께 전달된 name 을 인자로 넘겨준다.
        // VIPUser 객체가 생성될 때, User 클래스의 생성자도 함께 호출되어 초기화된다.
    }
}
