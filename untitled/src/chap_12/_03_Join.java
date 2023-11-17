package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) {
        // 직원이 청소 다 했는지 확인하고나서 사장이 청소
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        // thread.join();
        // Alt + Enter -> try-catch 구문
        // 문제가 발생하면 해결해줄 수 있도록
        try {
            thread.join(2500);      //2.5 초 대기
            // join 에 시간 정보를 주게 되면
            // 일단 그 시간동안 기다려보는데
            // 그 시간동안 쓰레드가 끝나지 않으면 다음으로 넘어가게 된다.
        } catch (InterruptedException e) {

        }
        // 직원이 청소 끝나고 나서 사장이 청소 시작하는 것을 볼 수 있다.
        // join 의 역할은 위 코드가 실행될 때까지 기다렸다가 실행이 되고 나면 다음으로 넘어간다.
        // 근데 이러면 직원을 고용하는 이유가 없어진다.
        // 그래서 사장이 직원이 청소하는걸 어느정도 지켜보다가 잘 하는거 확인하고 중간에 사장도 청소 시작
        // cleanBoss() 메서드 for 문에서 Thread.sleep 추가

        cleanBoss();
    }

    public static void cleanBoss(){
        System.out.println("-- 사장 청소 시작 ==");
        for (int i = 1; i <= 10; i+=2) {        // 사장 홀수방 청소
            System.out.println("(사장) " + i + "번방 청소 중");
            // Thread.sleep(1000);
            // 위 코드 Alt + Enter 해줘서 try-catch 로 감싸주기
            try {
                Thread.sleep(1000);
                // sleep 만나면 지정 시간동안 멈추고 또 그 다음 방 청소하고 또 1초 하다가 멈추고 ..
                // 해당 코드 CleanRunnable 에도 넣어주기
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-- 사장 청소 끝 --");
    }

}
