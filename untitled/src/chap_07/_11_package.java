package chap_07;

import java.util.Random;

public class _11_package {
    public static void main(String[] args) {
        // 페키지 : 폴더 개념 / 연관된 클래스들을 묶어둔 것
        // 랜덤 클래스
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt());
        // int 의 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10));
        // 0 이상 10 미만의 정수형 값 반환
        System.out.println("랜덤 실수 : " + random.nextDouble());
        // 0.0 이상 1.0 미만
        // double 의 경우는 범위 지정 불가능
        // 5.0 이상 10.0 미만 실수 뽑고 싶다면
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) " + (min + (max-min)* random.nextDouble()));

        System.out.println("랜덤 boolean : " + random.nextBoolean());

        // 로또 번호 랜덤으로 뽑으려면? 1~45
        System.out.println("로또 번호 : " + (random.nextInt(45) + 1));
    }
}
