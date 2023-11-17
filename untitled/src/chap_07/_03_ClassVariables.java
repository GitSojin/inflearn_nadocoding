package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1. modelName = "까망이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2. modelName = "하양이";
        System.out.println(b2.modelName);

        // 특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println("- 개발 전 -");
        System.out.println(b1.modelName + "자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + "자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);
        // 클래스 변수이므로 클래스 명으로 접근하는 것이 일반적이다. (객체로 접근도 가능하지만..)
        // 클래스로부터 만들어진 객체에다가 공통적으로 적용해야되는 게 있을 경우 인스턴스가 아닌
        // 클래스로 접근하는 것도 좋은 방식이다.

        // 기능 개발
        BlackBox.canAutoReport = true;

        System.out.println("- 개발 후 -");
        System.out.println(b1.modelName + "자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + "자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);


    }
}
