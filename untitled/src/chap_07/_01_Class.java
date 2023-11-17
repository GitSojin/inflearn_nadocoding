package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍(OOP : Object-Oriented Programming)
        // 유지보수 용이
        // 높은 재사용성

        // 차량용 블랙박스
        // 모델명, 해상도, 가격, 색상
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";

        // 새로운 제품을 개발
        String modelName2 = "하양이";
        //... 제품을 만들 때마다 새롭게 정의해서 만들면 비효율적.. 이럴 때 class를 활용할 수 있다.

        BlackBox bbox = new BlackBox();
        // BlackBox 클래스로부터 bbox 객체 생성
        // bbox 객체는 BlackBox 클래스의 인스턴스
        // 클래스는 설계도, 객체는 그 설계도로부터 만들어진 결과물로 생각하면 된다.
        // 하나의 클래스로 여러 개의 인스턴스 만들 수 있다.
    }
}
