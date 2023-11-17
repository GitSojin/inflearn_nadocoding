package chap_12;

import chap_12.clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {
        // Runnable 과 Thread 는 크게 다르지 않다.
        // Thread 는 Thread 를 상속해서 구현하는 방법
        // Runnable 은 Runnable 인터페이스를 구현하는 방법

        // CleanRunnable 객체 만들어주기
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();
        // CleanRunnable 에 정의되어 있는 동작을 새로운 Thread 를 만들어서 동작하게 되는 것이다.

        cleanBoss();
        // 사장과 직원이 동시에 청소

        // 상속을 할 때는 단일 상속만 가능하다.
        // 하나의 부모 클래스만 가질 수 있는 것이다.
        // 그런데 CleanThread 가 다른 클래스도 상속하고 싶으면 그걸 가능하게 해주는 것이 인터페이스 개념인 것이다.
        // 인터페이스는 여러 개를 구현할 수 있다.
    }

    public static void cleanBoss(){
        System.out.println("-- 사장 청소 시작 ==");
        for (int i = 1; i <= 10; i+=2) {        // 사장 홀수방 청소
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }

}
