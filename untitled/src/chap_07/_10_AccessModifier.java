package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 접근 제어자
        // private : 해당 클래스 내에서만 접근 가능
        // public : 모든 클래스에서 접근 가능
        // default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키지 내에서, 다른 패키지일 경우는 자식 클래스에서 접근 가능

        // 캡슐화 : 서로 연관된 것들끼리만 하나의 캡슐에 담는다는 의미
        // 정보은닉 : 정보를 숨기는 것. ( 직접적인 접근 막기.. )

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
//        b1.resolution = "FHD";
        b1.color = "블랙";

        b1.setPrice(-5000);
        System.out.println("가격 : " + b1.getPrice() + "원");

        System.out.println("-----------");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-200000);
        b2.color = "화이트";

    }
}
