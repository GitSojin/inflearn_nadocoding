package chap_12.clean;

public class CleanThread extends Thread {
    // 동시에 여러 작업을 한번에 하기 위해 쓰레드를 사용한다.
    // 쓰레드를 사용하기 위해서는 상속을 해주어야 한다.
    // run 메소드를 정의해준다.
    public void run() {
        System.out.println("-- 직원 청소 시작(Thread) --");
        for (int i = 2; i <= 10; i += 2) {    // 짝수방, 홀수방 나눠서 청소하기로 함 (직원이 짝수방)
            System.out.println("(직원) " + i + "번방 청소 중(Thread)");
        }
        System.out.println("-- 직원 청소 끝(Thread) --");
    }
}