package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 쓰레드
        // 우리가 만드는 프로그램을 실행시키면, 실행되는 상태를 프로세스라고 한다.
        // 프로세스의 자원을 이용해서 작업을 수행하는 것을 쓰레드라고 한다.
        // 일반적으로 만드는 프로그램은 하나의 프로세스 내에서 하나의 쓰레드가 수행된다.
        // 프로세스는 여러 개의 쓰레드를 가질 수 있지만 따로 쓰레드 처리를 해주지 않는다면
        // 일반적으로 하나의 프로세스는 하나의 쓰레드를 갖는다.

       // cleanBySelf();      // 순서대로 코드가 실행된다.
        // 시간이 너무 오래 걸려서, 직원과 나눠서 호텔방을 청소하도록 해보자.
        // 1 3 5 7 9        방구조
        // 2 4 6 8 10
        // 청소하는 사람 2명, 한 사람을 하나의 쓰레드라고 생각하자.

        // 직원이 청소하도록 쓰레드 만들기
        CleanThread cleanThread = new CleanThread();
        cleanThread.run();
        cleanBoss();        // 출력해보면 동시에 수행하는 것이 아닌 순서대로 수행하는 것을 볼 수 있음
        // 쓰레드를 만들어서 수행할 때 run 메소드를 직접 호출하면 쓰레드 내의 메서드를 수행하는 것 뿐임
        // start 를 하면 새로운 쓰레드를 만들어서 run 작업이 일어난다.
        // 쓰레드가 각각 동시에 수행된다.
        System.out.println("-----------------");
        cleanThread.start();
        cleanBoss();
        // 실행해보면 수행이 섞여서 이루어지는 것을 볼 수 있다.
    }
    public static void cleanBySelf(){
        System.out.println("-- 혼자 청소 시작 ==");
        for (int i = 1; i <= 10; i++) {
            System.out.println("(혼자) " + i + "번방 청소 중");
        }
        System.out.println("-- 혼자 청소 끝 --");
    }

    public static void cleanBoss(){
        System.out.println("-- 사장 청소 시작 ==");
        for (int i = 1; i <= 10; i+=2) {        // 사장 홀수방 청소
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
