package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For

        // 나코 매장
        System.out.println("어서오세요, 나코입니다.");
        // 또 손님이 들어오면?
        System.out.println("어서오세요, 나코입니다.");
        System.out.println("어서오세요, 나코입니다.");
        //alt를 누른 상태로 드래그하면 여러 줄의 같은 자리 드래그 가능

        // 인사법이 바뀌면
        System.out.println("환영합니다, 나코입니다.");

        // 매장 이름이 바뀌면? 나코 -> 코나
        System.out.println("환영합니다. 코나입니다.");

        // 반복문 사용 For
        System.out.println("-----반복문 사용-----");
        // for( 선언 ; 조건 ; 증감 ){ }
        for(int i = 0; i < 10; i++){
            System.out.println("안녕 나는 소진이야");
        }

        // 짝수만 출력
        for(int i=0 ; i<10 ; i+=2){
            System.out.print(i);    // println의 경우 줄바꿈, print의 경우 줄바꿈 X
            System.out.println();
        }

        //홀수만 출력
        for(int i=1 ; i<10 ; i+=2){
            System.out.print(i);
        }
    }
}
