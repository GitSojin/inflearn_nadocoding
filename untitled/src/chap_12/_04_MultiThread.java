package chap_12;

public class _04_MultiThread {
    public static void main(String[] args) {
        // 멀티 쓰레드
        // 쓰레드가 여러 개
        // 직원을 두명 쓰기로 했다.
        // 메인 메서드 내에서 익명 클래스를 통해 만들어보기

        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("-- 직원 1 청소 시작 --");
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println("(직원1) " + i + "번방 청소 중");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                System.out.println("-- 직원1 청소 끝 --");
            }
        };

        // 직원 2 람다식으로 만들어보기
        Runnable cleaner2 = () -> { // 직원 1의 run() 메서드에서 아무것도 안 받고 있으므로 ()
            System.out.println("-- 직원 2 청소 시작 --");
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("(직원2) " + i + "번방 청소 중");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            System.out.println("-- 직원2 청소 끝 --");
        };

        // 직원 두 명이므로 쓰레드 두 개 만들어서 실행해보자
        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);

        cleanerThread1.start();
        cleanerThread2.start();
        // 익명 클래스와 람다식 사용해서 두 개의 러너블 객체를 정의해서 쓰레드 두 개 만들어 동시 실행
    }
}
