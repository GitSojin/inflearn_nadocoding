package chap_12;
/*
public class _05_Synchronization {
    public static void main(String[] args) {
        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("-- 직원 1 청소 시작 --");
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println("(직원1) " + i + "번방 청소 중");
                }
                System.out.println("-- 직원1 청소 끝 --");
            }
        };

        // 직원 2 람다식으로 만들어보기
        Runnable cleaner2 = () -> { // 직원 1의 run() 메서드에서 아무것도 안 받고 있으므로 ()
            System.out.println("-- 직원 2 청소 시작 --");
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("(직원2) " + i + "번방 청소 중");
            }
            System.out.println("-- 직원2 청소 끝 --");
        };

        // 직원 두 명이므로 쓰레드 두 개 만들어서 실행해보자
        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);

        cleanerThread1.start();
        cleanerThread2.start();

    }
}*/
// 위와 같이 실행하니 방이 순서대로 청소되지 않고 뒤죽박죽 청소를 수행하게 됨.
// 그래서 두 직원이 동시에 청소를 하는데, 짝수 홀수방 청소하는 것이 아닌 1번 방부터 차례대로 같이 청소하자

import chap_12.clean.Room;

// 새로운 클래스 하나 만들어서 각 직원이 5개의 방을 청소하기로 하자.
public class _05_Synchronization {
    public static void main(String[] args) {
        Room room  = new Room();

        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("-- 직원 1 청소 시작 --");
                for (int i = 1; i <= 5; i ++) {
                    room.clean("직원1");
                }
                System.out.println("-- 직원1 청소 끝 --");
            }
        };

        // 직원 2 람다식으로 만들어보기
        Runnable cleaner2 = () -> { // 직원 1의 run() 메서드에서 아무것도 안 받고 있으므로 ()
            System.out.println("-- 직원 2 청소 시작 --");
            for (int i = 1; i <= 5; i ++) {
                room.clean("직원2");
            }
            System.out.println("-- 직원2 청소 끝 --");
        };

        // 직원 두 명이므로 쓰레드 두 개 만들어서 실행해보자
        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);

        cleanerThread1.start();
        cleanerThread2.start();
        // 두 개 이상의 쓰레드에서 동시에 하나의 변수에 접근해서 값을 업데이트 하려고 하면
        // 동시에 같은 방 청소 하게 될 수 있다.
        // 이럴 때 필요한 것이 동기화
        // 동기화 : 한 쓰레드가 메서드에서 작업하고 있을 때 다른 쓰레드가 동시에 진입해서 작업하는 것 방지
        // synchronized
    }
}

// 두 개의 쓰레드를 실행하던 중 하나의 쓰레드에 문제가 발생하더라도 다른 쓰레드에까지 영향을 미치지는 않음